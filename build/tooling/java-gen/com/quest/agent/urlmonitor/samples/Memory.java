
package com.quest.agent.urlmonitor.samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
 * the Memory topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class Memory
    extends HostComponent
{

    public final static String NODE_NAME = "Memory";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private Long _totalMemory;
    private SampleMetric _capacity;
    private SampleMetric _consumed;
    private SampleMetric _utilization;
    private SampleMetric _pageInRate;
    private SampleMetric _pageOutRate;
    private SampleMetric _virtualMemorySize;
    private SampleMetric _nonPagedKernelMemory;
    private SampleMetric _pagedKernelMemory;
    private SampleMetric _fileSystemCache;
    private List<HostTopMemoryProcessEntry> _topMemoryProcesses;

    public Memory(Host host) {
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
        _totalMemory = null;
        _capacity = null;
        _consumed = null;
        _utilization = null;
        _pageInRate = null;
        _pageOutRate = null;
        _virtualMemorySize = null;
        _nonPagedKernelMemory = null;
        _pagedKernelMemory = null;
        _fileSystemCache = null;
        if (!(_topMemoryProcesses == null)) {
            for (TopologyObject list_element: _topMemoryProcesses) {
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
        if (!(_totalMemory == null)) {
            final TopologyValue _value31 = currentNode.createValue("totalMemory");
            _value31 .setSampleValue(_totalMemory, unitService.getUnits("megabyte"));
            if (__isIdentity("totalMemory")) {
                _value31 .setIsIdentity(true);
            }
        }
        if (!(_capacity == null)) {
            final TopologyNode _node32 = currentNode.createNode("capacity");
            _capacity.submit(_node32, unitService.getUnits("megabyte"));
        }
        if (!(_consumed == null)) {
            final TopologyNode _node33 = currentNode.createNode("consumed");
            _consumed.submit(_node33, unitService.getUnits("megabyte"));
        }
        if (!(_utilization == null)) {
            final TopologyNode _node34 = currentNode.createNode("utilization");
            _utilization.submit(_node34, unitService.getUnits("percent"));
        }
        if (!(_pageInRate == null)) {
            final TopologyNode _node35 = currentNode.createNode("pageInRate");
            _pageInRate.submit(_node35, unitService.getUnits("count/second"));
        }
        if (!(_pageOutRate == null)) {
            final TopologyNode _node36 = currentNode.createNode("pageOutRate");
            _pageOutRate.submit(_node36, unitService.getUnits("count/second"));
        }
        if (!(_virtualMemorySize == null)) {
            final TopologyNode _node37 = currentNode.createNode("virtualMemorySize");
            _virtualMemorySize.submit(_node37, unitService.getUnits("megabyte"));
        }
        if (!(_nonPagedKernelMemory == null)) {
            final TopologyNode _node38 = currentNode.createNode("nonPagedKernelMemory");
            _nonPagedKernelMemory.submit(_node38, unitService.getUnits("megabyte"));
        }
        if (!(_pagedKernelMemory == null)) {
            final TopologyNode _node39 = currentNode.createNode("pagedKernelMemory");
            _pagedKernelMemory.submit(_node39, unitService.getUnits("megabyte"));
        }
        if (!(_fileSystemCache == null)) {
            final TopologyNode _node40 = currentNode.createNode("fileSystemCache");
            _fileSystemCache.submit(_node40, unitService.getUnits("megabyte"));
        }
        if (!(_topMemoryProcesses == null)) {
            for (TopologyObject list_element: _topMemoryProcesses) {
                final TopologyNode _node41 = currentNode.createNode("topMemoryProcesses");
                if (__isIdentity("topMemoryProcesses")) {
                    _node41 .setIsIdentity(true);
                }
                if (submitted.contains(list_element.__getNodeId())) {
                    // observation already submitted, just re-send the identity fields
                    _node41 .setTypeHint(list_element.__getNodeName());
                    _node41 .setId(list_element.__getNodeId().toString());
                    final TopologyObject cloned = ((TopologyObject) list_element.__cloneIdOnly());
                    cloned.addToNodeTree(_node41, unitService, submitted);
                } else {
                    // Not already submitted, send the entire thing
                    _node41 .setTypeHint(list_element.__getNodeName());
                    _node41 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node41, unitService, submitted);
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
     * Returns the current value of the 'totalMemory' property.
     * 
     * @return
     *     The current value of the 'totalMemory' property.
     * @deprecated
     *     The topology-types definition indicates that this property is deprecated
     */
    @Deprecated
    public Long getTotalMemory() {
        return _totalMemory;
    }

    /**
     * Sets the current value of the 'totalMemory' property.
     * 
     * @deprecated
     *     The topology-types definition indicates that this property is deprecated
     */
    @Deprecated
    public void setTotalMemory(Long totalMemory) {
        _totalMemory = totalMemory;
    }

    /**
     * Sets the current value of the 'capacity' property.
     * 
     */
    public void setCapacity(SampleMetric capacity) {
        _capacity = capacity;
    }

    /**
     * Returns the current value of the capacity property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getCapacity() {
        if (_capacity == null) {
            return null;
        }
        return _capacity.getValue();
    }

    /**
     * Returns the aggregate values of the capacity property
     * 
     */
    public SampleMetric getCapacityAggregate() {
        return _capacity;
    }

    /**
     * Sets the value of the capacity property as a double
     * 
     */
    public void setCapacity(Double value) {
        if (value == null) {
            _capacity = null;
            return ;
        }
        _capacity = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the capacity property
     * 
     */
    public void setCapacityAggregate(Double count, Double sum) {
        _capacity = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the capacity property
     * 
     */
    public void setCapacityAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _capacity = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'consumed' property.
     * 
     */
    public void setConsumed(SampleMetric consumed) {
        _consumed = consumed;
    }

    /**
     * Returns the current value of the consumed property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getConsumed() {
        if (_consumed == null) {
            return null;
        }
        return _consumed.getValue();
    }

    /**
     * Returns the aggregate values of the consumed property
     * 
     */
    public SampleMetric getConsumedAggregate() {
        return _consumed;
    }

    /**
     * Sets the value of the consumed property as a double
     * 
     */
    public void setConsumed(Double value) {
        if (value == null) {
            _consumed = null;
            return ;
        }
        _consumed = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the consumed property
     * 
     */
    public void setConsumedAggregate(Double count, Double sum) {
        _consumed = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the consumed property
     * 
     */
    public void setConsumedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _consumed = new SampleMetric(count, sum, sum_of_squares, min, max);
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
     * Sets the current value of the 'pageInRate' property.
     * 
     */
    public void setPageInRate(SampleMetric pageInRate) {
        _pageInRate = pageInRate;
    }

    /**
     * Returns the current value of the pageInRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPageInRate() {
        if (_pageInRate == null) {
            return null;
        }
        return _pageInRate.getValue();
    }

    /**
     * Returns the aggregate values of the pageInRate property
     * 
     */
    public SampleMetric getPageInRateAggregate() {
        return _pageInRate;
    }

    /**
     * Sets the value of the pageInRate property as a double
     * 
     */
    public void setPageInRate(Double value) {
        if (value == null) {
            _pageInRate = null;
            return ;
        }
        _pageInRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the pageInRate property
     * 
     */
    public void setPageInRateAggregate(Double count, Double sum) {
        _pageInRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the pageInRate property
     * 
     */
    public void setPageInRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _pageInRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'pageOutRate' property.
     * 
     */
    public void setPageOutRate(SampleMetric pageOutRate) {
        _pageOutRate = pageOutRate;
    }

    /**
     * Returns the current value of the pageOutRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPageOutRate() {
        if (_pageOutRate == null) {
            return null;
        }
        return _pageOutRate.getValue();
    }

    /**
     * Returns the aggregate values of the pageOutRate property
     * 
     */
    public SampleMetric getPageOutRateAggregate() {
        return _pageOutRate;
    }

    /**
     * Sets the value of the pageOutRate property as a double
     * 
     */
    public void setPageOutRate(Double value) {
        if (value == null) {
            _pageOutRate = null;
            return ;
        }
        _pageOutRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the pageOutRate property
     * 
     */
    public void setPageOutRateAggregate(Double count, Double sum) {
        _pageOutRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the pageOutRate property
     * 
     */
    public void setPageOutRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _pageOutRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'virtualMemorySize' property.
     * 
     */
    public void setVirtualMemorySize(SampleMetric virtualMemorySize) {
        _virtualMemorySize = virtualMemorySize;
    }

    /**
     * Returns the current value of the virtualMemorySize property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getVirtualMemorySize() {
        if (_virtualMemorySize == null) {
            return null;
        }
        return _virtualMemorySize.getValue();
    }

    /**
     * Returns the aggregate values of the virtualMemorySize property
     * 
     */
    public SampleMetric getVirtualMemorySizeAggregate() {
        return _virtualMemorySize;
    }

    /**
     * Sets the value of the virtualMemorySize property as a double
     * 
     */
    public void setVirtualMemorySize(Double value) {
        if (value == null) {
            _virtualMemorySize = null;
            return ;
        }
        _virtualMemorySize = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the virtualMemorySize property
     * 
     */
    public void setVirtualMemorySizeAggregate(Double count, Double sum) {
        _virtualMemorySize = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the virtualMemorySize property
     * 
     */
    public void setVirtualMemorySizeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _virtualMemorySize = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'nonPagedKernelMemory' property.
     * 
     */
    public void setNonPagedKernelMemory(SampleMetric nonPagedKernelMemory) {
        _nonPagedKernelMemory = nonPagedKernelMemory;
    }

    /**
     * Returns the current value of the nonPagedKernelMemory property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getNonPagedKernelMemory() {
        if (_nonPagedKernelMemory == null) {
            return null;
        }
        return _nonPagedKernelMemory.getValue();
    }

    /**
     * Returns the aggregate values of the nonPagedKernelMemory property
     * 
     */
    public SampleMetric getNonPagedKernelMemoryAggregate() {
        return _nonPagedKernelMemory;
    }

    /**
     * Sets the value of the nonPagedKernelMemory property as a double
     * 
     */
    public void setNonPagedKernelMemory(Double value) {
        if (value == null) {
            _nonPagedKernelMemory = null;
            return ;
        }
        _nonPagedKernelMemory = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the nonPagedKernelMemory property
     * 
     */
    public void setNonPagedKernelMemoryAggregate(Double count, Double sum) {
        _nonPagedKernelMemory = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the nonPagedKernelMemory property
     * 
     */
    public void setNonPagedKernelMemoryAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _nonPagedKernelMemory = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'pagedKernelMemory' property.
     * 
     */
    public void setPagedKernelMemory(SampleMetric pagedKernelMemory) {
        _pagedKernelMemory = pagedKernelMemory;
    }

    /**
     * Returns the current value of the pagedKernelMemory property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPagedKernelMemory() {
        if (_pagedKernelMemory == null) {
            return null;
        }
        return _pagedKernelMemory.getValue();
    }

    /**
     * Returns the aggregate values of the pagedKernelMemory property
     * 
     */
    public SampleMetric getPagedKernelMemoryAggregate() {
        return _pagedKernelMemory;
    }

    /**
     * Sets the value of the pagedKernelMemory property as a double
     * 
     */
    public void setPagedKernelMemory(Double value) {
        if (value == null) {
            _pagedKernelMemory = null;
            return ;
        }
        _pagedKernelMemory = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the pagedKernelMemory property
     * 
     */
    public void setPagedKernelMemoryAggregate(Double count, Double sum) {
        _pagedKernelMemory = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the pagedKernelMemory property
     * 
     */
    public void setPagedKernelMemoryAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _pagedKernelMemory = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'fileSystemCache' property.
     * 
     */
    public void setFileSystemCache(SampleMetric fileSystemCache) {
        _fileSystemCache = fileSystemCache;
    }

    /**
     * Returns the current value of the fileSystemCache property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getFileSystemCache() {
        if (_fileSystemCache == null) {
            return null;
        }
        return _fileSystemCache.getValue();
    }

    /**
     * Returns the aggregate values of the fileSystemCache property
     * 
     */
    public SampleMetric getFileSystemCacheAggregate() {
        return _fileSystemCache;
    }

    /**
     * Sets the value of the fileSystemCache property as a double
     * 
     */
    public void setFileSystemCache(Double value) {
        if (value == null) {
            _fileSystemCache = null;
            return ;
        }
        _fileSystemCache = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the fileSystemCache property
     * 
     */
    public void setFileSystemCacheAggregate(Double count, Double sum) {
        _fileSystemCache = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the fileSystemCache property
     * 
     */
    public void setFileSystemCacheAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _fileSystemCache = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the list containing all of the 'topMemoryProcesses' properties.
     * 
     */
    public List<HostTopMemoryProcessEntry> getTopMemoryProcesses() {
        if (_topMemoryProcesses == null) {
            _topMemoryProcesses = new ArrayList<HostTopMemoryProcessEntry>(3);
        }
        return _topMemoryProcesses;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("Memory");
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
        return new Memory(getHost());
    }

}
