
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
 * the IPAddress topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:11+0800")
public class IPAddress
    extends HostBaseObject
{

    public final static String NODE_NAME = "IPAddress";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _address;
    private List<NetworkPath> _originatingPaths;
    private boolean _replace_originatingPaths = false;
    private List<NetworkPath> _terminatingPaths;
    private boolean _replace_terminatingPaths = false;
    private Host _host;

    public IPAddress(String address) {
        if (address == null) {
            throw new NullPointerException("The required identity property 'address' cannot be null");
        }
        if (address.length() == 0) {
            throw new NullPointerException("The required identity property 'address' cannot be an empty string");
        }
        _address = address;
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
        if (!(_originatingPaths == null)) {
            for (TopologyObject list_element: _originatingPaths) {
                list_element.reset();
            }
        }
        if (!(_terminatingPaths == null)) {
            for (TopologyObject list_element: _terminatingPaths) {
                list_element.reset();
            }
        }
        if (!(_host == null)) {
            _host.reset();
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
        if (!(_address == null)) {
            final TopologyValue _value27 = currentNode.createValue("address");
            _value27 .setSampleValue(_address.toString());
            if (__isIdentity("address")) {
                _value27 .setIsIdentity(true);
            }
        }
        if (!(_originatingPaths == null)) {
            for (TopologyObject list_element: _originatingPaths) {
                final TopologyNode _node28 = currentNode.createNode("originatingPaths");
                if (__isIdentity("originatingPaths")) {
                    _node28 .setIsIdentity(true);
                }
                if (_replace_originatingPaths) {
                    _node28 .setReplace(true);
                }
                _replace_originatingPaths = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node28 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node28 .setTypeHint(list_element.__getNodeName());
                    _node28 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node28, unitService, submitted);
                }
            }
        }
        if (!(_terminatingPaths == null)) {
            for (TopologyObject list_element: _terminatingPaths) {
                final TopologyNode _node29 = currentNode.createNode("terminatingPaths");
                if (__isIdentity("terminatingPaths")) {
                    _node29 .setIsIdentity(true);
                }
                if (_replace_terminatingPaths) {
                    _node29 .setReplace(true);
                }
                _replace_terminatingPaths = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node29 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node29 .setTypeHint(list_element.__getNodeName());
                    _node29 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node29, unitService, submitted);
                }
            }
        }
        if (!(_host == null)) {
            final TopologyNode _node30 = currentNode.createNode("host");
            if (__isIdentity("host")) {
                _node30 .setIsIdentity(true);
            }
            if (submitted.contains(_host.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node30 .setRefId(_host.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node30 .setTypeHint(_host.__getNodeName());
                _node30 .setId(_host.__getNodeId().toString());
                _host.addToNodeTree(_node30, unitService, submitted);
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
        // The address is an identity or required property for this class
        if ("address".equals(name)) {
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
     * Returns the current value of the 'address' property.
     * 
     * @return
     *     The current value of the 'address' property.
     */
    public String getAddress() {
        return _address;
    }

    /**
     * Returns the list containing all of the 'originatingPaths' properties.
     * 
     */
    public List<NetworkPath> getOriginatingPaths() {
        if (_originatingPaths == null) {
            _originatingPaths = new ArrayList<NetworkPath>(3);
        }
        return _originatingPaths;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForOriginatingPaths(boolean _replace) {
        _replace_originatingPaths = _replace;
    }

    /**
     * Returns the list containing all of the 'terminatingPaths' properties.
     * 
     */
    public List<NetworkPath> getTerminatingPaths() {
        if (_terminatingPaths == null) {
            _terminatingPaths = new ArrayList<NetworkPath>(3);
        }
        return _terminatingPaths;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForTerminatingPaths(boolean _replace) {
        _replace_terminatingPaths = _replace;
    }

    /**
     * Returns the current value of the 'host' property.
     * 
     * @return
     *     The current value of the 'host' property.
     * @deprecated
     *     The topology-types definition indicates that this property is deprecated
     */
    @Deprecated
    public Host getHost() {
        return _host;
    }

    /**
     * Sets the current value of the 'host' property.
     * 
     * @deprecated
     *     The topology-types definition indicates that this property is deprecated
     */
    @Deprecated
    public void setHost(Host host) {
        _host = host;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("IPAddress");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("HostBaseObject");
        builder.append(", ");
        builder.append("address");
        builder.append("=");
        builder.append(getAddress());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new IPAddress(getAddress());
    }

}
