
package com.quest.agent.urlmonitor.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.samples.IsIdentity;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the MonitoredURL topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class MonitoredURL
    extends TopologyObject
{

    public final static String NODE_NAME = "MonitoredURL";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final URLPath _urlPath;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final URLServerInstance _urlServerInstance;
    private Host _monitoredHost;
    private Agent _monitoringAgent;
    private SampleMetric _availability;
    private SampleMetric _pageGetTime;
    private SampleMetric _responseTime;
    private SampleMetric _errorCode;
    private String _name;

    public MonitoredURL(URLPath urlPath, URLServerInstance urlServerInstance) {
        if (urlPath == null) {
            throw new NullPointerException("The required identity property 'urlPath' cannot be null");
        }
        _urlPath = urlPath;
        if (urlServerInstance == null) {
            throw new NullPointerException("The required identity property 'urlServerInstance' cannot be null");
        }
        _urlServerInstance = urlServerInstance;
    }

    /**
     * Resets all <strong>non-identity</strong>fields to null.
     * Fields that are themselves topology objects are not null'ed out,
     * but do have their resetNonIdentity() methods called.
     * 
     */
    @Override
    public void reset() {
        if (_resetting == true) {
            return ;
        }
        _resetting = true;
        if (!(_monitoredHost == null)) {
            _monitoredHost.reset();
        }
        if (!(_monitoringAgent == null)) {
            _monitoringAgent.reset();
        }
        _availability = null;
        _pageGetTime = null;
        _responseTime = null;
        _errorCode = null;
        _name = null;
        _resetting = false;
    }

    /**
     * Adds this topology sample using the provided node.
     * 
     * @param submitted
     *     Set of objects that have already been submitted
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    @Override
    protected void addToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    {
        
        // Mark this object as having been submitted.
        submitted.add(__getNodeId());
        
        // Add all the properties (included inherited properties)
        addPropertiesToNodeTree(currentNode, unitService, submitted);
    }

    /**
     * Adds the relevant portions of this topology sample using the provided node.
     * 
     * @param submitted
     *     Set of objects that have already been submitted
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    @Override
    protected void addPropertiesToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    {
        if (!(_urlPath == null)) {
            final TopologyNode _node10 = currentNode.createNode("urlPath");
            if (__isIdentity("urlPath")) {
                _node10 .setIsIdentity(true);
            }
            if (submitted.contains(_urlPath.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node10 .setRefId(_urlPath.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node10 .setTypeHint(_urlPath.__getNodeName());
                _node10 .setId(_urlPath.__getNodeId().toString());
                _urlPath.addToNodeTree(_node10, unitService, submitted);
            }
        }
        if (!(_urlServerInstance == null)) {
            final TopologyNode _node11 = currentNode.createNode("urlServerInstance");
            if (__isIdentity("urlServerInstance")) {
                _node11 .setIsIdentity(true);
            }
            if (submitted.contains(_urlServerInstance.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node11 .setRefId(_urlServerInstance.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node11 .setTypeHint(_urlServerInstance.__getNodeName());
                _node11 .setId(_urlServerInstance.__getNodeId().toString());
                _urlServerInstance.addToNodeTree(_node11, unitService, submitted);
            }
        }
        if (!(_monitoredHost == null)) {
            final TopologyNode _node12 = currentNode.createNode("monitoredHost");
            if (__isIdentity("monitoredHost")) {
                _node12 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoredHost.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node12 .setRefId(_monitoredHost.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node12 .setTypeHint(_monitoredHost.__getNodeName());
                _node12 .setId(_monitoredHost.__getNodeId().toString());
                _monitoredHost.addToNodeTree(_node12, unitService, submitted);
            }
        }
        if (!(_monitoringAgent == null)) {
            final TopologyNode _node13 = currentNode.createNode("monitoringAgent");
            if (__isIdentity("monitoringAgent")) {
                _node13 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoringAgent.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node13 .setRefId(_monitoringAgent.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node13 .setTypeHint(_monitoringAgent.__getNodeName());
                _node13 .setId(_monitoringAgent.__getNodeId().toString());
                _monitoringAgent.addToNodeTree(_node13, unitService, submitted);
            }
        }
        if (!(_availability == null)) {
            final TopologyNode _node14 = currentNode.createNode("availability");
            _availability.submit(_node14, unitService.getUnits("percent"));
        }
        if (!(_pageGetTime == null)) {
            final TopologyNode _node15 = currentNode.createNode("pageGetTime");
            _pageGetTime.submit(_node15, unitService.getUnits("millisecond"));
        }
        if (!(_responseTime == null)) {
            final TopologyNode _node16 = currentNode.createNode("responseTime");
            _responseTime.submit(_node16, unitService.getUnits("millisecond"));
        }
        if (!(_errorCode == null)) {
            final TopologyNode _node17 = currentNode.createNode("errorCode");
            _errorCode.submit(_node17, unitService.getUnits("count"));
        }
        if (!(_name == null)) {
            final TopologyValue _value18 = currentNode.createValue("name");
            _value18 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value18 .setIsIdentity(true);
            }
        }
    }

    /**
     * Determines if the provided property name is an identity property for this
     * class or any super-classes.
     * 
     */
    @Override
    protected boolean __isIdentity(String name) {
        // The urlPath is an identity or required property for this class
        if ("urlPath".equals(name)) {
            return true;
        }
        // The urlServerInstance is an identity or required property for this class
        if ("urlServerInstance".equals(name)) {
            return true;
        }
        // not an ID field for this class, check super-classes
        return super.__isIdentity(name);
    }

    /**
     * Returns the unique node ID for this instance of this topology object.
     * 
     */
    @Override
    protected UUID __getNodeId() {
        return NODE_ID;
    }

    @Override
    public int hashCode() {
        return __getNodeId().hashCode();
    }

    @Override
    public boolean equals(java.lang.Object _obj) {
        if ((!(_obj == null))&&(_obj instanceof TopologyObject)) {
            final TopologyObject _otherObject = ((TopologyObject) _obj);
            return __getNodeId().equals(_otherObject.__getNodeId());
        } else {
            return false;
        }
    }

    /**
     * Submits this topology sample using the provided submitter
     * 
     * @throws Exception
     *     If there are any problems submitting the data for this class.If there are any problems submitting the data for this class.
     */
    public void submit(com.quest.glue.api.services.TopologyDataSubmissionService3 .TopologySubmitter3 submitter, UnitService unitService, long frequency, long timestamp)
        throws TopologyException
    {
        submitter.setTopologyFormat("5.5.5.1");
        final TopologyNode node = submitter.createTopLevelNode("__top_of_tree__", frequency);
        final TopologyNode _obj_root_node = node.createNode(__getNodeName());
        _obj_root_node.setId(__getNodeId().toString());
        final Set<UUID> submitted = new HashSet<UUID>();
        addToNodeTree(_obj_root_node, unitService, submitted);
        submitter.submit(timestamp);
    }

    /**
     * Submits this topology sample as a verified submission
     * using the provided submitter
     * 
     * @throws Exception
     *     If there are any problems submitting the data for this class.
     */
    public com.quest.glue.api.services.TopologyDataSubmissionService3 .VerifiedSubmission3 submitVerified(com.quest.glue.api.services.TopologyDataSubmissionService3 .TopologySubmitter3 submitter, UnitService unitService, long frequency, long timestamp)
        throws TopologyException
    {
        submitter.setTopologyFormat("5.5.5.1");
        final TopologyNode node = submitter.createTopLevelNode("__top_of_tree__", frequency);
        final TopologyNode _obj_root_node = node.createNode(__getNodeName());
        _obj_root_node.setId(__getNodeId().toString());
        final Set<UUID> submitted = new HashSet<UUID>();
        addToNodeTree(_obj_root_node, unitService, submitted);
        return submitter.submitVerified(timestamp);
    }

    /**
     * Gets the actual type name of the topology object
     * 
     */
    @Override
    protected String __getNodeName() {
        return NODE_NAME;
    }

    /**
     * Returns the current value of the 'urlPath' property.
     * 
     * @return
     *     The current value of the 'urlPath' property.
     */
    public URLPath getUrlPath() {
        return _urlPath;
    }

    /**
     * Returns the current value of the 'urlServerInstance' property.
     * 
     * @return
     *     The current value of the 'urlServerInstance' property.
     */
    public URLServerInstance getUrlServerInstance() {
        return _urlServerInstance;
    }

    /**
     * Returns the current value of the 'monitoredHost' property.
     * 
     * @return
     *     The current value of the 'monitoredHost' property.
     */
    public Host getMonitoredHost() {
        return _monitoredHost;
    }

    /**
     * Sets the current value of the 'monitoredHost' property.
     * 
     */
    public void setMonitoredHost(Host monitoredHost) {
        _monitoredHost = monitoredHost;
    }

    /**
     * Returns the current value of the 'monitoringAgent' property.
     * 
     * @return
     *     The current value of the 'monitoringAgent' property.
     */
    public Agent getMonitoringAgent() {
        return _monitoringAgent;
    }

    /**
     * Sets the current value of the 'monitoringAgent' property.
     * 
     */
    public void setMonitoringAgent(Agent monitoringAgent) {
        _monitoringAgent = monitoringAgent;
    }

    /**
     * Sets the current value of the 'availability' property.
     * 
     */
    public void setAvailability(SampleMetric availability) {
        _availability = availability;
    }

    /**
     * Returns the current value of the availability property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getAvailability() {
        if (_availability == null) {
            return null;
        }
        return _availability.getValue();
    }

    /**
     * Returns the aggregate values of the availability property
     * 
     */
    public SampleMetric getAvailabilityAggregate() {
        return _availability;
    }

    /**
     * Sets the value of the availability property as a double
     * 
     */
    public void setAvailability(Double value) {
        if (value == null) {
            _availability = null;
            return ;
        }
        _availability = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the availability property
     * 
     */
    public void setAvailabilityAggregate(Double count, Double sum) {
        _availability = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the availability property
     * 
     */
    public void setAvailabilityAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _availability = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'pageGetTime' property.
     * 
     */
    public void setPageGetTime(SampleMetric pageGetTime) {
        _pageGetTime = pageGetTime;
    }

    /**
     * Returns the current value of the pageGetTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPageGetTime() {
        if (_pageGetTime == null) {
            return null;
        }
        return _pageGetTime.getValue();
    }

    /**
     * Returns the aggregate values of the pageGetTime property
     * 
     */
    public SampleMetric getPageGetTimeAggregate() {
        return _pageGetTime;
    }

    /**
     * Sets the value of the pageGetTime property as a double
     * 
     */
    public void setPageGetTime(Double value) {
        if (value == null) {
            _pageGetTime = null;
            return ;
        }
        _pageGetTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the pageGetTime property
     * 
     */
    public void setPageGetTimeAggregate(Double count, Double sum) {
        _pageGetTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the pageGetTime property
     * 
     */
    public void setPageGetTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _pageGetTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'responseTime' property.
     * 
     */
    public void setResponseTime(SampleMetric responseTime) {
        _responseTime = responseTime;
    }

    /**
     * Returns the current value of the responseTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getResponseTime() {
        if (_responseTime == null) {
            return null;
        }
        return _responseTime.getValue();
    }

    /**
     * Returns the aggregate values of the responseTime property
     * 
     */
    public SampleMetric getResponseTimeAggregate() {
        return _responseTime;
    }

    /**
     * Sets the value of the responseTime property as a double
     * 
     */
    public void setResponseTime(Double value) {
        if (value == null) {
            _responseTime = null;
            return ;
        }
        _responseTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the responseTime property
     * 
     */
    public void setResponseTimeAggregate(Double count, Double sum) {
        _responseTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the responseTime property
     * 
     */
    public void setResponseTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _responseTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'errorCode' property.
     * 
     */
    public void setErrorCode(SampleMetric errorCode) {
        _errorCode = errorCode;
    }

    /**
     * Returns the current value of the errorCode property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getErrorCode() {
        if (_errorCode == null) {
            return null;
        }
        return _errorCode.getValue();
    }

    /**
     * Returns the aggregate values of the errorCode property
     * 
     */
    public SampleMetric getErrorCodeAggregate() {
        return _errorCode;
    }

    /**
     * Sets the value of the errorCode property as a double
     * 
     */
    public void setErrorCode(Double value) {
        if (value == null) {
            _errorCode = null;
            return ;
        }
        _errorCode = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the errorCode property
     * 
     */
    public void setErrorCodeAggregate(Double count, Double sum) {
        _errorCode = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the errorCode property
     * 
     */
    public void setErrorCodeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _errorCode = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the current value of the 'name' property.
     * 
     * @return
     *     The current value of the 'name' property.
     */
    public String getName() {
        return _name;
    }

    /**
     * Sets the current value of the 'name' property.
     * 
     */
    public void setName(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("MonitoredURL");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(", ");
        builder.append("urlPath");
        builder.append("=");
        builder.append(getUrlPath());
        builder.append(", ");
        builder.append("urlServerInstance");
        builder.append("=");
        builder.append(getUrlServerInstance());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new MonitoredURL(getUrlPath(), getUrlServerInstance());
    }

}
