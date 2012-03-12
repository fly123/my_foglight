
package com.quest.agent.urlmonitor.samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the HostStorage topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class HostStorage
    extends HostComponent
{

    public final static String NODE_NAME = "HostStorage";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private List<PhysicalDisk> _physicalDisks;
    private boolean _replace_physicalDisks = false;
    private List<LogicalDisk> _logicalDisks;
    private boolean _replace_logicalDisks = false;
    private SampleMetric _diskUtilization;
    private SampleMetric _diskReads;
    private SampleMetric _diskWrites;
    private SampleMetric _diskBytesRead;
    private SampleMetric _diskBytesWritten;
    private SampleMetric _diskTransferRate;
    private SampleMetric _spaceUsed;
    private SampleMetric _spaceAvailable;
    private List<HostTopIOProcessEntry> _topIOProcesses;

    public HostStorage(Host host) {
        // Pass super class ID properties up the line
        super(host);
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
        if (!(_physicalDisks == null)) {
            for (TopologyObject list_element: _physicalDisks) {
                list_element.reset();
            }
        }
        if (!(_logicalDisks == null)) {
            for (TopologyObject list_element: _logicalDisks) {
                list_element.reset();
            }
        }
        _diskUtilization = null;
        _diskReads = null;
        _diskWrites = null;
        _diskBytesRead = null;
        _diskBytesWritten = null;
        _diskTransferRate = null;
        _spaceUsed = null;
        _spaceAvailable = null;
        if (!(_topIOProcesses == null)) {
            for (TopologyObject list_element: _topIOProcesses) {
                list_element.reset();
            }
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
        super.addPropertiesToNodeTree(currentNode, unitService, submitted);
        if (!(_physicalDisks == null)) {
            for (TopologyObject list_element: _physicalDisks) {
                final TopologyNode _node127 = currentNode.createNode("physicalDisks");
                if (__isIdentity("physicalDisks")) {
                    _node127 .setIsIdentity(true);
                }
                if (_replace_physicalDisks) {
                    _node127 .setReplace(true);
                }
                _replace_physicalDisks = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node127 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node127 .setTypeHint(list_element.__getNodeName());
                    _node127 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node127, unitService, submitted);
                }
            }
        }
        if (!(_logicalDisks == null)) {
            for (TopologyObject list_element: _logicalDisks) {
                final TopologyNode _node128 = currentNode.createNode("logicalDisks");
                if (__isIdentity("logicalDisks")) {
                    _node128 .setIsIdentity(true);
                }
                if (_replace_logicalDisks) {
                    _node128 .setReplace(true);
                }
                _replace_logicalDisks = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node128 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node128 .setTypeHint(list_element.__getNodeName());
                    _node128 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node128, unitService, submitted);
                }
            }
        }
        if (!(_diskUtilization == null)) {
            final TopologyNode _node129 = currentNode.createNode("diskUtilization");
            _diskUtilization.submit(_node129, unitService.getUnits("percent"));
        }
        if (!(_diskReads == null)) {
            final TopologyNode _node130 = currentNode.createNode("diskReads");
            _diskReads.submit(_node130, unitService.getUnits("count/second"));
        }
        if (!(_diskWrites == null)) {
            final TopologyNode _node131 = currentNode.createNode("diskWrites");
            _diskWrites.submit(_node131, unitService.getUnits("count/second"));
        }
        if (!(_diskBytesRead == null)) {
            final TopologyNode _node132 = currentNode.createNode("diskBytesRead");
            _diskBytesRead.submit(_node132, unitService.getUnits("kilobyte/second"));
        }
        if (!(_diskBytesWritten == null)) {
            final TopologyNode _node133 = currentNode.createNode("diskBytesWritten");
            _diskBytesWritten.submit(_node133, unitService.getUnits("kilobyte/second"));
        }
        if (!(_diskTransferRate == null)) {
            final TopologyNode _node134 = currentNode.createNode("diskTransferRate");
            _diskTransferRate.submit(_node134, unitService.getUnits("kilobyte/second"));
        }
        if (!(_spaceUsed == null)) {
            final TopologyNode _node135 = currentNode.createNode("spaceUsed");
            _spaceUsed.submit(_node135, unitService.getUnits("megabyte"));
        }
        if (!(_spaceAvailable == null)) {
            final TopologyNode _node136 = currentNode.createNode("spaceAvailable");
            _spaceAvailable.submit(_node136, unitService.getUnits("megabyte"));
        }
        if (!(_topIOProcesses == null)) {
            for (TopologyObject list_element: _topIOProcesses) {
                final TopologyNode _node137 = currentNode.createNode("topIOProcesses");
                if (__isIdentity("topIOProcesses")) {
                    _node137 .setIsIdentity(true);
                }
                if (submitted.contains(list_element.__getNodeId())) {
                    // observation already submitted, just re-send the identity fields
                    _node137 .setTypeHint(list_element.__getNodeName());
                    _node137 .setId(list_element.__getNodeId().toString());
                    final TopologyObject cloned = ((TopologyObject) list_element.__cloneIdOnly());
                    cloned.addToNodeTree(_node137, unitService, submitted);
                } else {
                    // Not already submitted, send the entire thing
                    _node137 .setTypeHint(list_element.__getNodeName());
                    _node137 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node137, unitService, submitted);
                }
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
     * Returns the list containing all of the 'physicalDisks' properties.
     * 
     */
    public List<PhysicalDisk> getPhysicalDisks() {
        if (_physicalDisks == null) {
            _physicalDisks = new ArrayList<PhysicalDisk>(3);
        }
        return _physicalDisks;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForPhysicalDisks(boolean _replace) {
        _replace_physicalDisks = _replace;
    }

    /**
     * Returns the list containing all of the 'logicalDisks' properties.
     * 
     */
    public List<LogicalDisk> getLogicalDisks() {
        if (_logicalDisks == null) {
            _logicalDisks = new ArrayList<LogicalDisk>(3);
        }
        return _logicalDisks;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForLogicalDisks(boolean _replace) {
        _replace_logicalDisks = _replace;
    }

    /**
     * Sets the current value of the 'diskUtilization' property.
     * 
     */
    public void setDiskUtilization(SampleMetric diskUtilization) {
        _diskUtilization = diskUtilization;
    }

    /**
     * Returns the current value of the diskUtilization property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskUtilization() {
        if (_diskUtilization == null) {
            return null;
        }
        return _diskUtilization.getValue();
    }

    /**
     * Returns the aggregate values of the diskUtilization property
     * 
     */
    public SampleMetric getDiskUtilizationAggregate() {
        return _diskUtilization;
    }

    /**
     * Sets the value of the diskUtilization property as a double
     * 
     */
    public void setDiskUtilization(Double value) {
        if (value == null) {
            _diskUtilization = null;
            return ;
        }
        _diskUtilization = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskUtilization property
     * 
     */
    public void setDiskUtilizationAggregate(Double count, Double sum) {
        _diskUtilization = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskUtilization property
     * 
     */
    public void setDiskUtilizationAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskUtilization = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'diskReads' property.
     * 
     */
    public void setDiskReads(SampleMetric diskReads) {
        _diskReads = diskReads;
    }

    /**
     * Returns the current value of the diskReads property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskReads() {
        if (_diskReads == null) {
            return null;
        }
        return _diskReads.getValue();
    }

    /**
     * Returns the aggregate values of the diskReads property
     * 
     */
    public SampleMetric getDiskReadsAggregate() {
        return _diskReads;
    }

    /**
     * Sets the value of the diskReads property as a double
     * 
     */
    public void setDiskReads(Double value) {
        if (value == null) {
            _diskReads = null;
            return ;
        }
        _diskReads = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskReads property
     * 
     */
    public void setDiskReadsAggregate(Double count, Double sum) {
        _diskReads = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskReads property
     * 
     */
    public void setDiskReadsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskReads = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'diskWrites' property.
     * 
     */
    public void setDiskWrites(SampleMetric diskWrites) {
        _diskWrites = diskWrites;
    }

    /**
     * Returns the current value of the diskWrites property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskWrites() {
        if (_diskWrites == null) {
            return null;
        }
        return _diskWrites.getValue();
    }

    /**
     * Returns the aggregate values of the diskWrites property
     * 
     */
    public SampleMetric getDiskWritesAggregate() {
        return _diskWrites;
    }

    /**
     * Sets the value of the diskWrites property as a double
     * 
     */
    public void setDiskWrites(Double value) {
        if (value == null) {
            _diskWrites = null;
            return ;
        }
        _diskWrites = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskWrites property
     * 
     */
    public void setDiskWritesAggregate(Double count, Double sum) {
        _diskWrites = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskWrites property
     * 
     */
    public void setDiskWritesAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskWrites = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'diskBytesRead' property.
     * 
     */
    public void setDiskBytesRead(SampleMetric diskBytesRead) {
        _diskBytesRead = diskBytesRead;
    }

    /**
     * Returns the current value of the diskBytesRead property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskBytesRead() {
        if (_diskBytesRead == null) {
            return null;
        }
        return _diskBytesRead.getValue();
    }

    /**
     * Returns the aggregate values of the diskBytesRead property
     * 
     */
    public SampleMetric getDiskBytesReadAggregate() {
        return _diskBytesRead;
    }

    /**
     * Sets the value of the diskBytesRead property as a double
     * 
     */
    public void setDiskBytesRead(Double value) {
        if (value == null) {
            _diskBytesRead = null;
            return ;
        }
        _diskBytesRead = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskBytesRead property
     * 
     */
    public void setDiskBytesReadAggregate(Double count, Double sum) {
        _diskBytesRead = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskBytesRead property
     * 
     */
    public void setDiskBytesReadAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskBytesRead = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'diskBytesWritten' property.
     * 
     */
    public void setDiskBytesWritten(SampleMetric diskBytesWritten) {
        _diskBytesWritten = diskBytesWritten;
    }

    /**
     * Returns the current value of the diskBytesWritten property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskBytesWritten() {
        if (_diskBytesWritten == null) {
            return null;
        }
        return _diskBytesWritten.getValue();
    }

    /**
     * Returns the aggregate values of the diskBytesWritten property
     * 
     */
    public SampleMetric getDiskBytesWrittenAggregate() {
        return _diskBytesWritten;
    }

    /**
     * Sets the value of the diskBytesWritten property as a double
     * 
     */
    public void setDiskBytesWritten(Double value) {
        if (value == null) {
            _diskBytesWritten = null;
            return ;
        }
        _diskBytesWritten = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskBytesWritten property
     * 
     */
    public void setDiskBytesWrittenAggregate(Double count, Double sum) {
        _diskBytesWritten = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskBytesWritten property
     * 
     */
    public void setDiskBytesWrittenAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskBytesWritten = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'diskTransferRate' property.
     * 
     */
    public void setDiskTransferRate(SampleMetric diskTransferRate) {
        _diskTransferRate = diskTransferRate;
    }

    /**
     * Returns the current value of the diskTransferRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDiskTransferRate() {
        if (_diskTransferRate == null) {
            return null;
        }
        return _diskTransferRate.getValue();
    }

    /**
     * Returns the aggregate values of the diskTransferRate property
     * 
     */
    public SampleMetric getDiskTransferRateAggregate() {
        return _diskTransferRate;
    }

    /**
     * Sets the value of the diskTransferRate property as a double
     * 
     */
    public void setDiskTransferRate(Double value) {
        if (value == null) {
            _diskTransferRate = null;
            return ;
        }
        _diskTransferRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the diskTransferRate property
     * 
     */
    public void setDiskTransferRateAggregate(Double count, Double sum) {
        _diskTransferRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the diskTransferRate property
     * 
     */
    public void setDiskTransferRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _diskTransferRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'spaceUsed' property.
     * 
     */
    public void setSpaceUsed(SampleMetric spaceUsed) {
        _spaceUsed = spaceUsed;
    }

    /**
     * Returns the current value of the spaceUsed property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getSpaceUsed() {
        if (_spaceUsed == null) {
            return null;
        }
        return _spaceUsed.getValue();
    }

    /**
     * Returns the aggregate values of the spaceUsed property
     * 
     */
    public SampleMetric getSpaceUsedAggregate() {
        return _spaceUsed;
    }

    /**
     * Sets the value of the spaceUsed property as a double
     * 
     */
    public void setSpaceUsed(Double value) {
        if (value == null) {
            _spaceUsed = null;
            return ;
        }
        _spaceUsed = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the spaceUsed property
     * 
     */
    public void setSpaceUsedAggregate(Double count, Double sum) {
        _spaceUsed = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the spaceUsed property
     * 
     */
    public void setSpaceUsedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _spaceUsed = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'spaceAvailable' property.
     * 
     */
    public void setSpaceAvailable(SampleMetric spaceAvailable) {
        _spaceAvailable = spaceAvailable;
    }

    /**
     * Returns the current value of the spaceAvailable property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getSpaceAvailable() {
        if (_spaceAvailable == null) {
            return null;
        }
        return _spaceAvailable.getValue();
    }

    /**
     * Returns the aggregate values of the spaceAvailable property
     * 
     */
    public SampleMetric getSpaceAvailableAggregate() {
        return _spaceAvailable;
    }

    /**
     * Sets the value of the spaceAvailable property as a double
     * 
     */
    public void setSpaceAvailable(Double value) {
        if (value == null) {
            _spaceAvailable = null;
            return ;
        }
        _spaceAvailable = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the spaceAvailable property
     * 
     */
    public void setSpaceAvailableAggregate(Double count, Double sum) {
        _spaceAvailable = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the spaceAvailable property
     * 
     */
    public void setSpaceAvailableAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _spaceAvailable = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the list containing all of the 'topIOProcesses' properties.
     * 
     */
    public List<HostTopIOProcessEntry> getTopIOProcesses() {
        if (_topIOProcesses == null) {
            _topIOProcesses = new ArrayList<HostTopIOProcessEntry>(3);
        }
        return _topIOProcesses;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostStorage");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("HostComponent");
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new HostStorage(getHost());
    }

}
