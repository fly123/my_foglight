
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
 * the URLServerInstance topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class URLServerInstance
    extends TopologyObject
{

    public final static String NODE_NAME = "URLServerInstance";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final Host _host;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final Integer _port;
    private String _name;
    private Agent _monitoringAgent;

    public URLServerInstance(Host host, Integer port) {
        if (host == null) {
            throw new NullPointerException("The required identity property 'host' cannot be null");
        }
        _host = host;
        if (port == null) {
            throw new NullPointerException("The required identity property 'port' cannot be null");
        }
        _port = port;
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
        if (!(_monitoringAgent == null)) {
            _monitoringAgent.reset();
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
        if (!(_host == null)) {
            final TopologyNode _node23 = currentNode.createNode("host");
            if (__isIdentity("host")) {
                _node23 .setIsIdentity(true);
            }
            if (submitted.contains(_host.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node23 .setRefId(_host.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node23 .setTypeHint(_host.__getNodeName());
                _node23 .setId(_host.__getNodeId().toString());
                _host.addToNodeTree(_node23, unitService, submitted);
            }
        }
        if (!(_port == null)) {
            final TopologyValue _value24 = currentNode.createValue("port");
            _value24 .setSampleValue(_port);
            if (__isIdentity("port")) {
                _value24 .setIsIdentity(true);
            }
        }
        if (!(_name == null)) {
            final TopologyValue _value25 = currentNode.createValue("name");
            _value25 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value25 .setIsIdentity(true);
            }
        }
        if (!(_monitoringAgent == null)) {
            final TopologyNode _node26 = currentNode.createNode("monitoringAgent");
            if (__isIdentity("monitoringAgent")) {
                _node26 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoringAgent.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node26 .setRefId(_monitoringAgent.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node26 .setTypeHint(_monitoringAgent.__getNodeName());
                _node26 .setId(_monitoringAgent.__getNodeId().toString());
                _monitoringAgent.addToNodeTree(_node26, unitService, submitted);
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
        // The host is an identity or required property for this class
        if ("host".equals(name)) {
            return true;
        }
        // The port is an identity or required property for this class
        if ("port".equals(name)) {
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
     * Returns the current value of the 'host' property.
     * 
     * @return
     *     The current value of the 'host' property.
     */
    public Host getHost() {
        return _host;
    }

    /**
     * Returns the current value of the 'port' property.
     * 
     * @return
     *     The current value of the 'port' property.
     */
    public Integer getPort() {
        return _port;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("URLServerInstance");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(", ");
        builder.append("host");
        builder.append("=");
        builder.append(getHost());
        builder.append(", ");
        builder.append("port");
        builder.append("=");
        builder.append(getPort());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new URLServerInstance(getHost(), getPort());
    }

}
