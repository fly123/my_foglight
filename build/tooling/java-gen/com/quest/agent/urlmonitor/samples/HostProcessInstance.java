
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
 * the HostProcessInstance topology object.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public class HostProcessInstance
    extends DataObject
{

    public final static String NODE_NAME = "HostProcessInstance";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _pid;
    private String _parentPid;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final HostProcess _process;
    private Float _percentProcessorTime;
    private Double _totalProcessorTime;
    private Float _percentMemory;
    private Double _virtualSize;
    private Double _workingSetSize;
    private Double _swapSize;
    private Float _pageFaults;
    private Double _dataRead;
    private Double _dataWritten;
    private Double _dataOther;
    private Double _operationsRead;
    private Double _operationsWrite;
    private Double _operationsOther;

    public HostProcessInstance(String pid, HostProcess process) {
        if (pid == null) {
            throw new NullPointerException("The required identity property 'pid' cannot be null");
        }
        if (pid.length() == 0) {
            throw new NullPointerException("The required identity property 'pid' cannot be an empty string");
        }
        _pid = pid;
        if (process == null) {
            throw new NullPointerException("The required identity property 'process' cannot be null");
        }
        _process = process;
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
        _parentPid = null;
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
        _operationsRead = null;
        _operationsWrite = null;
        _operationsOther = null;
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
        if (!(_pid == null)) {
            final TopologyValue _value79 = currentNode.createValue("pid");
            _value79 .setSampleValue(_pid.toString());
            if (__isIdentity("pid")) {
                _value79 .setIsIdentity(true);
            }
        }
        if (!(_parentPid == null)) {
            final TopologyValue _value80 = currentNode.createValue("parentPid");
            _value80 .setSampleValue(_parentPid.toString());
            if (__isIdentity("parentPid")) {
                _value80 .setIsIdentity(true);
            }
        }
        if (!(_process == null)) {
            final TopologyNode _node81 = currentNode.createNode("process");
            if (__isIdentity("process")) {
                _node81 .setIsIdentity(true);
            }
            if (submitted.contains(_process.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node81 .setRefId(_process.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node81 .setTypeHint(_process.__getNodeName());
                _node81 .setId(_process.__getNodeId().toString());
                _process.addToNodeTree(_node81, unitService, submitted);
            }
        }
        if (!(_percentProcessorTime == null)) {
            final TopologyValue _value82 = currentNode.createValue("percentProcessorTime");
            _value82 .setSampleValue(_percentProcessorTime, unitService.getUnits("percent"));
            if (__isIdentity("percentProcessorTime")) {
                _value82 .setIsIdentity(true);
            }
        }
        if (!(_totalProcessorTime == null)) {
            final TopologyValue _value83 = currentNode.createValue("totalProcessorTime");
            _value83 .setSampleValue(_totalProcessorTime, unitService.getUnits("second"));
            if (__isIdentity("totalProcessorTime")) {
                _value83 .setIsIdentity(true);
            }
        }
        if (!(_percentMemory == null)) {
            final TopologyValue _value84 = currentNode.createValue("percentMemory");
            _value84 .setSampleValue(_percentMemory, unitService.getUnits("percent"));
            if (__isIdentity("percentMemory")) {
                _value84 .setIsIdentity(true);
            }
        }
        if (!(_virtualSize == null)) {
            final TopologyValue _value85 = currentNode.createValue("virtualSize");
            _value85 .setSampleValue(_virtualSize, unitService.getUnits("kilobyte"));
            if (__isIdentity("virtualSize")) {
                _value85 .setIsIdentity(true);
            }
        }
        if (!(_workingSetSize == null)) {
            final TopologyValue _value86 = currentNode.createValue("workingSetSize");
            _value86 .setSampleValue(_workingSetSize, unitService.getUnits("kilobyte"));
            if (__isIdentity("workingSetSize")) {
                _value86 .setIsIdentity(true);
            }
        }
        if (!(_swapSize == null)) {
            final TopologyValue _value87 = currentNode.createValue("swapSize");
            _value87 .setSampleValue(_swapSize, unitService.getUnits("kilobyte"));
            if (__isIdentity("swapSize")) {
                _value87 .setIsIdentity(true);
            }
        }
        if (!(_pageFaults == null)) {
            final TopologyValue _value88 = currentNode.createValue("pageFaults");
            _value88 .setSampleValue(_pageFaults, unitService.getUnits("count/second"));
            if (__isIdentity("pageFaults")) {
                _value88 .setIsIdentity(true);
            }
        }
        if (!(_dataRead == null)) {
            final TopologyValue _value89 = currentNode.createValue("dataRead");
            _value89 .setSampleValue(_dataRead, unitService.getUnits("byte/second"));
            if (__isIdentity("dataRead")) {
                _value89 .setIsIdentity(true);
            }
        }
        if (!(_dataWritten == null)) {
            final TopologyValue _value90 = currentNode.createValue("dataWritten");
            _value90 .setSampleValue(_dataWritten, unitService.getUnits("byte/second"));
            if (__isIdentity("dataWritten")) {
                _value90 .setIsIdentity(true);
            }
        }
        if (!(_dataOther == null)) {
            final TopologyValue _value91 = currentNode.createValue("dataOther");
            _value91 .setSampleValue(_dataOther, unitService.getUnits("byte/second"));
            if (__isIdentity("dataOther")) {
                _value91 .setIsIdentity(true);
            }
        }
        if (!(_operationsRead == null)) {
            final TopologyValue _value92 = currentNode.createValue("operationsRead");
            _value92 .setSampleValue(_operationsRead, unitService.getUnits("count/second"));
            if (__isIdentity("operationsRead")) {
                _value92 .setIsIdentity(true);
            }
        }
        if (!(_operationsWrite == null)) {
            final TopologyValue _value93 = currentNode.createValue("operationsWrite");
            _value93 .setSampleValue(_operationsWrite, unitService.getUnits("count/second"));
            if (__isIdentity("operationsWrite")) {
                _value93 .setIsIdentity(true);
            }
        }
        if (!(_operationsOther == null)) {
            final TopologyValue _value94 = currentNode.createValue("operationsOther");
            _value94 .setSampleValue(_operationsOther, unitService.getUnits("count/second"));
            if (__isIdentity("operationsOther")) {
                _value94 .setIsIdentity(true);
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
        // The pid is an identity or required property for this class
        if ("pid".equals(name)) {
            return true;
        }
        // The process is an identity or required property for this class
        if ("process".equals(name)) {
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
     * Returns the current value of the 'pid' property.
     * 
     * @return
     *     The current value of the 'pid' property.
     */
    public String getPid() {
        return _pid;
    }

    /**
     * Returns the current value of the 'parentPid' property.
     * 
     * @return
     *     The current value of the 'parentPid' property.
     */
    public String getParentPid() {
        return _parentPid;
    }

    /**
     * Sets the current value of the 'parentPid' property.
     * 
     */
    public void setParentPid(String parentPid) {
        _parentPid = parentPid;
    }

    /**
     * Returns the current value of the 'process' property.
     * 
     * @return
     *     The current value of the 'process' property.
     */
    public HostProcess getProcess() {
        return _process;
    }

    /**
     * Returns the current value of the 'percentProcessorTime' property.
     * 
     * @return
     *     The current value of the 'percentProcessorTime' property.
     */
    public Float getPercentProcessorTime() {
        return _percentProcessorTime;
    }

    /**
     * Sets the current value of the 'percentProcessorTime' property.
     * 
     */
    public void setPercentProcessorTime(Float percentProcessorTime) {
        _percentProcessorTime = percentProcessorTime;
    }

    /**
     * Returns the current value of the 'totalProcessorTime' property.
     * 
     * @return
     *     The current value of the 'totalProcessorTime' property.
     */
    public Double getTotalProcessorTime() {
        return _totalProcessorTime;
    }

    /**
     * Sets the current value of the 'totalProcessorTime' property.
     * 
     */
    public void setTotalProcessorTime(Double totalProcessorTime) {
        _totalProcessorTime = totalProcessorTime;
    }

    /**
     * Returns the current value of the 'percentMemory' property.
     * 
     * @return
     *     The current value of the 'percentMemory' property.
     */
    public Float getPercentMemory() {
        return _percentMemory;
    }

    /**
     * Sets the current value of the 'percentMemory' property.
     * 
     */
    public void setPercentMemory(Float percentMemory) {
        _percentMemory = percentMemory;
    }

    /**
     * Returns the current value of the 'virtualSize' property.
     * 
     * @return
     *     The current value of the 'virtualSize' property.
     */
    public Double getVirtualSize() {
        return _virtualSize;
    }

    /**
     * Sets the current value of the 'virtualSize' property.
     * 
     */
    public void setVirtualSize(Double virtualSize) {
        _virtualSize = virtualSize;
    }

    /**
     * Returns the current value of the 'workingSetSize' property.
     * 
     * @return
     *     The current value of the 'workingSetSize' property.
     */
    public Double getWorkingSetSize() {
        return _workingSetSize;
    }

    /**
     * Sets the current value of the 'workingSetSize' property.
     * 
     */
    public void setWorkingSetSize(Double workingSetSize) {
        _workingSetSize = workingSetSize;
    }

    /**
     * Returns the current value of the 'swapSize' property.
     * 
     * @return
     *     The current value of the 'swapSize' property.
     */
    public Double getSwapSize() {
        return _swapSize;
    }

    /**
     * Sets the current value of the 'swapSize' property.
     * 
     */
    public void setSwapSize(Double swapSize) {
        _swapSize = swapSize;
    }

    /**
     * Returns the current value of the 'pageFaults' property.
     * 
     * @return
     *     The current value of the 'pageFaults' property.
     */
    public Float getPageFaults() {
        return _pageFaults;
    }

    /**
     * Sets the current value of the 'pageFaults' property.
     * 
     */
    public void setPageFaults(Float pageFaults) {
        _pageFaults = pageFaults;
    }

    /**
     * Returns the current value of the 'dataRead' property.
     * 
     * @return
     *     The current value of the 'dataRead' property.
     */
    public Double getDataRead() {
        return _dataRead;
    }

    /**
     * Sets the current value of the 'dataRead' property.
     * 
     */
    public void setDataRead(Double dataRead) {
        _dataRead = dataRead;
    }

    /**
     * Returns the current value of the 'dataWritten' property.
     * 
     * @return
     *     The current value of the 'dataWritten' property.
     */
    public Double getDataWritten() {
        return _dataWritten;
    }

    /**
     * Sets the current value of the 'dataWritten' property.
     * 
     */
    public void setDataWritten(Double dataWritten) {
        _dataWritten = dataWritten;
    }

    /**
     * Returns the current value of the 'dataOther' property.
     * 
     * @return
     *     The current value of the 'dataOther' property.
     */
    public Double getDataOther() {
        return _dataOther;
    }

    /**
     * Sets the current value of the 'dataOther' property.
     * 
     */
    public void setDataOther(Double dataOther) {
        _dataOther = dataOther;
    }

    /**
     * Returns the current value of the 'operationsRead' property.
     * 
     * @return
     *     The current value of the 'operationsRead' property.
     */
    public Double getOperationsRead() {
        return _operationsRead;
    }

    /**
     * Sets the current value of the 'operationsRead' property.
     * 
     */
    public void setOperationsRead(Double operationsRead) {
        _operationsRead = operationsRead;
    }

    /**
     * Returns the current value of the 'operationsWrite' property.
     * 
     * @return
     *     The current value of the 'operationsWrite' property.
     */
    public Double getOperationsWrite() {
        return _operationsWrite;
    }

    /**
     * Sets the current value of the 'operationsWrite' property.
     * 
     */
    public void setOperationsWrite(Double operationsWrite) {
        _operationsWrite = operationsWrite;
    }

    /**
     * Returns the current value of the 'operationsOther' property.
     * 
     * @return
     *     The current value of the 'operationsOther' property.
     */
    public Double getOperationsOther() {
        return _operationsOther;
    }

    /**
     * Sets the current value of the 'operationsOther' property.
     * 
     */
    public void setOperationsOther(Double operationsOther) {
        _operationsOther = operationsOther;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("HostProcessInstance");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("DataObject");
        builder.append(", ");
        builder.append("pid");
        builder.append("=");
        builder.append(getPid());
        builder.append(", ");
        builder.append("process");
        builder.append("=");
        builder.append(getProcess());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new HostProcessInstance(getPid(), getProcess());
    }

}
