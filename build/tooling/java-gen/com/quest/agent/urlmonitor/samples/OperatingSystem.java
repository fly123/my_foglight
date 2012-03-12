
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
 * the OperatingSystem topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:11+0800")
public class OperatingSystem
    extends HostComponent
{

    public final static String NODE_NAME = "OperatingSystem";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private String _type;
    private String _name;
    private String _architecture;
    private String _version;
    private String _servicePackMajorVersion;
    private String _servicePackMinorVersion;
    private String _buildNumber;
    private List<HostProcess> _processes;
    private boolean _replace_processes = false;
    private List<HostService> _services;
    private boolean _replace_services = false;

    public OperatingSystem(Host host) {
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
        _type = null;
        _name = null;
        _architecture = null;
        _version = null;
        _servicePackMajorVersion = null;
        _servicePackMinorVersion = null;
        _buildNumber = null;
        if (!(_processes == null)) {
            for (TopologyObject list_element: _processes) {
                list_element.reset();
            }
        }
        if (!(_services == null)) {
            for (TopologyObject list_element: _services) {
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
        if (!(_type == null)) {
            final TopologyValue _value42 = currentNode.createValue("type");
            _value42 .setSampleValue(_type.toString());
            if (__isIdentity("type")) {
                _value42 .setIsIdentity(true);
            }
        }
        if (!(_name == null)) {
            final TopologyValue _value43 = currentNode.createValue("name");
            _value43 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value43 .setIsIdentity(true);
            }
        }
        if (!(_architecture == null)) {
            final TopologyValue _value44 = currentNode.createValue("architecture");
            _value44 .setSampleValue(_architecture.toString());
            if (__isIdentity("architecture")) {
                _value44 .setIsIdentity(true);
            }
        }
        if (!(_version == null)) {
            final TopologyValue _value45 = currentNode.createValue("version");
            _value45 .setSampleValue(_version.toString());
            if (__isIdentity("version")) {
                _value45 .setIsIdentity(true);
            }
        }
        if (!(_servicePackMajorVersion == null)) {
            final TopologyValue _value46 = currentNode.createValue("servicePackMajorVersion");
            _value46 .setSampleValue(_servicePackMajorVersion.toString());
            if (__isIdentity("servicePackMajorVersion")) {
                _value46 .setIsIdentity(true);
            }
        }
        if (!(_servicePackMinorVersion == null)) {
            final TopologyValue _value47 = currentNode.createValue("servicePackMinorVersion");
            _value47 .setSampleValue(_servicePackMinorVersion.toString());
            if (__isIdentity("servicePackMinorVersion")) {
                _value47 .setIsIdentity(true);
            }
        }
        if (!(_buildNumber == null)) {
            final TopologyValue _value48 = currentNode.createValue("buildNumber");
            _value48 .setSampleValue(_buildNumber.toString());
            if (__isIdentity("buildNumber")) {
                _value48 .setIsIdentity(true);
            }
        }
        if (!(_processes == null)) {
            for (TopologyObject list_element: _processes) {
                final TopologyNode _node49 = currentNode.createNode("processes");
                if (__isIdentity("processes")) {
                    _node49 .setIsIdentity(true);
                }
                if (_replace_processes) {
                    _node49 .setReplace(true);
                }
                _replace_processes = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node49 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node49 .setTypeHint(list_element.__getNodeName());
                    _node49 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node49, unitService, submitted);
                }
            }
        }
        if (!(_services == null)) {
            for (TopologyObject list_element: _services) {
                final TopologyNode _node50 = currentNode.createNode("services");
                if (__isIdentity("services")) {
                    _node50 .setIsIdentity(true);
                }
                if (_replace_services) {
                    _node50 .setReplace(true);
                }
                _replace_services = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node50 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node50 .setTypeHint(list_element.__getNodeName());
                    _node50 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node50, unitService, submitted);
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
     * Returns the current value of the 'type' property.
     * 
     * @return
     *     The current value of the 'type' property.
     */
    public String getType() {
        return _type;
    }

    /**
     * Sets the current value of the 'type' property.
     * 
     */
    public void setType(String type) {
        _type = type;
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
     * Sets the current value of the 'name' property.
     * 
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * Returns the current value of the 'architecture' property.
     * 
     * @return
     *     The current value of the 'architecture' property.
     */
    public String getArchitecture() {
        return _architecture;
    }

    /**
     * Sets the current value of the 'architecture' property.
     * 
     */
    public void setArchitecture(String architecture) {
        _architecture = architecture;
    }

    /**
     * Returns the current value of the 'version' property.
     * 
     * @return
     *     The current value of the 'version' property.
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Sets the current value of the 'version' property.
     * 
     */
    public void setVersion(String version) {
        _version = version;
    }

    /**
     * Returns the current value of the 'servicePackMajorVersion' property.
     * 
     * @return
     *     The current value of the 'servicePackMajorVersion' property.
     */
    public String getServicePackMajorVersion() {
        return _servicePackMajorVersion;
    }

    /**
     * Sets the current value of the 'servicePackMajorVersion' property.
     * 
     */
    public void setServicePackMajorVersion(String servicePackMajorVersion) {
        _servicePackMajorVersion = servicePackMajorVersion;
    }

    /**
     * Returns the current value of the 'servicePackMinorVersion' property.
     * 
     * @return
     *     The current value of the 'servicePackMinorVersion' property.
     */
    public String getServicePackMinorVersion() {
        return _servicePackMinorVersion;
    }

    /**
     * Sets the current value of the 'servicePackMinorVersion' property.
     * 
     */
    public void setServicePackMinorVersion(String servicePackMinorVersion) {
        _servicePackMinorVersion = servicePackMinorVersion;
    }

    /**
     * Returns the current value of the 'buildNumber' property.
     * 
     * @return
     *     The current value of the 'buildNumber' property.
     */
    public String getBuildNumber() {
        return _buildNumber;
    }

    /**
     * Sets the current value of the 'buildNumber' property.
     * 
     */
    public void setBuildNumber(String buildNumber) {
        _buildNumber = buildNumber;
    }

    /**
     * Returns the list containing all of the 'processes' properties.
     * 
     */
    public List<HostProcess> getProcesses() {
        if (_processes == null) {
            _processes = new ArrayList<HostProcess>(3);
        }
        return _processes;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForProcesses(boolean _replace) {
        _replace_processes = _replace;
    }

    /**
     * Returns the list containing all of the 'services' properties.
     * 
     */
    public List<HostService> getServices() {
        if (_services == null) {
            _services = new ArrayList<HostService>(3);
        }
        return _services;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForServices(boolean _replace) {
        _replace_services = _replace;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("OperatingSystem");
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
        return new OperatingSystem(getHost());
    }

}
