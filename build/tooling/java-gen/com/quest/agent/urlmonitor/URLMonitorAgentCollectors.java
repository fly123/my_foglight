
package com.quest.agent.urlmonitor;

import javax.annotation.Generated;
import com.quest.glue.api.agent.CollectorAware;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * 
 * This interface defines the set of methods that are required for a Cartridge Developer to implement
 * in order to enable Data Collection
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:10+0800")
public interface URLMonitorAgentCollectors
    extends CollectorAware
{


    /**
     * URL Collector Data Collector
     * 
     * @param expectedFrequency
     *     The expected frequency expressed in milliseconds
     */
    void collectURLs(long expectedFrequency);

}
