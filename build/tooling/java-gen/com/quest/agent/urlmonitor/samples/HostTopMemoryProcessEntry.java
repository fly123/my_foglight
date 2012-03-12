
package com.quest.agent.urlmonitor.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the HostTopMemoryProcessEntry topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class HostTopMemoryProcessEntry
    extends HostTopProcessEntry
{

    public final static String NODE_NAME = "HostTopMemoryProcessEntry";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private Float _residentSetSize;
    private Float _virtualSetSize;

    public HostTopMemoryProcessEntry(String processId, String name) {
        // Pass super class ID properties up the line
        super(processId, name);
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
        _residentSetSize = null;
        _virtualSetSize = null;
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
        if (!(_residentSetSize == null)) {
            final TopologyValue _value51 = currentNode.createValue("residentSetSize");
            _value51 .setSampleValue(_residentSetSize, unitService.getUnits("kilobyte"));
            if (__isIdentity("residentSetSize")) {
                _value51 .setIsIdentity(true);
            }
        }
        if (!(_virtualSetSize == null)) {
            final TopologyValue _value52 = currentNode.createValue("virtualSetSize");
            _value52 .setSampleValue(_virtualSetSize, unitService.getUnits("kilobyte"));
            if (__isIdentity("virtualSetSize")) {
                _value52 .setIsIdentity(true);
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
     * Returns the current value of the 'residentSetSize' property.
     * 
     * @return
     *     The current value of the 'residentSetSize' property.
     */
    public Float getResidentSetSize() {
        return _residentSetSize;
    }

    /**
     * Sets the current value of the 'residentSetSize' property.
     * 
     */
    public void setResidentSetSize(Float residentSetSize) {
        _residentSetSize = residentSetSize;
    }

    /**
     * Returns the current value of the 'virtualSetSize' property.
     * 
     * @return
     *     The current value of the 'virtualSetSize' property.
     */
    public Float getVirtualSetSize() {
        return _virtualSetSize;
    }

    /**
     * Sets the current value of the 'virtualSetSize' property.
     * 
     */
    public void setVirtualSetSize(Float virtualSetSize) {
        _virtualSetSize = virtualSetSize;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostTopMemoryProcessEntry");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("HostTopProcessEntry");
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new HostTopMemoryProcessEntry(getProcessId(), getName());
    }

}
