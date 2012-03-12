
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
 * the HostCPUs topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:12+0800")
public class HostCPUs
    extends HostComponent
{

    public final static String NODE_NAME = "HostCPUs";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private List<Processor> _processors;
    private boolean _replace_processors = false;
    private SampleMetric _percentUserTime;
    private SampleMetric _percentSystemTime;
    private SampleMetric _percentIdleTime;
    private SampleMetric _utilization;
    private SampleMetric _usedHz;
    private SampleMetric _totalHz;
    private List<HostTopCPUProcessEntry> _topCPUProcesses;

    public HostCPUs(Host host) {
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
        if (!(_processors == null)) {
            for (TopologyObject list_element: _processors) {
                list_element.reset();
            }
        }
        _percentUserTime = null;
        _percentSystemTime = null;
        _percentIdleTime = null;
        _utilization = null;
        _usedHz = null;
        _totalHz = null;
        if (!(_topCPUProcesses == null)) {
            for (TopologyObject list_element: _topCPUProcesses) {
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
        if (!(_processors == null)) {
            for (TopologyObject list_element: _processors) {
                final TopologyNode _node96 = currentNode.createNode("processors");
                if (__isIdentity("processors")) {
                    _node96 .setIsIdentity(true);
                }
                if (_replace_processors) {
                    _node96 .setReplace(true);
                }
                _replace_processors = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node96 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node96 .setTypeHint(list_element.__getNodeName());
                    _node96 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node96, unitService, submitted);
                }
            }
        }
        if (!(_percentUserTime == null)) {
            final TopologyNode _node97 = currentNode.createNode("percentUserTime");
            _percentUserTime.submit(_node97, unitService.getUnits("percent"));
        }
        if (!(_percentSystemTime == null)) {
            final TopologyNode _node98 = currentNode.createNode("percentSystemTime");
            _percentSystemTime.submit(_node98, unitService.getUnits("percent"));
        }
        if (!(_percentIdleTime == null)) {
            final TopologyNode _node99 = currentNode.createNode("percentIdleTime");
            _percentIdleTime.submit(_node99, unitService.getUnits("percent"));
        }
        if (!(_utilization == null)) {
            final TopologyNode _node100 = currentNode.createNode("utilization");
            _utilization.submit(_node100, unitService.getUnits("percent"));
        }
        if (!(_usedHz == null)) {
            final TopologyNode _node101 = currentNode.createNode("usedHz");
            _usedHz.submit(_node101, unitService.getUnits("count"));
        }
        if (!(_totalHz == null)) {
            final TopologyNode _node102 = currentNode.createNode("totalHz");
            _totalHz.submit(_node102, unitService.getUnits("count"));
        }
        if (!(_topCPUProcesses == null)) {
            for (TopologyObject list_element: _topCPUProcesses) {
                final TopologyNode _node103 = currentNode.createNode("topCPUProcesses");
                if (__isIdentity("topCPUProcesses")) {
                    _node103 .setIsIdentity(true);
                }
                if (submitted.contains(list_element.__getNodeId())) {
                    // observation already submitted, just re-send the identity fields
                    _node103 .setTypeHint(list_element.__getNodeName());
                    _node103 .setId(list_element.__getNodeId().toString());
                    final TopologyObject cloned = ((TopologyObject) list_element.__cloneIdOnly());
                    cloned.addToNodeTree(_node103, unitService, submitted);
                } else {
                    // Not already submitted, send the entire thing
                    _node103 .setTypeHint(list_element.__getNodeName());
                    _node103 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node103, unitService, submitted);
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
     * Returns the list containing all of the 'processors' properties.
     * 
     */
    public List<Processor> getProcessors() {
        if (_processors == null) {
            _processors = new ArrayList<Processor>(3);
        }
        return _processors;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForProcessors(boolean _replace) {
        _replace_processors = _replace;
    }

    /**
     * Sets the current value of the 'percentUserTime' property.
     * 
     */
    public void setPercentUserTime(SampleMetric percentUserTime) {
        _percentUserTime = percentUserTime;
    }

    /**
     * Returns the current value of the percentUserTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPercentUserTime() {
        if (_percentUserTime == null) {
            return null;
        }
        return _percentUserTime.getValue();
    }

    /**
     * Returns the aggregate values of the percentUserTime property
     * 
     */
    public SampleMetric getPercentUserTimeAggregate() {
        return _percentUserTime;
    }

    /**
     * Sets the value of the percentUserTime property as a double
     * 
     */
    public void setPercentUserTime(Double value) {
        if (value == null) {
            _percentUserTime = null;
            return ;
        }
        _percentUserTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the percentUserTime property
     * 
     */
    public void setPercentUserTimeAggregate(Double count, Double sum) {
        _percentUserTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the percentUserTime property
     * 
     */
    public void setPercentUserTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _percentUserTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'percentSystemTime' property.
     * 
     */
    public void setPercentSystemTime(SampleMetric percentSystemTime) {
        _percentSystemTime = percentSystemTime;
    }

    /**
     * Returns the current value of the percentSystemTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPercentSystemTime() {
        if (_percentSystemTime == null) {
            return null;
        }
        return _percentSystemTime.getValue();
    }

    /**
     * Returns the aggregate values of the percentSystemTime property
     * 
     */
    public SampleMetric getPercentSystemTimeAggregate() {
        return _percentSystemTime;
    }

    /**
     * Sets the value of the percentSystemTime property as a double
     * 
     */
    public void setPercentSystemTime(Double value) {
        if (value == null) {
            _percentSystemTime = null;
            return ;
        }
        _percentSystemTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the percentSystemTime property
     * 
     */
    public void setPercentSystemTimeAggregate(Double count, Double sum) {
        _percentSystemTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the percentSystemTime property
     * 
     */
    public void setPercentSystemTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _percentSystemTime = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'percentIdleTime' property.
     * 
     */
    public void setPercentIdleTime(SampleMetric percentIdleTime) {
        _percentIdleTime = percentIdleTime;
    }

    /**
     * Returns the current value of the percentIdleTime property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPercentIdleTime() {
        if (_percentIdleTime == null) {
            return null;
        }
        return _percentIdleTime.getValue();
    }

    /**
     * Returns the aggregate values of the percentIdleTime property
     * 
     */
    public SampleMetric getPercentIdleTimeAggregate() {
        return _percentIdleTime;
    }

    /**
     * Sets the value of the percentIdleTime property as a double
     * 
     */
    public void setPercentIdleTime(Double value) {
        if (value == null) {
            _percentIdleTime = null;
            return ;
        }
        _percentIdleTime = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the percentIdleTime property
     * 
     */
    public void setPercentIdleTimeAggregate(Double count, Double sum) {
        _percentIdleTime = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the percentIdleTime property
     * 
     */
    public void setPercentIdleTimeAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _percentIdleTime = new SampleMetric(count, sum, sum_of_squares, min, max);
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
     * Sets the current value of the 'usedHz' property.
     * 
     */
    public void setUsedHz(SampleMetric usedHz) {
        _usedHz = usedHz;
    }

    /**
     * Returns the current value of the usedHz property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getUsedHz() {
        if (_usedHz == null) {
            return null;
        }
        return _usedHz.getValue();
    }

    /**
     * Returns the aggregate values of the usedHz property
     * 
     */
    public SampleMetric getUsedHzAggregate() {
        return _usedHz;
    }

    /**
     * Sets the value of the usedHz property as a double
     * 
     */
    public void setUsedHz(Double value) {
        if (value == null) {
            _usedHz = null;
            return ;
        }
        _usedHz = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the usedHz property
     * 
     */
    public void setUsedHzAggregate(Double count, Double sum) {
        _usedHz = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the usedHz property
     * 
     */
    public void setUsedHzAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _usedHz = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'totalHz' property.
     * 
     */
    public void setTotalHz(SampleMetric totalHz) {
        _totalHz = totalHz;
    }

    /**
     * Returns the current value of the totalHz property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getTotalHz() {
        if (_totalHz == null) {
            return null;
        }
        return _totalHz.getValue();
    }

    /**
     * Returns the aggregate values of the totalHz property
     * 
     */
    public SampleMetric getTotalHzAggregate() {
        return _totalHz;
    }

    /**
     * Sets the value of the totalHz property as a double
     * 
     */
    public void setTotalHz(Double value) {
        if (value == null) {
            _totalHz = null;
            return ;
        }
        _totalHz = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the totalHz property
     * 
     */
    public void setTotalHzAggregate(Double count, Double sum) {
        _totalHz = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the totalHz property
     * 
     */
    public void setTotalHzAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _totalHz = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the list containing all of the 'topCPUProcesses' properties.
     * 
     */
    public List<HostTopCPUProcessEntry> getTopCPUProcesses() {
        if (_topCPUProcesses == null) {
            _topCPUProcesses = new ArrayList<HostTopCPUProcessEntry>(3);
        }
        return _topCPUProcesses;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostCPUs");
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
        return new HostCPUs(getHost());
    }

}
