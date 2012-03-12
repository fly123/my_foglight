
package com.quest.agent.urlmonitor.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.AgentMetadataService2;
import com.quest.glue.api.services.SystemInfoService4;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the Agent topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class Agent
    extends TopologyObject
{

    public final static String NODE_NAME = "Agent";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private String _name;
    private String _agentVersion;
    private String _agentName;
    private String _agentInstance;
    private String _build;
    private String _cpuCount;
    private String _hostName;
    private String _type;
    private AgentState _runningStateObservation;
    private Host _monitoredHost;

    public Agent() {
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
        _name = null;
        _agentVersion = null;
        _agentName = null;
        _agentInstance = null;
        _build = null;
        _cpuCount = null;
        _hostName = null;
        _type = null;
        _runningStateObservation = null;
        if (!(_monitoredHost == null)) {
            _monitoredHost.reset();
        }
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
        if (!(_name == null)) {
            final TopologyValue _value53 = currentNode.createValue("name");
            _value53 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value53 .setIsIdentity(true);
            }
        }
        if (!(_agentVersion == null)) {
            final TopologyValue _value54 = currentNode.createValue("agentVersion");
            _value54 .setSampleValue(_agentVersion.toString());
            if (__isIdentity("agentVersion")) {
                _value54 .setIsIdentity(true);
            }
        }
        if (!(_agentName == null)) {
            final TopologyValue _value55 = currentNode.createValue("agentName");
            _value55 .setSampleValue(_agentName.toString());
            if (__isIdentity("agentName")) {
                _value55 .setIsIdentity(true);
            }
        }
        if (!(_agentInstance == null)) {
            final TopologyValue _value56 = currentNode.createValue("agentInstance");
            _value56 .setSampleValue(_agentInstance.toString());
            if (__isIdentity("agentInstance")) {
                _value56 .setIsIdentity(true);
            }
        }
        if (!(_build == null)) {
            final TopologyValue _value57 = currentNode.createValue("build");
            _value57 .setSampleValue(_build.toString());
            if (__isIdentity("build")) {
                _value57 .setIsIdentity(true);
            }
        }
        if (!(_cpuCount == null)) {
            final TopologyValue _value58 = currentNode.createValue("cpuCount");
            _value58 .setSampleValue(_cpuCount.toString());
            if (__isIdentity("cpuCount")) {
                _value58 .setIsIdentity(true);
            }
        }
        if (!(_hostName == null)) {
            final TopologyValue _value59 = currentNode.createValue("hostName");
            _value59 .setSampleValue(_hostName.toString());
            if (__isIdentity("hostName")) {
                _value59 .setIsIdentity(true);
            }
        }
        if (!(_type == null)) {
            final TopologyValue _value60 = currentNode.createValue("type");
            _value60 .setSampleValue(_type.toString());
            if (__isIdentity("type")) {
                _value60 .setIsIdentity(true);
            }
        }
        if (!(_runningStateObservation == null)) {
            final TopologyValue _value61 = currentNode.createValue("runningStateObservation");
            _value61 .setSampleValue(_runningStateObservation.getValue());
            if (__isIdentity("runningStateObservation")) {
                _value61 .setIsIdentity(true);
            }
        }
        if (!(_monitoredHost == null)) {
            final TopologyNode _node62 = currentNode.createNode("monitoredHost");
            if (__isIdentity("monitoredHost")) {
                _node62 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoredHost.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node62 .setRefId(_monitoredHost.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node62 .setTypeHint(_monitoredHost.__getNodeName());
                _node62 .setId(_monitoredHost.__getNodeId().toString());
                _monitoredHost.addToNodeTree(_node62, unitService, submitted);
            }
        }
        // The agent ID is an identity field and is always submitted (using this place holder)
        final TopologyValue _value_agent_id = currentNode.createValue(com.quest.glue.api.services.TopologyDataSubmissionService3.TopologySubmitter3 .AGENT_ID_PLACEHOLDER);
        _value_agent_id.setSampleValue(-1);
        _value_agent_id.setIsIdentity(true);
    }

    /**
     * Determines if the provided property name is an identity property for this
     * class or any super-classes.
     * 
     */
    @Override
    protected boolean __isIdentity(String name) {
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

    /**
     * Returns the current value of the 'agentVersion' property.
     * 
     * @return
     *     The current value of the 'agentVersion' property.
     */
    public String getAgentVersion() {
        return _agentVersion;
    }

    /**
     * Sets the current value of the 'agentVersion' property.
     * 
     */
    public void setAgentVersion(String agentVersion) {
        _agentVersion = agentVersion;
    }

    /**
     * Returns the current value of the 'agentName' property.
     * 
     * @return
     *     The current value of the 'agentName' property.
     */
    public String getAgentName() {
        return _agentName;
    }

    /**
     * Sets the current value of the 'agentName' property.
     * 
     */
    public void setAgentName(String agentName) {
        _agentName = agentName;
    }

    /**
     * Returns the current value of the 'agentInstance' property.
     * 
     * @return
     *     The current value of the 'agentInstance' property.
     */
    public String getAgentInstance() {
        return _agentInstance;
    }

    /**
     * Sets the current value of the 'agentInstance' property.
     * 
     */
    public void setAgentInstance(String agentInstance) {
        _agentInstance = agentInstance;
    }

    /**
     * Returns the current value of the 'build' property.
     * 
     * @return
     *     The current value of the 'build' property.
     */
    public String getBuild() {
        return _build;
    }

    /**
     * Sets the current value of the 'build' property.
     * 
     */
    public void setBuild(String build) {
        _build = build;
    }

    /**
     * Returns the current value of the 'cpuCount' property.
     * 
     * @return
     *     The current value of the 'cpuCount' property.
     */
    public String getCpuCount() {
        return _cpuCount;
    }

    /**
     * Sets the current value of the 'cpuCount' property.
     * 
     */
    public void setCpuCount(String cpuCount) {
        _cpuCount = cpuCount;
    }

    /**
     * Returns the current value of the 'hostName' property.
     * 
     * @return
     *     The current value of the 'hostName' property.
     */
    public String getHostName() {
        return _hostName;
    }

    /**
     * Sets the current value of the 'hostName' property.
     * 
     */
    public void setHostName(String hostName) {
        _hostName = hostName;
    }

    /**
     * Returns the current value of the 'type' property.
     * 
     * @return
     *     The current value of the 'type' property.
     */
    public String getType() {
        return _type;
    }

    /**
     * Sets the current value of the 'type' property.
     * 
     */
    public void setType(String type) {
        _type = type;
    }

    /**
     * Returns the current value of the 'runningStateObservation' property.
     * 
     * @return
     *     The current value of the 'runningStateObservation' property.
     */
    public AgentState getRunningStateObservation() {
        return _runningStateObservation;
    }

    /**
     * Sets the current value of the 'runningStateObservation' property.
     * 
     */
    public void setRunningStateObservation(AgentState runningStateObservation) {
        _runningStateObservation = runningStateObservation;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("Agent");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new Agent();
    }

    /**
     * Initializes the well known properties of this topology
     * object using the provided services. No host-related properties
     * will will be set.
     * 
     * @param systemInfoService
     *     The system info service from the ServiceFactory
     * @param metaDataService
     *     The agent meta data service from the ServiceFactory
     */
    public void initialize(AgentMetadataService2 metaDataService, SystemInfoService4 systemInfoService) {
        initialize(metaDataService, systemInfoService, null);
    }

    /**
     * Initializes the well known properties of this topology
     * object using the provided services. All host-related properties
     * will be provided based on the host passed to this method.
     * 
     * @param host
     *     The Host object for the system this agent is monitoring.
     * @param systemInfoService
     *     The system info service from the ServiceFactory
     * @param metaDataService
     *     The agent meta data service from the ServiceFactory
     */
    public void initialize(AgentMetadataService2 metaDataService, SystemInfoService4 systemInfoService, Host host) {
        setAgentVersion(metaDataService.getPackageVersion());
        setAgentName(metaDataService.getUnqualifiedInstanceName());
        // This is the value that will be displayed in the data browser on the
        // server. setAgentName() is specific to the Agent topology object,
        // but setName() is a common property and it is what the data browser
        // looks for. It does not have to be the same as the value passed to
        // setAgentName()
        setName(metaDataService.getUnqualifiedInstanceName());
        setType(metaDataService.getUnqualifiedTypeName());
        setBuild(metaDataService.getPackageBuildID());
        setCpuCount(String.valueOf(Runtime.getRuntime().availableProcessors()));
        if (!(host == null)) {
            // This agent is monitoring the host provided
            setHostName(host.getName());
            setMonitoredHost(host);
            if (host.isThisHost(systemInfoService)) {
                // If the agent is actually running on the host provided, then
                // it can be added to the list of agents on that host.
                host.getAgents().add(this);
            }
        }
    }

}
