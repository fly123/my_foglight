
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
 * the SecondaryStorage topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class SecondaryStorage
    extends HostComponent
{

    public final static String NODE_NAME = "SecondaryStorage";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _name;
    private SampleMetric _utilization;
    private SampleMetric _reads;
    private SampleMetric _writes;
    private SampleMetric _bytesRead;
    private SampleMetric _bytesWritten;
    private SampleMetric _averageReadTime;
    private SampleMetric _averageWriteTime;
    private SampleMetric _averageTransferTime;
    private SampleMetric _queueLength;
    private SampleMetric _spaceUsed;
    private SampleMetric _spaceAvailable;
    private SampleMetric _totalSpace;
    private SampleMetric _capacityUsed;
    private SampleMetric _capacityAvailable;

    public SecondaryStorage(String name, Host host) {
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
        _utilization = null;
        _reads = null;
        _writes = null;
        _bytesRead = null;
        _bytesWritten = null;
        _averageReadTime = null;
        _averageWriteTime = null;
        _averageTransferTime = null;
        _queueLength = null;
        _spaceUsed = null;
        _spaceAvailable = null;
        _totalSpace = null;
        _capacityUsed = null;
        _capacityAvailable = null;
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
            final TopologyValue _value204 = currentNode.createValue("name");
            _value204 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value204 .setIsIdentity(true);
            }
        }
        if (!(_utilization == null)) {
            final TopologyNode _node205 = currentNode.createNode("utilization");
            _utilization.submit(_node205, unitService.getUnits("percent"));
        }
        if (!(_reads == null)) {
            final TopologyNode _node206 = currentNode.createNode("reads");
            _reads.submit(_node206, unitService.getUnits("count/second"));
        }
        if (!(_writes == null)) {
            final TopologyNode _node207 = currentNode.createNode("writes");
            _writes.submit(_node207, unitService.getUnits("count/second"));
        }
        if (!(_bytesRead == null)) {
            final TopologyNode _node208 = currentNode.createNode("bytesRead");
            _bytesRead.submit(_node208, unitService.getUnits("kilobyte/second"));
        }
        if (!(_bytesWritten == null)) {
            final TopologyNode _node209 = currentNode.createNode("bytesWritten");
            _bytesWritten.submit(_node209, unitService.getUnits("kilobyte/second"));
        }
        if (!(_averageReadTime == null)) {
            final TopologyNode _node210 = currentNode.createNode("averageReadTime");
            _averageReadTime.submit(_node210, unitService.getUnits("millisecond"));
        }
        if (!(_averageWriteTime == null)) {
            final TopologyNode _node211 = currentNode.createNode("averageWriteTime");
            _averageWriteTime.submit(_node211, unitService.getUnits("millisecond"));
        }
        if (!(_averageTransferTime == null)) {
            final TopologyNode _node212 = currentNode.createNode("averageTransferTime");
            _averageTransferTime.submit(_node212, unitService.getUnits("millisecond"));
        }
        if (!(_queueLength == null)) {
            final TopologyNode _node213 = currentNode.createNode("queueLength");
            _queueLength.submit(_node213, unitService.getUnits("count"));
        }
        if (!(_spaceUsed == null)) {
            final TopologyNode _node214 = currentNode.createNode("spaceUsed");
            _spaceUsed.submit(_node214, unitService.getUnits("megabyte"));
        }
        if (!(_spaceAvailable == null)) {
            final TopologyNode _node215 = currentNode.createNode("spaceAvailable");
            _spaceAvailable.submit(_node215, unitService.getUnits("megabyte"));
        }
        if (!(_totalSpace == null)) {
            final TopologyNode _node216 = currentNode.createNode("totalSpace");
            _totalSpace.submit(_node216, unitService.getUnits("megabyte"));
        }
        if (!(_capacityUsed == null)) {
            final TopologyNode _node217 = currentNode.createNode("capacityUsed");
            _capacityUsed.submit(_node217, unitService.getUnits("percent"));
        }
        if (!(_capacityAvailable == null)) {
            final TopologyNode _node218 = currentNode.createNode("capacityAvailable");
            _capacityAvailable.submit(_node218, unitService.getUnits("percent"));
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
     * Sets the current value of the 'utilization' property.
     * 
     */
    public void setUtilization(SampleMetric utilization) {
        _utilization = utilization;
    }

    /**
     * Returns the current value of the utilization property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getUtilization() {
        if (_utilization == null) {
            return null;
        }
        return _utilization.getValue();
    }

    /**
     * Returns the aggregate values of the utilization property
     * 
     */
    public SampleMetric getUtilizationAggregate() {
        return _utilization;
    }

    /**
     * Sets the value of the utilization property as a double
     * 
     */
    public void setUtilization(Double value) {
        if (value == null) {
            _utilization = null;
            return ;
        }
        _utilization = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the utilization property
     * 
     */
    public void setUtilizationAggregate(Double count, Double sum) {
        _utilization = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the utilization property
     * 
     */
    public void setUtilizationAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _utilization = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'reads' property.
     * 
     */
    public void setReads(SampleMetric reads) {
        _reads = reads;
    }

    /**
     * Returns the current value of the reads property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getReads() {
        if (_reads == null) {
            return null;
        }
        return _reads.getValue();
    }

    /**
     * Returns the aggregate values of the reads property
     * 
     */
    public SampleMetric getReadsAggregate() {
        return _reads;
    }

    /**
     * Sets the value of the reads property as a double
     * 
     */
    public void setReads(Double value) {
        if (value == null) {
            _reads = null;
            return ;
        }
        _reads = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the reads property
     * 
     */
    public void setReadsAggregate(Double count, Double sum) {
        _reads = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the reads property
     * 
     */
    public void setReadsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _reads = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'writes' property.
     * 
     */
    public void setWrites(SampleMetric writes) {
        _writes = writes;
    }

    /**
     * Returns the current value of the writes property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getWrites() {
        if (_writes == null) {
            return null;
        }
        return _writes.getValue();
    }

    /**
     * Returns the aggregate values of the writes property
     * 
     */
    public SampleMetric getWritesAggregate() {
        return _writes;
    }

    /**
     * Sets the value of the writes property as a double
     * 
     */
    public void setWrites(Double value) {
        if (value == null) {
            _writes = null;
            return ;
        }
        _writes = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the writes property
     * 
     */
    public void setWritesAggregate(Double count, Double sum) {
        _writes = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the writes property
     * 
     */
    public void setWritesAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _writes = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'bytesRead' property.
     * 
     */
    public void setBytesRead(SampleMetric bytesRead) {
        _bytesRead = bytesRead;
    }

    /**
     * Returns the current value of the bytesRead property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getBytesRead() {
        if (_bytesRead == null) {
            return null;
        }
        return _bytesRead.getValue();
    }

    /**
     * Returns the aggregate values of the bytesRead property
     * 
     */
    public SampleMetric getBytesReadAggregate() {
        return _bytesRead;
    }

    /**
     * Sets the value of the bytesRead property as a double
     * 
     */
    public void setBytesRead(Double value) {
        if (value == null) {
            _bytesRead = null;
            return ;
        }
        _bytesRead = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the bytesRead property
     * 
     */
    public void setBytesReadAggregate(Double count, Double sum) {
        _bytesRead = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the bytesRead property
     * 
     */
    public void setBytesReadAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _bytesRead = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'bytesWritten' property.
     * 
     */
    public void setBytesWritten(SampleMetric bytesWritten) {
        _bytesWritten = bytesWritten;
    }

    /**
     * Returns the current value of the bytesWritten property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getBytesWritten() {
        if (_bytesWritten == null) {
            return null;
        }
        return _bytesWritten.getValue();
    }

    /**
     * Returns the aggregate values of the bytesWritten property
     * 
     */
    public SampleMetric getBytesWrittenAggregate() {
        return _bytesWritten;
    }

    /**
     * Sets the value of the bytesWritten property as a double
     * 
     */
    public void setBytesWritten(Double value) {
        if (value == null) {
            _bytesWritten = null;
            return ;
        }
        _bytesWritten = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the bytesWritten property
     * 
     */
    public void setBytesWrittenAggregate(Double count, Double sum) {
        _bytesWritten = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the bytesWritten property
     * 
     */
    public void setBytesWrittenAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _bytesWritten = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'averageReadTime' property.
     * 
     */
    public void setAverageReadTime(SampleMetric averageReadTime) {
        _averageReadTime = averageReadTime;
    }

    /**
     * Returns the current value of the averageReadTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getAverageReadTime() {
        if (_averageReadTime == null) {
            return null;
        }
        return _averageReadTime.getValue();
    }

    /**
     * Returns the aggregate values of the averageReadTime property
     * 
     */
    public SampleMetric getAverageReadTimeAggregate() {
        return _averageReadTime;
    }

    /**
     * Sets the value of the averageReadTime property as a double
     * 
     */
    public void setAverageReadTime(Double value) {
        if (value == null) {
            _averageReadTime = null;
            return ;
        }
        _averageReadTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the averageReadTime property
     * 
     */
    public void setAverageReadTimeAggregate(Double count, Double sum) {
        _averageReadTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the averageReadTime property
     * 
     */
    public void setAverageReadTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _averageReadTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'averageWriteTime' property.
     * 
     */
    public void setAverageWriteTime(SampleMetric averageWriteTime) {
        _averageWriteTime = averageWriteTime;
    }

    /**
     * Returns the current value of the averageWriteTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getAverageWriteTime() {
        if (_averageWriteTime == null) {
            return null;
        }
        return _averageWriteTime.getValue();
    }

    /**
     * Returns the aggregate values of the averageWriteTime property
     * 
     */
    public SampleMetric getAverageWriteTimeAggregate() {
        return _averageWriteTime;
    }

    /**
     * Sets the value of the averageWriteTime property as a double
     * 
     */
    public void setAverageWriteTime(Double value) {
        if (value == null) {
            _averageWriteTime = null;
            return ;
        }
        _averageWriteTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the averageWriteTime property
     * 
     */
    public void setAverageWriteTimeAggregate(Double count, Double sum) {
        _averageWriteTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the averageWriteTime property
     * 
     */
    public void setAverageWriteTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _averageWriteTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'averageTransferTime' property.
     * 
     */
    public void setAverageTransferTime(SampleMetric averageTransferTime) {
        _averageTransferTime = averageTransferTime;
    }

    /**
     * Returns the current value of the averageTransferTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getAverageTransferTime() {
        if (_averageTransferTime == null) {
            return null;
        }
        return _averageTransferTime.getValue();
    }

    /**
     * Returns the aggregate values of the averageTransferTime property
     * 
     */
    public SampleMetric getAverageTransferTimeAggregate() {
        return _averageTransferTime;
    }

    /**
     * Sets the value of the averageTransferTime property as a double
     * 
     */
    public void setAverageTransferTime(Double value) {
        if (value == null) {
            _averageTransferTime = null;
            return ;
        }
        _averageTransferTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the averageTransferTime property
     * 
     */
    public void setAverageTransferTimeAggregate(Double count, Double sum) {
        _averageTransferTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the averageTransferTime property
     * 
     */
    public void setAverageTransferTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _averageTransferTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'queueLength' property.
     * 
     */
    public void setQueueLength(SampleMetric queueLength) {
        _queueLength = queueLength;
    }

    /**
     * Returns the current value of the queueLength property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getQueueLength() {
        if (_queueLength == null) {
            return null;
        }
        return _queueLength.getValue();
    }

    /**
     * Returns the aggregate values of the queueLength property
     * 
     */
    public SampleMetric getQueueLengthAggregate() {
        return _queueLength;
    }

    /**
     * Sets the value of the queueLength property as a double
     * 
     */
    public void setQueueLength(Double value) {
        if (value == null) {
            _queueLength = null;
            return ;
        }
        _queueLength = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the queueLength property
     * 
     */
    public void setQueueLengthAggregate(Double count, Double sum) {
        _queueLength = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the queueLength property
     * 
     */
    public void setQueueLengthAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _queueLength = new SampleMetric(count, sum, sum_of_squares, min, max);
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
     * Sets the current value of the 'totalSpace' property.
     * 
     */
    public void setTotalSpace(SampleMetric totalSpace) {
        _totalSpace = totalSpace;
    }

    /**
     * Returns the current value of the totalSpace property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getTotalSpace() {
        if (_totalSpace == null) {
            return null;
        }
        return _totalSpace.getValue();
    }

    /**
     * Returns the aggregate values of the totalSpace property
     * 
     */
    public SampleMetric getTotalSpaceAggregate() {
        return _totalSpace;
    }

    /**
     * Sets the value of the totalSpace property as a double
     * 
     */
    public void setTotalSpace(Double value) {
        if (value == null) {
            _totalSpace = null;
            return ;
        }
        _totalSpace = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the totalSpace property
     * 
     */
    public void setTotalSpaceAggregate(Double count, Double sum) {
        _totalSpace = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the totalSpace property
     * 
     */
    public void setTotalSpaceAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _totalSpace = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'capacityUsed' property.
     * 
     */
    public void setCapacityUsed(SampleMetric capacityUsed) {
        _capacityUsed = capacityUsed;
    }

    /**
     * Returns the current value of the capacityUsed property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getCapacityUsed() {
        if (_capacityUsed == null) {
            return null;
        }
        return _capacityUsed.getValue();
    }

    /**
     * Returns the aggregate values of the capacityUsed property
     * 
     */
    public SampleMetric getCapacityUsedAggregate() {
        return _capacityUsed;
    }

    /**
     * Sets the value of the capacityUsed property as a double
     * 
     */
    public void setCapacityUsed(Double value) {
        if (value == null) {
            _capacityUsed = null;
            return ;
        }
        _capacityUsed = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the capacityUsed property
     * 
     */
    public void setCapacityUsedAggregate(Double count, Double sum) {
        _capacityUsed = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the capacityUsed property
     * 
     */
    public void setCapacityUsedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _capacityUsed = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'capacityAvailable' property.
     * 
     */
    public void setCapacityAvailable(SampleMetric capacityAvailable) {
        _capacityAvailable = capacityAvailable;
    }

    /**
     * Returns the current value of the capacityAvailable property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getCapacityAvailable() {
        if (_capacityAvailable == null) {
            return null;
        }
        return _capacityAvailable.getValue();
    }

    /**
     * Returns the aggregate values of the capacityAvailable property
     * 
     */
    public SampleMetric getCapacityAvailableAggregate() {
        return _capacityAvailable;
    }

    /**
     * Sets the value of the capacityAvailable property as a double
     * 
     */
    public void setCapacityAvailable(Double value) {
        if (value == null) {
            _capacityAvailable = null;
            return ;
        }
        _capacityAvailable = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the capacityAvailable property
     * 
     */
    public void setCapacityAvailableAggregate(Double count, Double sum) {
        _capacityAvailable = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the capacityAvailable property
     * 
     */
    public void setCapacityAvailableAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _capacityAvailable = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("SecondaryStorage");
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
        return new SecondaryStorage(getName(), getHost());
    }

}
