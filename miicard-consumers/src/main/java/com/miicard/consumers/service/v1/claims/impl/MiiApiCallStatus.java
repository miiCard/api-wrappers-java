package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name = "MiiApiCallStatus")
@XmlEnum
public enum MiiApiCallStatus {

	/**
	 * Value of the MiiApiCallStatus.
	 */
    @XmlEnumValue("Success")
    SUCCESS("Success", 0),
    @XmlEnumValue("Failure")
    FAILURE("Failure", 1),
    @XmlEnumValue("Pending")
    PENDING("Pending", 2);
    
    private final String value;
    private final Integer valueInteger;


    /**
     * Value of the MiiApiCallStatus.
     * 
     * @param value value of the MiiApiCallStatus
     */
    MiiApiCallStatus(final String value, final Integer valueInteger) {
        this.value = value;
        this.valueInteger = valueInteger;
    }

    /**
     * Value of the MiiApiCallStatus.
     * 
     * @return value of the MiiApiCallStatus
     */
    public String value() {
        return value;
    }
    
    public Integer valueInteger() {
    	return valueInteger;
    }
    
    public final static MiiApiCallStatus fromValue(final String value) {
        
    	for (MiiApiCallStatus c: MiiApiCallStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
    
    public final static MiiApiCallStatus fromValue(final Integer value) {
        
    	for (MiiApiCallStatus c: MiiApiCallStatus.values()) {
            if (c.valueInteger.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException();
    }
}
