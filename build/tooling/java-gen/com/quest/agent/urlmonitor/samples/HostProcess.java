
package com.quest.agent.urlmonitor.samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
 * the HostProcess topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class HostProcess
    extends HostBaseObject
{

    public final static String NODE_NAME = "HostProcess";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _name;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final OperatingSystem _os;
    private SampleMetric _percentProcessorTime;
    private SampleMetric _totalProcessorTime;
    private SampleMetric _percentMemory;
    private SampleMetric _virtualSize;
    private SampleMetric _workingSetSize;
    private SampleMetric _swapSize;
    private SampleMetric _pageFaults;
    private SampleMetric _dataRead;
    private SampleMetric _dataWritten;
    private SampleMetric _dataOther;
    private SampleMetric _dataTransferRate;
    private SampleMetric _operationsRead;
    private SampleMetric _operationsWrite;
    private SampleMetric _operationsOther;
    private List<HostProcessInstance> _instances;

    public HostProcess(String name, OperatingSystem os) {
        if (name == null) {
            throw new NullPointerException("The required identity property 'name' cannot be null");
        }
        if (name.length() == 0) {
            throw new NullPointerException("The required identity property 'name' cannot be an empty string");
        }
        _name = name;
        if (os == null) {
            throw new NullPointerException("The required identity property 'os' cannot be null");
        }
        _os = os;
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
        _percentProcessorTime = null;
        _totalProcessorTime = null;
        _percentMemory = null;
        _virtualSize = null;
        _workingSetSize = null;
        _swapSize = null;
        _pageFaults = null;
        _dataRead = null;
        _dataWritten = null;
        _dataOther = null;
        _dataTransferRate = null;
        _operationsRead = null;
        _operationsWrite = null;
        _operationsOther = null;
        if (!(_instances == null)) {
            for (TopologyObject list_element: _instances) {
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
        if (!(_name == null)) {
            final TopologyValue _value182 = currentNode.createValue("name");
            _value182 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value182 .setIsIdentity(true);
            }
        }
        if (!(_os == null)) {
            final TopologyNode _node183 = currentNode.createNode("os");
            if (__isIdentity("os")) {
                _node183 .setIsIdentity(true);
            }
            if (submitted.contains(_os.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node183 .setRefId(_os.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node183 .setTypeHint(_os.__getNodeName());
                _node183 .setId(_os.__getNodeId().toString());
                _os.addToNodeTree(_node183, unitService, submitted);
            }
        }
        if (!(_percentProcessorTime == null)) {
            final TopologyNode _node184 = currentNode.createNode("percentProcessorTime");
            _percentProcessorTime.submit(_node184, unitService.getUnits("percent"));
        }
        if (!(_totalProcessorTime == null)) {
            final TopologyNode _node185 = currentNode.createNode("totalProcessorTime");
            _totalProcessorTime.submit(_node185, unitService.getUnits("second"));
        }
        if (!(_percentMemory == null)) {
            final TopologyNode _node186 = currentNode.createNode("percentMemory");
            _percentMemory.submit(_node186, unitService.getUnits("percent"));
        }
        if (!(_virtualSize == null)) {
            final TopologyNode _node187 = currentNode.createNode("virtualSize");
            _virtualSize.submit(_node187, unitService.getUnits("kilobyte"));
        }
        if (!(_workingSetSize == null)) {
            final TopologyNode _node188 = currentNode.createNode("workingSetSize");
            _workingSetSize.submit(_node188, unitService.getUnits("kilobyte"));
        }
        if (!(_swapSize == null)) {
            final TopologyNode _node189 = currentNode.createNode("swapSize");
            _swapSize.submit(_node189, unitService.getUnits("kilobyte"));
        }
        if (!(_pageFaults == null)) {
            final TopologyNode _node190 = currentNode.createNode("pageFaults");
            _pageFaults.submit(_node190, unitService.getUnits("count/second"));
        }
        if (!(_dataRead == null)) {
            final TopologyNode _node191 = currentNode.createNode("dataRead");
            _dataRead.submit(_node191, unitService.getUnits("byte/second"));
        }
        if (!(_dataWritten == null)) {
            final TopologyNode _node192 = currentNode.createNode("dataWritten");
            _dataWritten.submit(_node192, unitService.getUnits("byte/second"));
        }
        if (!(_dataOther == null)) {
            final TopologyNode _node193 = currentNode.createNode("dataOther");
            _dataOther.submit(_node193, unitService.getUnits("byte/second"));
        }
        if (!(_dataTransferRate == null)) {
            final TopologyNode _node194 = currentNode.createNode("dataTransferRate");
            _dataTransferRate.submit(_node194, unitService.getUnits("byte/second"));
        }
        if (!(_operationsRead == null)) {
            final TopologyNode _node195 = currentNode.createNode("operationsRead");
            _operationsRead.submit(_node195, unitService.getUnits("count/second"));
        }
        if (!(_operationsWrite == null)) {
            final TopologyNode _node196 = currentNode.createNode("operationsWrite");
            _operationsWrite.submit(_node196, unitService.getUnits("count/second"));
        }
        if (!(_operationsOther == null)) {
            final TopologyNode _node197 = currentNode.createNode("operationsOther");
            _operationsOther.submit(_node197, unitService.getUnits("count/second"));
        }
        if (!(_instances == null)) {
            for (TopologyObject list_element: _instances) {
                final TopologyNode _node198 = currentNode.createNode("instances");
                if (__isIdentity("instances")) {
                    _node198 .setIsIdentity(true);
                }
                if (submitted.contains(list_element.__getNodeId())) {
                    // observation already submitted, just re-send the identity fields
                    _node198 .setTypeHint(list_element.__getNodeName());
                    _node198 .setId(list_element.__getNodeId().toString());
                    final TopologyObject cloned = ((TopologyObject) list_element.__cloneIdOnly());
                    cloned.addToNodeTree(_node198, unitService, submitted);
                } else {
                    // Not already submitted, send the entire thing
                    _node198 .setTypeHint(list_element.__getNodeName());
                    _node198 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node198, unitService, submitted);
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
        // The name is an identity or required property for this class
        if ("name".equals(name)) {
            return true;
        }
        // The os is an identity or required property for this class
        if ("os".equals(name)) {
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
     * Returns the current value of the 'os' property.
     * 
     * @return
     *     The current value of the 'os' property.
     */
    public OperatingSystem getOs() {
        return _os;
    }

    /**
     * Sets the current value of the 'percentProcessorTime' property.
     * 
     */
    public void setPercentProcessorTime(SampleMetric percentProcessorTime) {
        _percentProcessorTime = percentProcessorTime;
    }

    /**
     * Returns the current value of the percentProcessorTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPercentProcessorTime() {
        if (_percentProcessorTime == null) {
            return null;
        }
        return _percentProcessorTime.getValue();
    }

    /**
     * Returns the aggregate values of the percentProcessorTime property
     * 
     */
    public SampleMetric getPercentProcessorTimeAggregate() {
        return _percentProcessorTime;
    }

    /**
     * Sets the value of the percentProcessorTime property as a double
     * 
     */
    public void setPercentProcessorTime(Double value) {
        if (value == null) {
            _percentProcessorTime = null;
            return ;
        }
        _percentProcessorTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the percentProcessorTime property
     * 
     */
    public void setPercentProcessorTimeAggregate(Double count, Double sum) {
        _percentProcessorTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the percentProcessorTime property
     * 
     */
    public void setPercentProcessorTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _percentProcessorTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'totalProcessorTime' property.
     * 
     */
    public void setTotalProcessorTime(SampleMetric totalProcessorTime) {
        _totalProcessorTime = totalProcessorTime;
    }

    /**
     * Returns the current value of the totalProcessorTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getTotalProcessorTime() {
        if (_totalProcessorTime == null) {
            return null;
        }
        return _totalProcessorTime.getValue();
    }

    /**
     * Returns the aggregate values of the totalProcessorTime property
     * 
     */
    public SampleMetric getTotalProcessorTimeAggregate() {
        return _totalProcessorTime;
    }

    /**
     * Sets the value of the totalProcessorTime property as a double
     * 
     */
    public void setTotalProcessorTime(Double value) {
        if (value == null) {
            _totalProcessorTime = null;
            return ;
        }
        _totalProcessorTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the totalProcessorTime property
     * 
     */
    public void setTotalProcessorTimeAggregate(Double count, Double sum) {
        _totalProcessorTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the totalProcessorTime property
     * 
     */
    public void setTotalProcessorTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _totalProcessorTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'percentMemory' property.
     * 
     */
    public void setPercentMemory(SampleMetric percentMemory) {
        _percentMemory = percentMemory;
    }

    /**
     * Returns the current value of the percentMemory property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPercentMemory() {
        if (_percentMemory == null) {
            return null;
        }
        return _percentMemory.getValue();
    }

    /**
     * Returns the aggregate values of the percentMemory property
     * 
     */
    public SampleMetric getPercentMemoryAggregate() {
        return _percentMemory;
    }

    /**
     * Sets the value of the percentMemory property as a double
     * 
     */
    public void setPercentMemory(Double value) {
        if (value == null) {
            _percentMemory = null;
            return ;
        }
        _percentMemory = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the percentMemory property
     * 
     */
    public void setPercentMemoryAggregate(Double count, Double sum) {
        _percentMemory = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the percentMemory property
     * 
     */
    public void setPercentMemoryAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _percentMemory = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'virtualSize' property.
     * 
     */
    public void setVirtualSize(SampleMetric virtualSize) {
        _virtualSize = virtualSize;
    }

    /**
     * Returns the current value of the virtualSize property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getVirtualSize() {
        if (_virtualSize == null) {
            return null;
        }
        return _virtualSize.getValue();
    }

    /**
     * Returns the aggregate values of the virtualSize property
     * 
     */
    public SampleMetric getVirtualSizeAggregate() {
        return _virtualSize;
    }

    /**
     * Sets the value of the virtualSize property as a double
     * 
     */
    public void setVirtualSize(Double value) {
        if (value == null) {
            _virtualSize = null;
            return ;
        }
        _virtualSize = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the virtualSize property
     * 
     */
    public void setVirtualSizeAggregate(Double count, Double sum) {
        _virtualSize = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the virtualSize property
     * 
     */
    public void setVirtualSizeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _virtualSize = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'workingSetSize' property.
     * 
     */
    public void setWorkingSetSize(SampleMetric workingSetSize) {
        _workingSetSize = workingSetSize;
    }

    /**
     * Returns the current value of the workingSetSize property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getWorkingSetSize() {
        if (_workingSetSize == null) {
            return null;
        }
        return _workingSetSize.getValue();
    }

    /**
     * Returns the aggregate values of the workingSetSize property
     * 
     */
    public SampleMetric getWorkingSetSizeAggregate() {
        return _workingSetSize;
    }

    /**
     * Sets the value of the workingSetSize property as a double
     * 
     */
    public void setWorkingSetSize(Double value) {
        if (value == null) {
            _workingSetSize = null;
            return ;
        }
        _workingSetSize = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the workingSetSize property
     * 
     */
    public void setWorkingSetSizeAggregate(Double count, Double sum) {
        _workingSetSize = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the workingSetSize property
     * 
     */
    public void setWorkingSetSizeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _workingSetSize = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'swapSize' property.
     * 
     */
    public void setSwapSize(SampleMetric swapSize) {
        _swapSize = swapSize;
    }

    /**
     * Returns the current value of the swapSize property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getSwapSize() {
        if (_swapSize == null) {
            return null;
        }
        return _swapSize.getValue();
    }

    /**
     * Returns the aggregate values of the swapSize property
     * 
     */
    public SampleMetric getSwapSizeAggregate() {
        return _swapSize;
    }

    /**
     * Sets the value of the swapSize property as a double
     * 
     */
    public void setSwapSize(Double value) {
        if (value == null) {
            _swapSize = null;
            return ;
        }
        _swapSize = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the swapSize property
     * 
     */
    public void setSwapSizeAggregate(Double count, Double sum) {
        _swapSize = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the swapSize property
     * 
     */
    public void setSwapSizeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _swapSize = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'pageFaults' property.
     * 
     */
    public void setPageFaults(SampleMetric pageFaults) {
        _pageFaults = pageFaults;
    }

    /**
     * Returns the current value of the pageFaults property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPageFaults() {
        if (_pageFaults == null) {
            return null;
        }
        return _pageFaults.getValue();
    }

    /**
     * Returns the aggregate values of the pageFaults property
     * 
     */
    public SampleMetric getPageFaultsAggregate() {
        return _pageFaults;
    }

    /**
     * Sets the value of the pageFaults property as a double
     * 
     */
    public void setPageFaults(Double value) {
        if (value == null) {
            _pageFaults = null;
            return ;
        }
        _pageFaults = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the pageFaults property
     * 
     */
    public void setPageFaultsAggregate(Double count, Double sum) {
        _pageFaults = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the pageFaults property
     * 
     */
    public void setPageFaultsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _pageFaults = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'dataRead' property.
     * 
     */
    public void setDataRead(SampleMetric dataRead) {
        _dataRead = dataRead;
    }

    /**
     * Returns the current value of the dataRead property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDataRead() {
        if (_dataRead == null) {
            return null;
        }
        return _dataRead.getValue();
    }

    /**
     * Returns the aggregate values of the dataRead property
     * 
     */
    public SampleMetric getDataReadAggregate() {
        return _dataRead;
    }

    /**
     * Sets the value of the dataRead property as a double
     * 
     */
    public void setDataRead(Double value) {
        if (value == null) {
            _dataRead = null;
            return ;
        }
        _dataRead = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the dataRead property
     * 
     */
    public void setDataReadAggregate(Double count, Double sum) {
        _dataRead = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the dataRead property
     * 
     */
    public void setDataReadAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _dataRead = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'dataWritten' property.
     * 
     */
    public void setDataWritten(SampleMetric dataWritten) {
        _dataWritten = dataWritten;
    }

    /**
     * Returns the current value of the dataWritten property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDataWritten() {
        if (_dataWritten == null) {
            return null;
        }
        return _dataWritten.getValue();
    }

    /**
     * Returns the aggregate values of the dataWritten property
     * 
     */
    public SampleMetric getDataWrittenAggregate() {
        return _dataWritten;
    }

    /**
     * Sets the value of the dataWritten property as a double
     * 
     */
    public void setDataWritten(Double value) {
        if (value == null) {
            _dataWritten = null;
            return ;
        }
        _dataWritten = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the dataWritten property
     * 
     */
    public void setDataWrittenAggregate(Double count, Double sum) {
        _dataWritten = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the dataWritten property
     * 
     */
    public void setDataWrittenAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _dataWritten = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'dataOther' property.
     * 
     */
    public void setDataOther(SampleMetric dataOther) {
        _dataOther = dataOther;
    }

    /**
     * Returns the current value of the dataOther property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDataOther() {
        if (_dataOther == null) {
            return null;
        }
        return _dataOther.getValue();
    }

    /**
     * Returns the aggregate values of the dataOther property
     * 
     */
    public SampleMetric getDataOtherAggregate() {
        return _dataOther;
    }

    /**
     * Sets the value of the dataOther property as a double
     * 
     */
    public void setDataOther(Double value) {
        if (value == null) {
            _dataOther = null;
            return ;
        }
        _dataOther = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the dataOther property
     * 
     */
    public void setDataOtherAggregate(Double count, Double sum) {
        _dataOther = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the dataOther property
     * 
     */
    public void setDataOtherAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _dataOther = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'dataTransferRate' property.
     * 
     */
    public void setDataTransferRate(SampleMetric dataTransferRate) {
        _dataTransferRate = dataTransferRate;
    }

    /**
     * Returns the current value of the dataTransferRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getDataTransferRate() {
        if (_dataTransferRate == null) {
            return null;
        }
        return _dataTransferRate.getValue();
    }

    /**
     * Returns the aggregate values of the dataTransferRate property
     * 
     */
    public SampleMetric getDataTransferRateAggregate() {
        return _dataTransferRate;
    }

    /**
     * Sets the value of the dataTransferRate property as a double
     * 
     */
    public void setDataTransferRate(Double value) {
        if (value == null) {
            _dataTransferRate = null;
            return ;
        }
        _dataTransferRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the dataTransferRate property
     * 
     */
    public void setDataTransferRateAggregate(Double count, Double sum) {
        _dataTransferRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the dataTransferRate property
     * 
     */
    public void setDataTransferRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _dataTransferRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'operationsRead' property.
     * 
     */
    public void setOperationsRead(SampleMetric operationsRead) {
        _operationsRead = operationsRead;
    }

    /**
     * Returns the current value of the operationsRead property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOperationsRead() {
        if (_operationsRead == null) {
            return null;
        }
        return _operationsRead.getValue();
    }

    /**
     * Returns the aggregate values of the operationsRead property
     * 
     */
    public SampleMetric getOperationsReadAggregate() {
        return _operationsRead;
    }

    /**
     * Sets the value of the operationsRead property as a double
     * 
     */
    public void setOperationsRead(Double value) {
        if (value == null) {
            _operationsRead = null;
            return ;
        }
        _operationsRead = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the operationsRead property
     * 
     */
    public void setOperationsReadAggregate(Double count, Double sum) {
        _operationsRead = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the operationsRead property
     * 
     */
    public void setOperationsReadAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _operationsRead = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'operationsWrite' property.
     * 
     */
    public void setOperationsWrite(SampleMetric operationsWrite) {
        _operationsWrite = operationsWrite;
    }

    /**
     * Returns the current value of the operationsWrite property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOperationsWrite() {
        if (_operationsWrite == null) {
            return null;
        }
        return _operationsWrite.getValue();
    }

    /**
     * Returns the aggregate values of the operationsWrite property
     * 
     */
    public SampleMetric getOperationsWriteAggregate() {
        return _operationsWrite;
    }

    /**
     * Sets the value of the operationsWrite property as a double
     * 
     */
    public void setOperationsWrite(Double value) {
        if (value == null) {
            _operationsWrite = null;
            return ;
        }
        _operationsWrite = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the operationsWrite property
     * 
     */
    public void setOperationsWriteAggregate(Double count, Double sum) {
        _operationsWrite = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the operationsWrite property
     * 
     */
    public void setOperationsWriteAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _operationsWrite = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'operationsOther' property.
     * 
     */
    public void setOperationsOther(SampleMetric operationsOther) {
        _operationsOther = operationsOther;
    }

    /**
     * Returns the current value of the operationsOther property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOperationsOther() {
        if (_operationsOther == null) {
            return null;
        }
        return _operationsOther.getValue();
    }

    /**
     * Returns the aggregate values of the operationsOther property
     * 
     */
    public SampleMetric getOperationsOtherAggregate() {
        return _operationsOther;
    }

    /**
     * Sets the value of the operationsOther property as a double
     * 
     */
    public void setOperationsOther(Double value) {
        if (value == null) {
            _operationsOther = null;
            return ;
        }
        _operationsOther = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the operationsOther property
     * 
     */
    public void setOperationsOtherAggregate(Double count, Double sum) {
        _operationsOther = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the operationsOther property
     * 
     */
    public void setOperationsOtherAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _operationsOther = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the list containing all of the 'instances' properties.
     * 
     */
    public List<HostProcessInstance> getInstances() {
        if (_instances == null) {
            _instances = new ArrayList<HostProcessInstance>(3);
        }
        return _instances;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostProcess");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("HostBaseObject");
        builder.append(", ");
        builder.append("name");
        builder.append("=");
        builder.append(getName());
        builder.append(", ");
        builder.append("os");
        builder.append("=");
        builder.append(getOs());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new HostProcess(getName(), getOs());
    }

}
