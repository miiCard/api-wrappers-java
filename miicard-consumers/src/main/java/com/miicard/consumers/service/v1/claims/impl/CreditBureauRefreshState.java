package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name = "CreditBureauRefreshState")
@XmlEnum
public enum CreditBureauRefreshState {
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DataAvailable")
    DATAAVAILABLE("DataAvailable"),
    @XmlEnumValue("InProgress")
    INPROGRESS("InProgress");
    private final String value;
    
    CreditBureauRefreshState(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public final static CreditBureauRefreshState fromValue(
    		final String value) {
        
    	for (CreditBureauRefreshState c: CreditBureauRefreshState.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
