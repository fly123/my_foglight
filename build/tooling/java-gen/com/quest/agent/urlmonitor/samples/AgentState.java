
package com.quest.agent.urlmonitor.samples;

import javax.annotation.Generated;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This enumeration contains no data of its own,
 * but is used by other topology classes.
 * <p/>
 * This class was generated using version 5.6.2 (562-20110915-1606-b97) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T18:35:11+0800")
public enum AgentState {

    UNKNOWN("Unknown", "0.0", "0"),
    STOPPED("Stopped", "1.0", "1"),
    STARTING("Starting", "2.0", "2"),
    STOPPING("Stopping", "3.0", "3"),
    RUNNING("Running", "4.0", "4"),
    COLLECTING_DATA("Collecting data", "5.0", "5"),
    RUNNING_BUT_NOT_COLLECTING_DATA("Running but not collecting data", "6.0", "6"),
    FAILED_TO_START("Failed to start", "7.0", "7"),
    FAILED_TO_START_DATA_COLLECTION("Failed to start data collection", "8.0", "8");
    private final String mName;
    private final String mValue;
    private final String mIndex;

    private AgentState(String name, String value, String index) {
        mName = name;
        mValue = value;
        mIndex = index;
    }

    public String getName() {
        return mName;
    }

    public String getValue() {
        return mValue;
    }

    public String getIndex() {
        return mIndex;
    }

}
