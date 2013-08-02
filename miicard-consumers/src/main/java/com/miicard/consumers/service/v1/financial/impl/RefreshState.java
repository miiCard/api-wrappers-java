package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name = "MiiApiCallStatus")
@XmlEnum
public enum RefreshState {
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DataAvailable")
    DATAAVAILABLE("DataAvailable"),
    @XmlEnumValue("InProgress")
    INPROGRESS("InProgress");
    private final String value;
    
    RefreshState(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public final static RefreshState fromValue(
    		final String value) {
        
    	for (RefreshState c: RefreshState.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
