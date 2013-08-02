package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name = "QualificationType")
@XmlEnum
public enum QualificationType {

    @XmlEnumValue("Academic")
    ACADEMIC("Academic"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional");
    private final String value;

    QualificationType(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
    
    public final static QualificationType fromValue(
    		final String value) {
        
    	for (QualificationType c: QualificationType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
