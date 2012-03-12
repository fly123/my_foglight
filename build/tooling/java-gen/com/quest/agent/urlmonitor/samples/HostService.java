
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
 * the HostService topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:11+0800")
public class HostService
    extends HostComponent
{

    public final static String NODE_NAME = "HostService";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _name;
    private String _displayName;
    private HostServiceState _state;
    private HostProcess _process;
    private String _pid;

    public HostService(String name, Host host) {
        // Pass super class ID properties up the line
        super(host);
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
        _displayName = null;
        _state = null;
        if (!(_process == null)) {
            _process.reset();
        }
        _pid = null;
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
        if (!(_name == null)) {
            final TopologyValue _value168 = currentNode.createValue("name");
            _value168 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value168 .setIsIdentity(true);
            }
        }
        if (!(_displayName == null)) {
            final TopologyValue _value169 = currentNode.createValue("displayName");
            _value169 .setSampleValue(_displayName.toString());
            if (__isIdentity("displayName")) {
                _value169 .setIsIdentity(true);
            }
        }
        if (!(_state == null)) {
            final TopologyValue _value170 = currentNode.createValue("state");
            _value170 .setSampleValue(_state.getValue());
            if (__isIdentity("state")) {
                _value170 .setIsIdentity(true);
            }
        }
        if (!(_process == null)) {
            final TopologyNode _node171 = currentNode.createNode("process");
            if (__isIdentity("process")) {
                _node171 .setIsIdentity(true);
            }
            if (submitted.contains(_process.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node171 .setRefId(_process.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node171 .setTypeHint(_process.__getNodeName());
                _node171 .setId(_process.__getNodeId().toString());
                _process.addToNodeTree(_node171, unitService, submitted);
            }
        }
        if (!(_pid == null)) {
            final TopologyValue _value172 = currentNode.createValue("pid");
            _value172 .setSampleValue(_pid.toString());
            if (__isIdentity("pid")) {
                _value172 .setIsIdentity(true);
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
     * Returns the current value of the 'displayName' property.
     * 
     * @return
     *     The current value of the 'displayName' property.
     */
    public String getDisplayName() {
        return _displayName;
    }

    /**
     * Sets the current value of the 'displayName' property.
     * 
     */
    public void setDisplayName(String displayName) {
        _displayName = displayName;
    }

    /**
     * Returns the current value of the 'state' property.
     * 
     * @return
     *     The current value of the 'state' property.
     */
    public HostServiceState getState() {
        return _state;
    }

    /**
     * Sets the current value of the 'state' property.
     * 
     */
    public void setState(HostServiceState state) {
        _state = state;
    }

    /**
     * Returns the current value of the 'process' property.
     * 
     * @return
     *     The current value of the 'process' property.
     */
    public HostProcess getProcess() {
        return _process;
    }

    /**
     * Sets the current value of the 'process' property.
     * 
     */
    public void setProcess(HostProcess process) {
        _process = process;
    }

    /**
     * Returns the current value of the 'pid' property.
     * 
     * @return
     *     The current value of the 'pid' property.
     */
    public String getPid() {
        return _pid;
    }

    /**
     * Sets the current value of the 'pid' property.
     * 
     */
    public void setPid(String pid) {
        _pid = pid;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostService");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("HostComponent");
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
        return new HostService(getName(), getHost());
    }

}
