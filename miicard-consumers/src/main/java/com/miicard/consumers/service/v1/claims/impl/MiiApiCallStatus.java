package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for MiiApiCallStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MiiApiCallStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiiApiCallStatus")
@XmlEnum
public enum MiiApiCallStatus {

	/**
	 * Value of the MiiApiCallStatus.
	 */
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failure")
    FAILURE("Failure");
    private final String value;

    /**
     * Value of the MiiApiCallStatus.
     * 
     * @param value value of the MiiApiCallStatus
     */
    MiiApiCallStatus(final String value) {
        this.value = value;
    }

    /**
     * Value of the MiiApiCallStatus.
     * 
     * @return value of the MiiApiCallStatus
     */
    public String value() {
        return value;
    }

    /**
     * Value of the MiiApiCallStatus.
     * 
     * @param value value of the MiiApiCallStatus
     * @return MiiApiCallStatus
     */
    public final static MiiApiCallStatus fromValue(
    		final String value) {
        
    	for (MiiApiCallStatus c: MiiApiCallStatus.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }
}
