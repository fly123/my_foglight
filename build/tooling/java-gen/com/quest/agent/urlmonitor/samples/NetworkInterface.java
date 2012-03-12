
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
 * the NetworkInterface topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:12+0800")
public class NetworkInterface
    extends HostComponent
{

    public final static String NODE_NAME = "NetworkInterface";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _name;
    private IPAddress _ipAddress;
    private String _macAddress;
    private Integer _interfaceIndex;
    private Integer _portNumber;
    private String _interfaceType;
    private String _netmask;
    private Boolean _isLayer2;
    private String _networkSegment;
    private Integer _layer2Segment;
    private HostDiscoveryStatus _discoveryStatus;
    private List<HostModelNetwork> _networks;
    private boolean _replace_networks = false;
    private SampleMetric _bandwidth;
    private SampleMetric _utilization;
    private SampleMetric _packetsSent;
    private SampleMetric _packetsReceived;
    private SampleMetric _sendRate;
    private SampleMetric _receiveRate;
    private SampleMetric _inboundPacketsDropped;
    private SampleMetric _outboundPacketsDropped;
    private SampleMetric _inboundErrors;
    private SampleMetric _outboundErrors;
    private SampleMetric _outputQueueLength;

    public NetworkInterface(String name, Host host) {
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
        if (!(_ipAddress == null)) {
            _ipAddress.reset();
        }
        _macAddress = null;
        _interfaceIndex = null;
        _portNumber = null;
        _interfaceType = null;
        _netmask = null;
        _isLayer2 = null;
        _networkSegment = null;
        _layer2Segment = null;
        _discoveryStatus = null;
        if (!(_networks == null)) {
            for (TopologyObject list_element: _networks) {
                list_element.reset();
            }
        }
        _bandwidth = null;
        _utilization = null;
        _packetsSent = null;
        _packetsReceived = null;
        _sendRate = null;
        _receiveRate = null;
        _inboundPacketsDropped = null;
        _outboundPacketsDropped = null;
        _inboundErrors = null;
        _outboundErrors = null;
        _outputQueueLength = null;
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
            final TopologyValue _value104 = currentNode.createValue("name");
            _value104 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value104 .setIsIdentity(true);
            }
        }
        if (!(_ipAddress == null)) {
            final TopologyNode _node105 = currentNode.createNode("ipAddress");
            if (__isIdentity("ipAddress")) {
                _node105 .setIsIdentity(true);
            }
            if (submitted.contains(_ipAddress.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node105 .setRefId(_ipAddress.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node105 .setTypeHint(_ipAddress.__getNodeName());
                _node105 .setId(_ipAddress.__getNodeId().toString());
                _ipAddress.addToNodeTree(_node105, unitService, submitted);
            }
        }
        if (!(_macAddress == null)) {
            final TopologyValue _value106 = currentNode.createValue("macAddress");
            _value106 .setSampleValue(_macAddress.toString());
            if (__isIdentity("macAddress")) {
                _value106 .setIsIdentity(true);
            }
        }
        if (!(_interfaceIndex == null)) {
            final TopologyValue _value107 = currentNode.createValue("interfaceIndex");
            _value107 .setSampleValue(_interfaceIndex);
            if (__isIdentity("interfaceIndex")) {
                _value107 .setIsIdentity(true);
            }
        }
        if (!(_portNumber == null)) {
            final TopologyValue _value108 = currentNode.createValue("portNumber");
            _value108 .setSampleValue(_portNumber);
            if (__isIdentity("portNumber")) {
                _value108 .setIsIdentity(true);
            }
        }
        if (!(_interfaceType == null)) {
            final TopologyValue _value109 = currentNode.createValue("interfaceType");
            _value109 .setSampleValue(_interfaceType.toString());
            if (__isIdentity("interfaceType")) {
                _value109 .setIsIdentity(true);
            }
        }
        if (!(_netmask == null)) {
            final TopologyValue _value110 = currentNode.createValue("netmask");
            _value110 .setSampleValue(_netmask.toString());
            if (__isIdentity("netmask")) {
                _value110 .setIsIdentity(true);
            }
        }
        if (!(_isLayer2 == null)) {
            final TopologyValue _value111 = currentNode.createValue("isLayer2");
            _value111 .setSampleValue(_isLayer2 .toString());
            if (__isIdentity("isLayer2")) {
                _value111 .setIsIdentity(true);
            }
        }
        if (!(_networkSegment == null)) {
            final TopologyValue _value112 = currentNode.createValue("networkSegment");
            _value112 .setSampleValue(_networkSegment.toString());
            if (__isIdentity("networkSegment")) {
                _value112 .setIsIdentity(true);
            }
        }
        if (!(_layer2Segment == null)) {
            final TopologyValue _value113 = currentNode.createValue("layer2Segment");
            _value113 .setSampleValue(_layer2Segment);
            if (__isIdentity("layer2Segment")) {
                _value113 .setIsIdentity(true);
            }
        }
        if (!(_discoveryStatus == null)) {
            final TopologyValue _value114 = currentNode.createValue("discoveryStatus");
            _value114 .setSampleValue(_discoveryStatus.getValue());
            if (__isIdentity("discoveryStatus")) {
                _value114 .setIsIdentity(true);
            }
        }
        if (!(_networks == null)) {
            for (TopologyObject list_element: _networks) {
                final TopologyNode _node115 = currentNode.createNode("networks");
                if (__isIdentity("networks")) {
                    _node115 .setIsIdentity(true);
                }
                if (_replace_networks) {
                    _node115 .setReplace(true);
                }
                _replace_networks = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node115 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node115 .setTypeHint(list_element.__getNodeName());
                    _node115 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node115, unitService, submitted);
                }
            }
        }
        if (!(_bandwidth == null)) {
            final TopologyNode _node116 = currentNode.createNode("bandwidth");
            _bandwidth.submit(_node116, unitService.getUnits("bit/second"));
        }
        if (!(_utilization == null)) {
            final TopologyNode _node117 = currentNode.createNode("utilization");
            _utilization.submit(_node117, unitService.getUnits("percent"));
        }
        if (!(_packetsSent == null)) {
            final TopologyNode _node118 = currentNode.createNode("packetsSent");
            _packetsSent.submit(_node118, unitService.getUnits("count/second"));
        }
        if (!(_packetsReceived == null)) {
            final TopologyNode _node119 = currentNode.createNode("packetsReceived");
            _packetsReceived.submit(_node119, unitService.getUnits("count/second"));
        }
        if (!(_sendRate == null)) {
            final TopologyNode _node120 = currentNode.createNode("sendRate");
            _sendRate.submit(_node120, unitService.getUnits("bit/second"));
        }
        if (!(_receiveRate == null)) {
            final TopologyNode _node121 = currentNode.createNode("receiveRate");
            _receiveRate.submit(_node121, unitService.getUnits("bit/second"));
        }
        if (!(_inboundPacketsDropped == null)) {
            final TopologyNode _node122 = currentNode.createNode("inboundPacketsDropped");
            _inboundPacketsDropped.submit(_node122, unitService.getUnits("count"));
        }
        if (!(_outboundPacketsDropped == null)) {
            final TopologyNode _node123 = currentNode.createNode("outboundPacketsDropped");
            _outboundPacketsDropped.submit(_node123, unitService.getUnits("count"));
        }
        if (!(_inboundErrors == null)) {
            final TopologyNode _node124 = currentNode.createNode("inboundErrors");
            _inboundErrors.submit(_node124, unitService.getUnits("count"));
        }
        if (!(_outboundErrors == null)) {
            final TopologyNode _node125 = currentNode.createNode("outboundErrors");
            _outboundErrors.submit(_node125, unitService.getUnits("count"));
        }
        if (!(_outputQueueLength == null)) {
            final TopologyNode _node126 = currentNode.createNode("outputQueueLength");
            _outputQueueLength.submit(_node126, unitService.getUnits("count"));
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
     * Returns the current value of the 'ipAddress' property.
     * 
     * @return
     *     The current value of the 'ipAddress' property.
     */
    public IPAddress getIpAddress() {
        return _ipAddress;
    }

    /**
     * Sets the current value of the 'ipAddress' property.
     * 
     */
    public void setIpAddress(IPAddress ipAddress) {
        _ipAddress = ipAddress;
    }

    /**
     * Returns the current value of the 'macAddress' property.
     * 
     * @return
     *     The current value of the 'macAddress' property.
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * Sets the current value of the 'macAddress' property.
     * 
     */
    public void setMacAddress(String macAddress) {
        _macAddress = macAddress;
    }

    /**
     * Returns the current value of the 'interfaceIndex' property.
     * 
     * @return
     *     The current value of the 'interfaceIndex' property.
     */
    public Integer getInterfaceIndex() {
        return _interfaceIndex;
    }

    /**
     * Sets the current value of the 'interfaceIndex' property.
     * 
     */
    public void setInterfaceIndex(Integer interfaceIndex) {
        _interfaceIndex = interfaceIndex;
    }

    /**
     * Returns the current value of the 'portNumber' property.
     * 
     * @return
     *     The current value of the 'portNumber' property.
     */
    public Integer getPortNumber() {
        return _portNumber;
    }

    /**
     * Sets the current value of the 'portNumber' property.
     * 
     */
    public void setPortNumber(Integer portNumber) {
        _portNumber = portNumber;
    }

    /**
     * Returns the current value of the 'interfaceType' property.
     * 
     * @return
     *     The current value of the 'interfaceType' property.
     */
    public String getInterfaceType() {
        return _interfaceType;
    }

    /**
     * Sets the current value of the 'interfaceType' property.
     * 
     */
    public void setInterfaceType(String interfaceType) {
        _interfaceType = interfaceType;
    }

    /**
     * Returns the current value of the 'netmask' property.
     * 
     * @return
     *     The current value of the 'netmask' property.
     */
    public String getNetmask() {
        return _netmask;
    }

    /**
     * Sets the current value of the 'netmask' property.
     * 
     */
    public void setNetmask(String netmask) {
        _netmask = netmask;
    }

    /**
     * Returns the current value of the 'isLayer2' property.
     * 
     * @return
     *     The current value of the 'isLayer2' property.
     */
    public Boolean getIsLayer2() {
        return _isLayer2;
    }

    /**
     * Sets the current value of the 'isLayer2' property.
     * 
     */
    public void setIsLayer2(Boolean isLayer2) {
        _isLayer2 = isLayer2;
    }

    /**
     * Returns the current value of the 'networkSegment' property.
     * 
     * @return
     *     The current value of the 'networkSegment' property.
     */
    public String getNetworkSegment() {
        return _networkSegment;
    }

    /**
     * Sets the current value of the 'networkSegment' property.
     * 
     */
    public void setNetworkSegment(String networkSegment) {
        _networkSegment = networkSegment;
    }

    /**
     * Returns the current value of the 'layer2Segment' property.
     * 
     * @return
     *     The current value of the 'layer2Segment' property.
     */
    public Integer getLayer2Segment() {
        return _layer2Segment;
    }

    /**
     * Sets the current value of the 'layer2Segment' property.
     * 
     */
    public void setLayer2Segment(Integer layer2Segment) {
        _layer2Segment = layer2Segment;
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
     * Returns the list containing all of the 'networks' properties.
     * 
     */
    public List<HostModelNetwork> getNetworks() {
        if (_networks == null) {
            _networks = new ArrayList<HostModelNetwork>(3);
        }
        return _networks;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForNetworks(boolean _replace) {
        _replace_networks = _replace;
    }

    /**
     * Sets the current value of the 'bandwidth' property.
     * 
     */
    public void setBandwidth(SampleMetric bandwidth) {
        _bandwidth = bandwidth;
    }

    /**
     * Returns the current value of the bandwidth property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getBandwidth() {
        if (_bandwidth == null) {
            return null;
        }
        return _bandwidth.getValue();
    }

    /**
     * Returns the aggregate values of the bandwidth property
     * 
     */
    public SampleMetric getBandwidthAggregate() {
        return _bandwidth;
    }

    /**
     * Sets the value of the bandwidth property as a double
     * 
     */
    public void setBandwidth(Double value) {
        if (value == null) {
            _bandwidth = null;
            return ;
        }
        _bandwidth = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the bandwidth property
     * 
     */
    public void setBandwidthAggregate(Double count, Double sum) {
        _bandwidth = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the bandwidth property
     * 
     */
    public void setBandwidthAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _bandwidth = new SampleMetric(count, sum, sum_of_squares, min, max);
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
     * Sets the current value of the 'inboundPacketsDropped' property.
     * 
     */
    public void setInboundPacketsDropped(SampleMetric inboundPacketsDropped) {
        _inboundPacketsDropped = inboundPacketsDropped;
    }

    /**
     * Returns the current value of the inboundPacketsDropped property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getInboundPacketsDropped() {
        if (_inboundPacketsDropped == null) {
            return null;
        }
        return _inboundPacketsDropped.getValue();
    }

    /**
     * Returns the aggregate values of the inboundPacketsDropped property
     * 
     */
    public SampleMetric getInboundPacketsDroppedAggregate() {
        return _inboundPacketsDropped;
    }

    /**
     * Sets the value of the inboundPacketsDropped property as a double
     * 
     */
    public void setInboundPacketsDropped(Double value) {
        if (value == null) {
            _inboundPacketsDropped = null;
            return ;
        }
        _inboundPacketsDropped = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the inboundPacketsDropped property
     * 
     */
    public void setInboundPacketsDroppedAggregate(Double count, Double sum) {
        _inboundPacketsDropped = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the inboundPacketsDropped property
     * 
     */
    public void setInboundPacketsDroppedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _inboundPacketsDropped = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'outboundPacketsDropped' property.
     * 
     */
    public void setOutboundPacketsDropped(SampleMetric outboundPacketsDropped) {
        _outboundPacketsDropped = outboundPacketsDropped;
    }

    /**
     * Returns the current value of the outboundPacketsDropped property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOutboundPacketsDropped() {
        if (_outboundPacketsDropped == null) {
            return null;
        }
        return _outboundPacketsDropped.getValue();
    }

    /**
     * Returns the aggregate values of the outboundPacketsDropped property
     * 
     */
    public SampleMetric getOutboundPacketsDroppedAggregate() {
        return _outboundPacketsDropped;
    }

    /**
     * Sets the value of the outboundPacketsDropped property as a double
     * 
     */
    public void setOutboundPacketsDropped(Double value) {
        if (value == null) {
            _outboundPacketsDropped = null;
            return ;
        }
        _outboundPacketsDropped = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the outboundPacketsDropped property
     * 
     */
    public void setOutboundPacketsDroppedAggregate(Double count, Double sum) {
        _outboundPacketsDropped = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the outboundPacketsDropped property
     * 
     */
    public void setOutboundPacketsDroppedAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _outboundPacketsDropped = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'inboundErrors' property.
     * 
     */
    public void setInboundErrors(SampleMetric inboundErrors) {
        _inboundErrors = inboundErrors;
    }

    /**
     * Returns the current value of the inboundErrors property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getInboundErrors() {
        if (_inboundErrors == null) {
            return null;
        }
        return _inboundErrors.getValue();
    }

    /**
     * Returns the aggregate values of the inboundErrors property
     * 
     */
    public SampleMetric getInboundErrorsAggregate() {
        return _inboundErrors;
    }

    /**
     * Sets the value of the inboundErrors property as a double
     * 
     */
    public void setInboundErrors(Double value) {
        if (value == null) {
            _inboundErrors = null;
            return ;
        }
        _inboundErrors = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the inboundErrors property
     * 
     */
    public void setInboundErrorsAggregate(Double count, Double sum) {
        _inboundErrors = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the inboundErrors property
     * 
     */
    public void setInboundErrorsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _inboundErrors = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'outboundErrors' property.
     * 
     */
    public void setOutboundErrors(SampleMetric outboundErrors) {
        _outboundErrors = outboundErrors;
    }

    /**
     * Returns the current value of the outboundErrors property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOutboundErrors() {
        if (_outboundErrors == null) {
            return null;
        }
        return _outboundErrors.getValue();
    }

    /**
     * Returns the aggregate values of the outboundErrors property
     * 
     */
    public SampleMetric getOutboundErrorsAggregate() {
        return _outboundErrors;
    }

    /**
     * Sets the value of the outboundErrors property as a double
     * 
     */
    public void setOutboundErrors(Double value) {
        if (value == null) {
            _outboundErrors = null;
            return ;
        }
        _outboundErrors = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the outboundErrors property
     * 
     */
    public void setOutboundErrorsAggregate(Double count, Double sum) {
        _outboundErrors = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the outboundErrors property
     * 
     */
    public void setOutboundErrorsAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _outboundErrors = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Sets the current value of the 'outputQueueLength' property.
     * 
     */
    public void setOutputQueueLength(SampleMetric outputQueueLength) {
        _outputQueueLength = outputQueueLength;
    }

    /**
     * Returns the current value of the outputQueueLength property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getOutputQueueLength() {
        if (_outputQueueLength == null) {
            return null;
        }
        return _outputQueueLength.getValue();
    }

    /**
     * Returns the aggregate values of the outputQueueLength property
     * 
     */
    public SampleMetric getOutputQueueLengthAggregate() {
        return _outputQueueLength;
    }

    /**
     * Sets the value of the outputQueueLength property as a double
     * 
     */
    public void setOutputQueueLength(Double value) {
        if (value == null) {
            _outputQueueLength = null;
            return ;
        }
        _outputQueueLength = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the outputQueueLength property
     * 
     */
    public void setOutputQueueLengthAggregate(Double count, Double sum) {
        _outputQueueLength = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the outputQueueLength property
     * 
     */
    public void setOutputQueueLengthAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _outputQueueLength = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("NetworkInterface");
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
        return new NetworkInterface(getName(), getHost());
    }

}
