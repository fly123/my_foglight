/*
  Copyright 2012 Quest Software, Inc.
  ALL RIGHTS RESERVED.

  This software is the confidential and proprietary information of
  Quest Software Inc. ("Confidential Information").  You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered
  into with Quest Software Inc.

  QUEST SOFTWARE INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
  THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
  INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
  NON-INFRINGEMENT. QUEST SOFTWARE SHALL NOT BE LIABLE FOR ANY
  DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
  OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */  

package com.quest.agent.urlmonitor;


import com.quest.agent.urlmonitor.samples.*;
import com.quest.glue.api.services.*;

import java.io.*;   
import java.net.*;  
import java.util.*;
import com.quest.agent.urlmonitor.URLMonitorAgentPropertyWrapper.UrlList;
import com.quest.glue.api.services.TopologyDataSubmissionService3.TopologySubmitter3;








/**
 * The core implementation class of the URLMonitorAgent agent.
 */ 
public class URLMonitorAgentImpl implements com.quest.glue.api.agent.Agent,                                                                             
                                              URLMonitorAgentCollectors,
 
                                              ASPPropertyListener
{

private final LogService.Logger mLogger;
private final RegistrationService mRegistrationService;
private final URLMonitorAgentSupportBundle mBundle;

private final URLMonitorAgentDataProvider mDataProvider;


private URLMonitorAgentPropertyWrapper mWrapper;
private final ASPService3 mASPService;
private final UnitService mUnitService;
private final TopologySubmitter3 mSubmitter;






/**
 * Called by FglAM to create a new instance of this agent. This constructor is required
 * by FglAM and must be present.
 *
 * @param serviceFactory Factory used to create services for this agent
 */
public URLMonitorAgentImpl(ServiceFactory serviceFactory) throws ServiceFactory.ServiceNotAvailableException {
    this(serviceFactory, new URLMonitorAgentDataProviderImpl(serviceFactory)); 
}

/**
 * Creates a new instance of this agent using to provided class to collect all
 * necessary data for submission. This allows the data provided to be swapped out or
 * mocked up during unit tests.
 * <p/>
 * This is an example of one possible way to structure the agent, but it is not the only
 * way. You are free to change or remove this constructor as you see fit.  
 *
 * @param serviceFactory Factory used to create services for this agent
 * @param dataProvider The class to use to obtain all data for submission.
 */
/*pkg*/ URLMonitorAgentImpl(ServiceFactory serviceFactory, URLMonitorAgentDataProvider dataProvider) 
                                                throws ServiceFactory.ServiceNotAvailableException {
	
	
	
	mASPService = serviceFactory.getService(ASPService3.class);
	mSubmitter = serviceFactory.getService(TopologyDataSubmissionService3.class).getTopologySubmitter();
	mUnitService = serviceFactory.getService(UnitService.class);
	mWrapper = new URLMonitorAgentPropertyWrapper(mASPService);
	
	
	
    LogService logService = serviceFactory.getService(LogService.class);
    mLogger = logService.getLogger(URLMonitorAgentImpl.class);          

    mDataProvider = dataProvider;

    mRegistrationService = serviceFactory.getService(RegistrationService.class);
    // This will automatically register all the service-related listeners
    // implemented by this class.
    mRegistrationService.registerAllListeners(this);

    // This hooks the URLMonitorAgent up to the support bundle framework and
    // and allows it to contribute information to the support bundle.
    mBundle = new URLMonitorAgentSupportBundle(this);
    mRegistrationService.registerAllListeners(mBundle);

    // Log some basic info to indicate that the agent has been created
    mLogger.log("agentVersion", "URLMonitorAgent", "1.0.0");
}

/**
 * Called by FglAM at the end of the agent's life
 */
@Override
public void destroy() {
    mRegistrationService.unregisterAllListeners(this);
    mRegistrationService.unregisterAllListeners(mBundle);
}

/**
 * Called by FglAM to begin data collection.
 * <p/>
 * Since there are data collector(s) defined for this agent, taking action as a result
 * of this method call is optional. Each data collector method will be called by FglAM
 * when it is scheduled.
 
 */
@Override
public void startDataCollection() {
    mLogger.debug("Data collection started");
}

/**
 * Called by FglAM when data collection should be stopped.
 * <p/>
 * Since there are data collector(s) defined for this agent, taking action as a result
 * of this method call is optional.
 */
@Override
public void stopDataCollection() {
    mLogger.debug("Stopping data collection");
}

/**
 * Respond to property changes.
 * <p/>
 * This method is part of the ASPPropertyListener interface and is not required
 * by agents that do not implement it.
 * <p/>
 * Agents can receive property changes while they are running, and it is up to
 * the agent developer to ensure that modifications do not break the agent.
 */
public void propertiesChanged() {
    mLogger.debug("Property change notification received");
}

/**
 * URL Collector Data Collector
 * 
 * @param collectionFreqInMs the collection frequency for this collector, in ms.
 */
@Override
public void collectURLs(long collectionFreqInMs) {
    mLogger.debug("URL Collector collector invoked");
    
    
  //collect data
    ModelRoot root = collect();
    //submit data
    submitData(collectionFreqInMs, root);
    
}


private void collectURL(UrlList url, AgentRoot agentRoot) {
	String hostname = url.getHostname();
	int port = url.getPort();
	String path = url.getUrl();
	URLPath urlPath = new URLPath(path, "http");
	Host host = new Host(hostname);
	URLServerInstance instance = new URLServerInstance(host , port);
	MonitoredURL monitoredURL = new MonitoredURL(urlPath, instance);
	URL u = null;
	StringBuilder builder = new StringBuilder();
	builder.append("http");
	builder.append("://");
	builder.append(hostname);
	builder.append(port == 80 ? "" : ":" + port);
	builder.append(path.startsWith("/")? path: "/" + path);
	try {
	u = new URL(builder.toString());
	} catch (MalformedURLException e) {
	}
	if (url != null) {
	try {
	HttpURLConnection conn = null;
	monitoredURL.setAvailability(0.0);

	long before = System.currentTimeMillis();
	conn = (HttpURLConnection) u.openConnection();
	long end = System.currentTimeMillis();
	monitoredURL.setResponseTime(new Double(end - before));
	before = System.currentTimeMillis();
	conn.connect();
	end = System.currentTimeMillis();
	monitoredURL.setPageGetTime(new Double(end - before));
	monitoredURL.setErrorCode(new Double(conn.getResponseCode()));
	if (monitoredURL.getErrorCode().equals(200.0)) {
	monitoredURL.setAvailability(100.0);
	}
	//add to root
	agentRoot.getInstances().add(monitoredURL);
	} catch (IOException e) {
	mLogger.debug2("error occurred while open connection with url "
	+ url.toString(), e);
	}
	}
}

	private void submitData(long collectionFreqInMs, ModelRoot root) {
		if (root != null) {
			long timestamp = System.currentTimeMillis();
			try {
				root.submit(mSubmitter, mUnitService, collectionFreqInMs,
						timestamp);
			} catch (TopologyException e) {
				mLogger.debug("error occurred while submit date", e);
			}
		}
	}



	private ModelRoot collect() {
		AgentRoot agentRoot = new AgentRoot("AgentRoot");
		// TODO: collect data and populate the data collected to model(topology)
		List<UrlList> urlList = mWrapper.getUrlList();
		if (null != urlList) {
			for (UrlList url : urlList) {
				collectURL(url, agentRoot);
			}
		}
		return agentRoot;
	}



}