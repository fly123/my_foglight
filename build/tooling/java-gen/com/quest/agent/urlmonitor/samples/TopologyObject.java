
package com.quest.agent.urlmonitor.samples;

import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * The abstract base class of all user and core objects.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public abstract class TopologyObject {


    /**
     * Resets all non-identity fields to null.
     * Fields that are themselves topology objects are not null'ed out,
     * but do have their reset() methods called.
     * 
     */
    abstract void reset();

    /**
     * Adds the relevant portions of this topology sample using the provided node
     * 
     * @param submitted
     *     The set of classes that have already been submitted.
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    protected abstract void addToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    ;

    /**
     * Adds the relevant portions of this topology sample using the provided node
     * 
     * @param submitted
     *     The set of classes that have already been submitted.
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    protected abstract void addPropertiesToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    ;

    /**
     * Returns the actual type name of the topology object. This is used during submission.
     * 
     */
    protected abstract String __getNodeName();

    /**
     * Determines if the provided property name is an identity property for this
     * class or any super-classes.
     * 
     */
    protected boolean __isIdentity(String name) {
        // No identity fields in this abstract base class
        return false;
    }

    /**
     * Returns a copy of this topology object with only the ID properties set.
     * 
     */
    protected abstract java.lang.Object __cloneIdOnly();

    /**
     * Returns the unique node ID for this instance of this topology object.
     * 
     */
    protected abstract UUID __getNodeId();

}
