
package com.quest.agent.urlmonitor.samples;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.common.tools.annotation.FindbugsSuppressWarnings;
import com.quest.glue.api.services.DnsResolvedHost;
import com.quest.glue.api.services.SystemInfoService4;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the Host topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class Host
    extends CollectionModelInstance
{

    public final static String NODE_NAME = "Host";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private String _systemId;
    private final String _name;
    private OperatingSystem _os;
    private Memory _memory;
    private HostCPUs _cpus;
    private HostStorage _storage;
    private HostNetwork _network;
    private List<IPAddress> _ipAddresses;
    private boolean _replace_ipAddresses = false;
    private List<TopologyObject> _running;
    private boolean _replace_running = false;
    private List<TopologyObject> _detail;
    private boolean _replace_detail = false;
    private List<Agent> _agents;
    private boolean _replace_agents = false;
    private Boolean _isHidden;
    private String _localName;
    private String _domainName;
    private com.quest.agent.urlmonitor.samples.IPAddress _primaryIpAddress;
    private String _vendor;
    private String _sysObjectId;
    private Boolean _isGateway;
    private Boolean _isBridge;
    private HostDiscoveryStatus _discoveryStatus;
    private List<Host> _virtualHosts;
    private boolean _replace_virtualHosts = false;
    private SampleMetric _virtualHostCount;
    private Host _parentHost;
    private SampleMetric _numProcesses;
    private SampleMetric _runQueueLength;
    private SampleMetric _interrupts;
    private SampleMetric _contextSwitches;
    private SampleMetric _availablePagingSpace;

    public Host(String name) {
        if (name == null) {
            throw new NullPointerException("The required identity property 'name' cannot be null");
        }
        if (name.length() == 0) {
            throw new NullPointerException("The required identity property 'name' cannot be an empty string");
        }
        _name = name;
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
        super.reset();
        _systemId = null;
        if (!(_os == null)) {
            _os.reset();
        }
        if (!(_memory == null)) {
            _memory.reset();
        }
        if (!(_cpus == null)) {
            _cpus.reset();
        }
        if (!(_storage == null)) {
            _storage.reset();
        }
        if (!(_network == null)) {
            _network.reset();
        }
        if (!(_ipAddresses == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _ipAddresses) {
                list_element.reset();
            }
        }
        if (!(_running == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _running) {
                list_element.reset();
            }
        }
        if (!(_detail == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _detail) {
                list_element.reset();
            }
        }
        if (!(_agents == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _agents) {
                list_element.reset();
            }
        }
        _isHidden = null;
        _localName = null;
        _domainName = null;
        if (!(_primaryIpAddress == null)) {
            _primaryIpAddress.reset();
        }
        _vendor = null;
        _sysObjectId = null;
        _isGateway = null;
        _isBridge = null;
        _discoveryStatus = null;
        if (!(_virtualHosts == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _virtualHosts) {
                list_element.reset();
            }
        }
        _virtualHostCount = null;
        if (!(_parentHost == null)) {
            _parentHost.reset();
        }
        _numProcesses = null;
        _runQueueLength = null;
        _interrupts = null;
        _contextSwitches = null;
        _availablePagingSpace = null;
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
        super.addPropertiesToNodeTree(currentNode, unitService, submitted);
        if (!(_systemId == null)) {
            final TopologyValue _value140 = currentNode.createValue("systemId");
            _value140 .setSampleValue(_systemId.toString());
            if (__isIdentity("systemId")) {
                _value140 .setIsIdentity(true);
            }
        }
        if (!(_name == null)) {
            final TopologyValue _value141 = currentNode.createValue("name");
            _value141 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value141 .setIsIdentity(true);
            }
        }
        if (!(_os == null)) {
            final TopologyNode _node142 = currentNode.createNode("os");
            if (__isIdentity("os")) {
                _node142 .setIsIdentity(true);
            }
            if (submitted.contains(_os.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node142 .setRefId(_os.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node142 .setTypeHint(_os.__getNodeName());
                _node142 .setId(_os.__getNodeId().toString());
                _os.addToNodeTree(_node142, unitService, submitted);
            }
        }
        if (!(_memory == null)) {
            final TopologyNode _node143 = currentNode.createNode("memory");
            if (__isIdentity("memory")) {
                _node143 .setIsIdentity(true);
            }
            if (submitted.contains(_memory.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node143 .setRefId(_memory.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node143 .setTypeHint(_memory.__getNodeName());
                _node143 .setId(_memory.__getNodeId().toString());
                _memory.addToNodeTree(_node143, unitService, submitted);
            }
        }
        if (!(_cpus == null)) {
            final TopologyNode _node144 = currentNode.createNode("cpus");
            if (__isIdentity("cpus")) {
                _node144 .setIsIdentity(true);
            }
            if (submitted.contains(_cpus.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node144 .setRefId(_cpus.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node144 .setTypeHint(_cpus.__getNodeName());
                _node144 .setId(_cpus.__getNodeId().toString());
                _cpus.addToNodeTree(_node144, unitService, submitted);
            }
        }
        if (!(_storage == null)) {
            final TopologyNode _node145 = currentNode.createNode("storage");
            if (__isIdentity("storage")) {
                _node145 .setIsIdentity(true);
            }
            if (submitted.contains(_storage.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node145 .setRefId(_storage.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node145 .setTypeHint(_storage.__getNodeName());
                _node145 .setId(_storage.__getNodeId().toString());
                _storage.addToNodeTree(_node145, unitService, submitted);
            }
        }
        if (!(_network == null)) {
            final TopologyNode _node146 = currentNode.createNode("network");
            if (__isIdentity("network")) {
                _node146 .setIsIdentity(true);
            }
            if (submitted.contains(_network.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node146 .setRefId(_network.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node146 .setTypeHint(_network.__getNodeName());
                _node146 .setId(_network.__getNodeId().toString());
                _network.addToNodeTree(_node146, unitService, submitted);
            }
        }
        if (!(_ipAddresses == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _ipAddresses) {
                final TopologyNode _node147 = currentNode.createNode("ipAddresses");
                if (__isIdentity("ipAddresses")) {
                    _node147 .setIsIdentity(true);
                }
                if (_replace_ipAddresses) {
                    _node147 .setReplace(true);
                }
                _replace_ipAddresses = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node147 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node147 .setTypeHint(list_element.__getNodeName());
                    _node147 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node147, unitService, submitted);
                }
            }
        }
        if (!(_running == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _running) {
                final TopologyNode _node148 = currentNode.createNode("running");
                if (__isIdentity("running")) {
                    _node148 .setIsIdentity(true);
                }
                if (_replace_running) {
                    _node148 .setReplace(true);
                }
                _replace_running = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node148 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node148 .setTypeHint(list_element.__getNodeName());
                    _node148 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node148, unitService, submitted);
                }
            }
        }
        if (!(_detail == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _detail) {
                final TopologyNode _node149 = currentNode.createNode("detail");
                if (__isIdentity("detail")) {
                    _node149 .setIsIdentity(true);
                }
                if (_replace_detail) {
                    _node149 .setReplace(true);
                }
                _replace_detail = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node149 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node149 .setTypeHint(list_element.__getNodeName());
                    _node149 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node149, unitService, submitted);
                }
            }
        }
        if (!(_agents == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _agents) {
                final TopologyNode _node150 = currentNode.createNode("agents");
                if (__isIdentity("agents")) {
                    _node150 .setIsIdentity(true);
                }
                if (_replace_agents) {
                    _node150 .setReplace(true);
                }
                _replace_agents = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node150 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node150 .setTypeHint(list_element.__getNodeName());
                    _node150 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node150, unitService, submitted);
                }
            }
        }
        if (!(_isHidden == null)) {
            final TopologyValue _value151 = currentNode.createValue("isHidden");
            _value151 .setSampleValue(_isHidden.toString());
            if (__isIdentity("isHidden")) {
                _value151 .setIsIdentity(true);
            }
        }
        if (!(_localName == null)) {
            final TopologyValue _value152 = currentNode.createValue("localName");
            _value152 .setSampleValue(_localName.toString());
            if (__isIdentity("localName")) {
                _value152 .setIsIdentity(true);
            }
        }
        if (!(_domainName == null)) {
            final TopologyValue _value153 = currentNode.createValue("domainName");
            _value153 .setSampleValue(_domainName.toString());
            if (__isIdentity("domainName")) {
                _value153 .setIsIdentity(true);
            }
        }
        if (!(_primaryIpAddress == null)) {
            final TopologyNode _node154 = currentNode.createNode("primaryIpAddress");
            if (__isIdentity("primaryIpAddress")) {
                _node154 .setIsIdentity(true);
            }
            if (submitted.contains(_primaryIpAddress.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node154 .setRefId(_primaryIpAddress.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node154 .setTypeHint(_primaryIpAddress.__getNodeName());
                _node154 .setId(_primaryIpAddress.__getNodeId().toString());
                _primaryIpAddress.addToNodeTree(_node154, unitService, submitted);
            }
        }
        if (!(_vendor == null)) {
            final TopologyValue _value155 = currentNode.createValue("vendor");
            _value155 .setSampleValue(_vendor.toString());
            if (__isIdentity("vendor")) {
                _value155 .setIsIdentity(true);
            }
        }
        if (!(_sysObjectId == null)) {
            final TopologyValue _value156 = currentNode.createValue("sysObjectId");
            _value156 .setSampleValue(_sysObjectId.toString());
            if (__isIdentity("sysObjectId")) {
                _value156 .setIsIdentity(true);
            }
        }
        if (!(_isGateway == null)) {
            final TopologyValue _value157 = currentNode.createValue("isGateway");
            _value157 .setSampleValue(_isGateway.toString());
            if (__isIdentity("isGateway")) {
                _value157 .setIsIdentity(true);
            }
        }
        if (!(_isBridge == null)) {
            final TopologyValue _value158 = currentNode.createValue("isBridge");
            _value158 .setSampleValue(_isBridge.toString());
            if (__isIdentity("isBridge")) {
                _value158 .setIsIdentity(true);
            }
        }
        if (!(_discoveryStatus == null)) {
            final TopologyValue _value159 = currentNode.createValue("discoveryStatus");
            _value159 .setSampleValue(_discoveryStatus.getValue());
            if (__isIdentity("discoveryStatus")) {
                _value159 .setIsIdentity(true);
            }
        }
        if (!(_virtualHosts == null)) {
            for (com.quest.agent.urlmonitor.samples.TopologyObject list_element: _virtualHosts) {
                final TopologyNode _node160 = currentNode.createNode("virtualHosts");
                if (__isIdentity("virtualHosts")) {
                    _node160 .setIsIdentity(true);
                }
                if (_replace_virtualHosts) {
                    _node160 .setReplace(true);
                }
                _replace_virtualHosts = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node160 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node160 .setTypeHint(list_element.__getNodeName());
                    _node160 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node160, unitService, submitted);
                }
            }
        }
        if (!(_virtualHostCount == null)) {
            final TopologyNode _node161 = currentNode.createNode("virtualHostCount");
            _virtualHostCount.submit(_node161, unitService.getUnits("count"));
        }
        if (!(_parentHost == null)) {
            final TopologyNode _node162 = currentNode.createNode("parentHost");
            if (__isIdentity("parentHost")) {
                _node162 .setIsIdentity(true);
            }
            if (submitted.contains(_parentHost.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node162 .setRefId(_parentHost.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node162 .setTypeHint(_parentHost.__getNodeName());
                _node162 .setId(_parentHost.__getNodeId().toString());
                _parentHost.addToNodeTree(_node162, unitService, submitted);
            }
        }
        if (!(_numProcesses == null)) {
            final TopologyNode _node163 = currentNode.createNode("numProcesses");
            _numProcesses.submit(_node163, unitService.getUnits("count"));
        }
        if (!(_runQueueLength == null)) {
            final TopologyNode _node164 = currentNode.createNode("runQueueLength");
            _runQueueLength.submit(_node164, unitService.getUnits("count"));
        }
        if (!(_interrupts == null)) {
            final TopologyNode _node165 = currentNode.createNode("interrupts");
            _interrupts.submit(_node165, unitService.getUnits("count/second"));
        }
        if (!(_contextSwitches == null)) {
            final TopologyNode _node166 = currentNode.createNode("contextSwitches");
            _contextSwitches.submit(_node166, unitService.getUnits("count/second"));
        }
        if (!(_availablePagingSpace == null)) {
            final TopologyNode _node167 = currentNode.createNode("availablePagingSpace");
            _availablePagingSpace.submit(_node167, unitService.getUnits("percent"));
        }
    }

    /**
     * Determines if the provided property name is an identity property for this
     * class or any super-classes.
     * 
     */
    @Override
    protected boolean __isIdentity(String name) {
        // The name is an identity or required property for this class
        if ("name".equals(name)) {
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
        if ((!(_obj == null))&&(_obj instanceof com.quest.agent.urlmonitor.samples.TopologyObject)) {
            final com.quest.agent.urlmonitor.samples.TopologyObject _otherObject = ((com.quest.agent.urlmonitor.samples.TopologyObject) _obj);
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
     * Returns the current value of the 'systemId' property.
     * 
     * @return
     *     The current value of the 'systemId' property.
     */
    public String getSystemId() {
        return _systemId;
    }

    /**
     * Sets the current value of the 'systemId' property.
     * 
     */
    public void setSystemId(String systemId) {
        _systemId = systemId;
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
     * Returns the current value of the 'os' property.
     * 
     * @return
     *     The current value of the 'os' property.
     */
    public OperatingSystem getOs() {
        return _os;
    }

    /**
     * Sets the current value of the 'os' property.
     * 
     */
    public void setOs(OperatingSystem os) {
        _os = os;
    }

    /**
     * Returns the current value of the 'memory' property.
     * 
     * @return
     *     The current value of the 'memory' property.
     */
    public Memory getMemory() {
        return _memory;
    }

    /**
     * Sets the current value of the 'memory' property.
     * 
     */
    public void setMemory(Memory memory) {
        _memory = memory;
    }

    /**
     * Returns the current value of the 'cpus' property.
     * 
     * @return
     *     The current value of the 'cpus' property.
     */
    public HostCPUs getCpus() {
        return _cpus;
    }

    /**
     * Sets the current value of the 'cpus' property.
     * 
     */
    public void setCpus(HostCPUs cpus) {
        _cpus = cpus;
    }

    /**
     * Returns the current value of the 'storage' property.
     * 
     * @return
     *     The current value of the 'storage' property.
     */
    public HostStorage getStorage() {
        return _storage;
    }

    /**
     * Sets the current value of the 'storage' property.
     * 
     */
    public void setStorage(HostStorage storage) {
        _storage = storage;
    }

    /**
     * Returns the current value of the 'network' property.
     * 
     * @return
     *     The current value of the 'network' property.
     */
    public HostNetwork getNetwork() {
        return _network;
    }

    /**
     * Sets the current value of the 'network' property.
     * 
     */
    public void setNetwork(HostNetwork network) {
        _network = network;
    }

    /**
     * Returns the list containing all of the 'ipAddresses' properties.
     * 
     */
    public List<IPAddress> getIpAddresses() {
        if (_ipAddresses == null) {
            _ipAddresses = new ArrayList<IPAddress>(3);
        }
        return _ipAddresses;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForIpAddresses(boolean _replace) {
        _replace_ipAddresses = _replace;
    }

    /**
     * Returns the list containing all of the 'running' properties.
     * 
     */
    public List<TopologyObject> getRunning() {
        if (_running == null) {
            _running = new ArrayList<TopologyObject>(3);
        }
        return _running;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForRunning(boolean _replace) {
        _replace_running = _replace;
    }

    /**
     * Returns the list containing all of the 'detail' properties.
     * 
     */
    public List<TopologyObject> getDetail() {
        if (_detail == null) {
            _detail = new ArrayList<TopologyObject>(3);
        }
        return _detail;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForDetail(boolean _replace) {
        _replace_detail = _replace;
    }

    /**
     * Returns the list containing all of the 'agents' properties.
     * 
     */
    public List<Agent> getAgents() {
        if (_agents == null) {
            _agents = new ArrayList<Agent>(3);
        }
        return _agents;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForAgents(boolean _replace) {
        _replace_agents = _replace;
    }

    /**
     * Returns the current value of the 'isHidden' property.
     * 
     * @return
     *     The current value of the 'isHidden' property.
     */
    public Boolean getIsHidden() {
        return _isHidden;
    }

    /**
     * Sets the current value of the 'isHidden' property.
     * 
     */
    public void setIsHidden(Boolean isHidden) {
        _isHidden = isHidden;
    }

    /**
     * Returns the current value of the 'localName' property.
     * 
     * @return
     *     The current value of the 'localName' property.
     */
    public String getLocalName() {
        return _localName;
    }

    /**
     * Sets the current value of the 'localName' property.
     * 
     */
    public void setLocalName(String localName) {
        _localName = localName;
    }

    /**
     * Returns the current value of the 'domainName' property.
     * 
     * @return
     *     The current value of the 'domainName' property.
     */
    public String getDomainName() {
        return _domainName;
    }

    /**
     * Sets the current value of the 'domainName' property.
     * 
     */
    public void setDomainName(String domainName) {
        _domainName = domainName;
    }

    /**
     * Returns the current value of the 'primaryIpAddress' property.
     * 
     * @return
     *     The current value of the 'primaryIpAddress' property.
     */
    public com.quest.agent.urlmonitor.samples.IPAddress getPrimaryIpAddress() {
        return _primaryIpAddress;
    }

    /**
     * Sets the current value of the 'primaryIpAddress' property.
     * 
     */
    public void setPrimaryIpAddress(com.quest.agent.urlmonitor.samples.IPAddress primaryIpAddress) {
        _primaryIpAddress = primaryIpAddress;
    }

    /**
     * Returns the current value of the 'vendor' property.
     * 
     * @return
     *     The current value of the 'vendor' property.
     */
    public String getVendor() {
        return _vendor;
    }

    /**
     * Sets the current value of the 'vendor' property.
     * 
     */
    public void setVendor(String vendor) {
        _vendor = vendor;
    }

    /**
     * Returns the current value of the 'sysObjectId' property.
     * 
     * @return
     *     The current value of the 'sysObjectId' property.
     */
    public String getSysObjectId() {
        return _sysObjectId;
    }

    /**
     * Sets the current value of the 'sysObjectId' property.
     * 
     */
    public void setSysObjectId(String sysObjectId) {
        _sysObjectId = sysObjectId;
    }

    /**
     * Returns the current value of the 'isGateway' property.
     * 
     * @return
     *     The current value of the 'isGateway' property.
     */
    public Boolean getIsGateway() {
        return _isGateway;
    }

    /**
     * Sets the current value of the 'isGateway' property.
     * 
     */
    public void setIsGateway(Boolean isGateway) {
        _isGateway = isGateway;
    }

    /**
     * Returns the current value of the 'isBridge' property.
     * 
     * @return
     *     The current value of the 'isBridge' property.
     */
    public Boolean getIsBridge() {
        return _isBridge;
    }

    /**
     * Sets the current value of the 'isBridge' property.
     * 
     */
    public void setIsBridge(Boolean isBridge) {
        _isBridge = isBridge;
    }

    /**
     * Returns the current value of the 'discoveryStatus' property.
     * 
     * @return
     *     The current value of the 'discoveryStatus' property.
     */
    public HostDiscoveryStatus getDiscoveryStatus() {
        return _discoveryStatus;
    }

    /**
     * Sets the current value of the 'discoveryStatus' property.
     * 
     */
    public void setDiscoveryStatus(HostDiscoveryStatus discoveryStatus) {
        _discoveryStatus = discoveryStatus;
    }

    /**
     * Returns the list containing all of the 'virtualHosts' properties.
     * 
     */
    public List<Host> getVirtualHosts() {
        if (_virtualHosts == null) {
            _virtualHosts = new ArrayList<Host>(3);
        }
        return _virtualHosts;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForVirtualHosts(boolean _replace) {
        _replace_virtualHosts = _replace;
    }

    /**
     * Sets the current value of the 'virtualHostCount' property.
     * 
     */
    public void setVirtualHostCount(SampleMetric virtualHostCount) {
        _virtualHostCount = virtualHostCount;
    }

    /**
     * Returns the current value of the virtualHostCount property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getVirtualHostCount() {
        if (_virtualHostCount == null) {
            return null;
        }
        return _virtualHostCount.getValue();
    }

    /**
     * Returns the aggregate values of the virtualHostCount property
     * 
     */
    public SampleMetric getVirtualHostCountAggregate() {
        return _virtualHostCount;
    }

    /**
     * Sets the value of the virtualHostCount property as a double
     * 
     */
    public void setVirtualHostCount(Double value) {
        if (value == null) {
            _virtualHostCount = null;
            return ;
        }
        _virtualHostCount = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the virtualHostCount property
     * 
     */
    public void setVirtualHostCountAggregate(Double count, Double sum) {
        _virtualHostCount = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the virtualHostCount property
     * 
     */
    public void setVirtualHostCountAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _virtualHostCount = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the current value of the 'parentHost' property.
     * 
     * @return
     *     The current value of the 'parentHost' property.
     */
    public Host getParentHost() {
        return _parentHost;
    }

    /**
     * Sets the current value of the 'parentHost' property.
     * 
     */
    public void setParentHost(Host parentHost) {
        _parentHost = parentHost;
    }

    /**
     * Sets the current value of the 'numProcesses' property.
     * 
     */
    public void setNumProcesses(SampleMetric numProcesses) {
        _numProcesses = numProcesses;
    }

    /**
     * Returns the current value of the numProcesses property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getNumProcesses() {
        if (_numProcesses == null) {
            return null;
        }
        return _numProcesses.getValue();
    }

    /**
     * Returns the aggregate values of the numProcesses property
     * 
     */
    public SampleMetric getNumProcessesAggregate() {
        return _numProcesses;
    }

    /**
     * Sets the value of the numProcesses property as a double
     * 
     */
    public void setNumProcesses(Double value) {
        if (value == null) {
            _numProcesses = null;
            return ;
        }
        _numProcesses = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the numProcesses property
     * 
     */
    public void setNumProcessesAggregate(Double count, Double sum) {
        _numProcesses = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the numProcesses property
     * 
     */
    public void setNumProcessesAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _numProcesses = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'runQueueLength' property.
     * 
     */
    public void setRunQueueLength(SampleMetric runQueueLength) {
        _runQueueLength = runQueueLength;
    }

    /**
     * Returns the current value of the runQueueLength property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getRunQueueLength() {
        if (_runQueueLength == null) {
            return null;
        }
        return _runQueueLength.getValue();
    }

    /**
     * Returns the aggregate values of the runQueueLength property
     * 
     */
    public SampleMetric getRunQueueLengthAggregate() {
        return _runQueueLength;
    }

    /**
     * Sets the value of the runQueueLength property as a double
     * 
     */
    public void setRunQueueLength(Double value) {
        if (value == null) {
            _runQueueLength = null;
            return ;
        }
        _runQueueLength = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the runQueueLength property
     * 
     */
    public void setRunQueueLengthAggregate(Double count, Double sum) {
        _runQueueLength = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the runQueueLength property
     * 
     */
    public void setRunQueueLengthAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _runQueueLength = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'interrupts' property.
     * 
     */
    public void setInterrupts(SampleMetric interrupts) {
        _interrupts = interrupts;
    }

    /**
     * Returns the current value of the interrupts property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getInterrupts() {
        if (_interrupts == null) {
            return null;
        }
        return _interrupts.getValue();
    }

    /**
     * Returns the aggregate values of the interrupts property
     * 
     */
    public SampleMetric getInterruptsAggregate() {
        return _interrupts;
    }

    /**
     * Sets the value of the interrupts property as a double
     * 
     */
    public void setInterrupts(Double value) {
        if (value == null) {
            _interrupts = null;
            return ;
        }
        _interrupts = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the interrupts property
     * 
     */
    public void setInterruptsAggregate(Double count, Double sum) {
        _interrupts = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the interrupts property
     * 
     */
    public void setInterruptsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _interrupts = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'contextSwitches' property.
     * 
     */
    public void setContextSwitches(SampleMetric contextSwitches) {
        _contextSwitches = contextSwitches;
    }

    /**
     * Returns the current value of the contextSwitches property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getContextSwitches() {
        if (_contextSwitches == null) {
            return null;
        }
        return _contextSwitches.getValue();
    }

    /**
     * Returns the aggregate values of the contextSwitches property
     * 
     */
    public SampleMetric getContextSwitchesAggregate() {
        return _contextSwitches;
    }

    /**
     * Sets the value of the contextSwitches property as a double
     * 
     */
    public void setContextSwitches(Double value) {
        if (value == null) {
            _contextSwitches = null;
            return ;
        }
        _contextSwitches = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the contextSwitches property
     * 
     */
    public void setContextSwitchesAggregate(Double count, Double sum) {
        _contextSwitches = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the contextSwitches property
     * 
     */
    public void setContextSwitchesAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _contextSwitches = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'availablePagingSpace' property.
     * 
     */
    public void setAvailablePagingSpace(SampleMetric availablePagingSpace) {
        _availablePagingSpace = availablePagingSpace;
    }

    /**
     * Returns the current value of the availablePagingSpace property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getAvailablePagingSpace() {
        if (_availablePagingSpace == null) {
            return null;
        }
        return _availablePagingSpace.getValue();
    }

    /**
     * Returns the aggregate values of the availablePagingSpace property
     * 
     */
    public SampleMetric getAvailablePagingSpaceAggregate() {
        return _availablePagingSpace;
    }

    /**
     * Sets the value of the availablePagingSpace property as a double
     * 
     */
    public void setAvailablePagingSpace(Double value) {
        if (value == null) {
            _availablePagingSpace = null;
            return ;
        }
        _availablePagingSpace = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the availablePagingSpace property
     * 
     */
    public void setAvailablePagingSpaceAggregate(Double count, Double sum) {
        _availablePagingSpace = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the availablePagingSpace property
     * 
     */
    public void setAvailablePagingSpaceAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _availablePagingSpace = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("Host");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("CollectionModelInstance");
        builder.append(", ");
        builder.append("name");
        builder.append("=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new Host(getName());
    }

    /**
     * Initializes the well known properties of this topology
     * object using the provided services. All host-related properties
     * will be provided based on the host on which the agent is deployed.
     * 
     * @param systemInfoService
     *     The system info service from the ServiceFactory
     * @param resolvedHostInfo
     *     The results of {@link DnsResolverService#getHostByName(String, int, long, boolean)}
     */
    public void initialize(SystemInfoService4 systemInfoService, List<DnsResolvedHost> resolvedHostInfo) {
        // Set the system ID, if it's available
        if (!(null == systemInfoService.getSystemID())) {
            setSystemId(systemInfoService.getSystemID());
        }
        // Fill in the operating system information
        final OperatingSystem os = new OperatingSystem(this);
        setOs(os);
        final String[] osinfo = systemInfoService.getPlatformName().split("-", 2);
        // Double check that the canonical platform name is in the format we expect.
        if (osinfo.length >= 1) {
            os.setName(osinfo[ 0 ]);
        }
        if (osinfo.length >= 2) {
            os.setArchitecture(osinfo[ 1 ]);
        }
        os.setVersion(System.getProperty("os.version"));
        // Fill in the IP addresses
        boolean primary_set = false;
        for (DnsResolvedHost resHost: resolvedHostInfo) {
            for (InetAddress ip_address: resHost.getResolved()) {
                final com.quest.agent.urlmonitor.samples.IPAddress topo_ip_address = new com.quest.agent.urlmonitor.samples.IPAddress(ip_address.getHostAddress());
                if (!primary_set) {
                    primary_set = true;
                    setPrimaryIpAddress(topo_ip_address);
                }
                getIpAddresses().add(topo_ip_address);
            }
        }
    }

    /**
     * Tries to determine if the host topology object represents the
     * host that the agent is currently executing on. This is done by
     * examining the properties of the topology object and will fail
     * (return false) if the {@code systemID} or {@code primaryIpAddress}
     * are not set or don't match the current host.
     * 
     * @param systemInfoService
     *     The system info service from the ServiceFactory
     */
    @FindbugsSuppressWarnings(value = "QSFT_ENL", justification = "performing a simple 'is this localhost' check, which has obviously failed")
    public boolean isThisHost(SystemInfoService4 systemInfoService) {
        if ((!(null == systemInfoService.getSystemID()))&&(!(null == getSystemId()))) {
            return systemInfoService.getSystemID().equals(getSystemId());
        }
        boolean result = false;
        if (!(null == getPrimaryIpAddress())) {
            final String primaryIP = getPrimaryIpAddress().getAddress();
            try {
                result = InetAddress.getLocalHost().equals(InetAddress.getByName(primaryIP));
            } catch (UnknownHostException _x) {
            }
        }
        return result;
    }

}
