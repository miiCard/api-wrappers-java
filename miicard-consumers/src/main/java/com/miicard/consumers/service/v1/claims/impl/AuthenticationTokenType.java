package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name = "AuthenticationTokenType")
@XmlEnum
public enum AuthenticationTokenType {
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Soft")
    SOFT("Soft"),
    @XmlEnumValue("Hard")
    HARD("Hard");
    private final String value;

    AuthenticationTokenType(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
    
    public final static AuthenticationTokenType fromValue(
    		final String value) {
        
    	for (AuthenticationTokenType c: AuthenticationTokenType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
