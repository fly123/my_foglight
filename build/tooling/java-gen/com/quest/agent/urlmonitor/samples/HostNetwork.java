
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
 * the HostNetwork topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:12+0800")
public class HostNetwork
    extends HostComponent
{

    public final static String NODE_NAME = "HostNetwork";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private List<NetworkInterface> _interfaces;
    private boolean _replace_interfaces = false;
    private SampleMetric _utilization;
    private SampleMetric _packetsSent;
    private SampleMetric _packetsReceived;
    private SampleMetric _sendRate;
    private SampleMetric _receiveRate;
    private SampleMetric _transferRate;

    public HostNetwork(Host host) {
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
        if (!(_interfaces == null)) {
            for (TopologyObject list_element: _interfaces) {
                list_element.reset();
            }
        }
        _utilization = null;
        _packetsSent = null;
        _packetsReceived = null;
        _sendRate = null;
        _receiveRate = null;
        _transferRate = null;
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
        if (!(_interfaces == null)) {
            for (TopologyObject list_element: _interfaces) {
                final TopologyNode _node175 = currentNode.createNode("interfaces");
                if (__isIdentity("interfaces")) {
                    _node175 .setIsIdentity(true);
                }
                if (_replace_interfaces) {
                    _node175 .setReplace(true);
                }
                _replace_interfaces = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node175 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node175 .setTypeHint(list_element.__getNodeName());
                    _node175 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node175, unitService, submitted);
                }
            }
        }
        if (!(_utilization == null)) {
            final TopologyNode _node176 = currentNode.createNode("utilization");
            _utilization.submit(_node176, unitService.getUnits("percent"));
        }
        if (!(_packetsSent == null)) {
            final TopologyNode _node177 = currentNode.createNode("packetsSent");
            _packetsSent.submit(_node177, unitService.getUnits("count/second"));
        }
        if (!(_packetsReceived == null)) {
            final TopologyNode _node178 = currentNode.createNode("packetsReceived");
            _packetsReceived.submit(_node178, unitService.getUnits("count/second"));
        }
        if (!(_sendRate == null)) {
            final TopologyNode _node179 = currentNode.createNode("sendRate");
            _sendRate.submit(_node179, unitService.getUnits("bit/second"));
        }
        if (!(_receiveRate == null)) {
            final TopologyNode _node180 = currentNode.createNode("receiveRate");
            _receiveRate.submit(_node180, unitService.getUnits("bit/second"));
        }
        if (!(_transferRate == null)) {
            final TopologyNode _node181 = currentNode.createNode("transferRate");
            _transferRate.submit(_node181, unitService.getUnits("bit/second"));
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
     * Returns the list containing all of the 'interfaces' properties.
     * 
     */
    public List<NetworkInterface> getInterfaces() {
        if (_interfaces == null) {
            _interfaces = new ArrayList<NetworkInterface>(3);
        }
        return _interfaces;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForInterfaces(boolean _replace) {
        _replace_interfaces = _replace;
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
     * Sets the current value of the 'packetsSent' property.
     * 
     */
    public void setPacketsSent(SampleMetric packetsSent) {
        _packetsSent = packetsSent;
    }

    /**
     * Returns the current value of the packetsSent property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPacketsSent() {
        if (_packetsSent == null) {
            return null;
        }
        return _packetsSent.getValue();
    }

    /**
     * Returns the aggregate values of the packetsSent property
     * 
     */
    public SampleMetric getPacketsSentAggregate() {
        return _packetsSent;
    }

    /**
     * Sets the value of the packetsSent property as a double
     * 
     */
    public void setPacketsSent(Double value) {
        if (value == null) {
            _packetsSent = null;
            return ;
        }
        _packetsSent = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the packetsSent property
     * 
     */
    public void setPacketsSentAggregate(Double count, Double sum) {
        _packetsSent = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the packetsSent property
     * 
     */
    public void setPacketsSentAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _packetsSent = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'packetsReceived' property.
     * 
     */
    public void setPacketsReceived(SampleMetric packetsReceived) {
        _packetsReceived = packetsReceived;
    }

    /**
     * Returns the current value of the packetsReceived property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getPacketsReceived() {
        if (_packetsReceived == null) {
            return null;
        }
        return _packetsReceived.getValue();
    }

    /**
     * Returns the aggregate values of the packetsReceived property
     * 
     */
    public SampleMetric getPacketsReceivedAggregate() {
        return _packetsReceived;
    }

    /**
     * Sets the value of the packetsReceived property as a double
     * 
     */
    public void setPacketsReceived(Double value) {
        if (value == null) {
            _packetsReceived = null;
            return ;
        }
        _packetsReceived = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the packetsReceived property
     * 
     */
    public void setPacketsReceivedAggregate(Double count, Double sum) {
        _packetsReceived = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the packetsReceived property
     * 
     */
    public void setPacketsReceivedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _packetsReceived = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'sendRate' property.
     * 
     */
    public void setSendRate(SampleMetric sendRate) {
        _sendRate = sendRate;
    }

    /**
     * Returns the current value of the sendRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getSendRate() {
        if (_sendRate == null) {
            return null;
        }
        return _sendRate.getValue();
    }

    /**
     * Returns the aggregate values of the sendRate property
     * 
     */
    public SampleMetric getSendRateAggregate() {
        return _sendRate;
    }

    /**
     * Sets the value of the sendRate property as a double
     * 
     */
    public void setSendRate(Double value) {
        if (value == null) {
            _sendRate = null;
            return ;
        }
        _sendRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the sendRate property
     * 
     */
    public void setSendRateAggregate(Double count, Double sum) {
        _sendRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the sendRate property
     * 
     */
    public void setSendRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _sendRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'receiveRate' property.
     * 
     */
    public void setReceiveRate(SampleMetric receiveRate) {
        _receiveRate = receiveRate;
    }

    /**
     * Returns the current value of the receiveRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getReceiveRate() {
        if (_receiveRate == null) {
            return null;
        }
        return _receiveRate.getValue();
    }

    /**
     * Returns the aggregate values of the receiveRate property
     * 
     */
    public SampleMetric getReceiveRateAggregate() {
        return _receiveRate;
    }

    /**
     * Sets the value of the receiveRate property as a double
     * 
     */
    public void setReceiveRate(Double value) {
        if (value == null) {
            _receiveRate = null;
            return ;
        }
        _receiveRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the receiveRate property
     * 
     */
    public void setReceiveRateAggregate(Double count, Double sum) {
        _receiveRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the receiveRate property
     * 
     */
    public void setReceiveRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _receiveRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'transferRate' property.
     * 
     */
    public void setTransferRate(SampleMetric transferRate) {
        _transferRate = transferRate;
    }

    /**
     * Returns the current value of the transferRate property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getTransferRate() {
        if (_transferRate == null) {
            return null;
        }
        return _transferRate.getValue();
    }

    /**
     * Returns the aggregate values of the transferRate property
     * 
     */
    public SampleMetric getTransferRateAggregate() {
        return _transferRate;
    }

    /**
     * Sets the value of the transferRate property as a double
     * 
     */
    public void setTransferRate(Double value) {
        if (value == null) {
            _transferRate = null;
            return ;
        }
        _transferRate = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the transferRate property
     * 
     */
    public void setTransferRateAggregate(Double count, Double sum) {
        _transferRate = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the transferRate property
     * 
     */
    public void setTransferRateAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _transferRate = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostNetwork");
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
        return new HostNetwork(getHost());
    }

}
