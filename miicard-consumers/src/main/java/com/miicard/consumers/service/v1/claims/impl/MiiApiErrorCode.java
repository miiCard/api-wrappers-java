package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for MiiApiErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MiiApiErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="AccessRevoked"/>
 *     &lt;enumeration value="UserSubscriptionLapsed"/>
 *     &lt;enumeration value="Exception"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiiApiErrorCode")
@XmlEnum
public enum MiiApiErrorCode {

	@XmlEnumValue("Success")
    SUCCESS("Success"),
    
    @XmlEnumValue("AccessRevoked")
    ACCESS_REVOKED("AccessRevoked"),
    
    @XmlEnumValue("UserSubscriptionLapsed")
    USER_SUBSCRIPTION_LAPSED("UserSubscriptionLapsed"),
    
    @XmlEnumValue("Exception")
    EXCEPTION("Exception");
    
	private final String value;

    /**
     * Value of the MiiApiErrorCode.
     * 
     * @param value value of the MiiApiErrorCode
     */
    MiiApiErrorCode(String value) {
        this.value = value;
    }

    /**
     * Value of the MiiApiErrorCode.
     * 
     * @return value of the MiiApiErrorCode
     */
    public String value() {
        return value;
    }

    /**
     * Value of the MiiApiErrorCode.
     * 
     * @param value value of the MiiApiErrorCode
     * @return MiiApiErrorCode
     */
    public final static MiiApiErrorCode fromValue(
    		final String value) {
        
    	for (MiiApiErrorCode miiApiErrorCode: MiiApiErrorCode.values()) {
    		
    		if (miiApiErrorCode.value.equals(value)) {
                return miiApiErrorCode;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
