
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
@Generated(value = "FglAM Developer's Kit 5.6.2 (562-20110915-1606-b97)", date = "2012-03-12T14:29:07+0800")
public enum HostDiscoveryStatus {

    INACTIVE("Inactive", "0", "1"),
    ACTIVE("Active", "1", "0");
    private final String mName;
    private final String mValue;
    private final String mIndex;

    private HostDiscoveryStatus(String name, String value, String index) {
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
