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
@SuppressWarnings("restriction")
@XmlType(name = "MiiApiErrorCode")
@XmlEnum
public enum MiiApiErrorCode {

	@XmlEnumValue("Success")
    SUCCESS("Success", 0),
    
    @XmlEnumValue("UnknownSearchCriterion")
    UNKNOWN_SEARCH_CRITERION("UnknownSearchCriterion", 10),
    
    @XmlEnumValue("NoMatches")
	NO_MATCHES("NoMatches", 11),
    
    @XmlEnumValue("AccessRevoked")
    ACCESS_REVOKED("AccessRevoked", 100),
    
    @XmlEnumValue("UserSubscriptionLapsed")
    USER_SUBSCRIPTION_LAPSED("UserSubscriptionLapsed", 200),
    
    @XmlEnumValue("TransactionalSupportDisabled")
	TRANSACTIONAL_SUPPORT_DISABLED("TransactionalSupportDisabled", 1000),
	
	@XmlEnumValue("FinancialDataSupportDisabled")
	FINANCIAL_DATA_SUPPORT_DISABLED("FinancialDataSupportDisabled", 1001),
	
	@XmlEnumValue("DevelopmentTransactionalSupportOnly")
	DEVELOPMENT_TRANSACTIONAL_SUPPORT_ONLY("DevelopmentTransactionalSupportOnly", 1010),
	
	@XmlEnumValue("InvalidSnapshotId")
	INVALID_SNAPSHOT_ID("InvalidSnapshotId", 1020),
	
	@XmlEnumValue("Blacklisted")
	BLACKLISTED("Blacklisted", 2000),
	
	@XmlEnumValue("ProductDisabled")
	PRODUCT_DISABLED("ProductDisabled", 2010),
	
	@XmlEnumValue("ProductDeleted")
	PRODUCT_DELETED("ProductDeleted", 2020),
    
    @XmlEnumValue("Exception")
    EXCEPTION("Exception", 10000);
    
	private final String value;
	private final Integer valueInteger;

    /**
     * Value of the MiiApiErrorCode.
     * 
     * @param value value of the MiiApiErrorCode
     */
    MiiApiErrorCode(String value, Integer valueInteger) {
        this.value = value;
        this.valueInteger = valueInteger;
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
     * Value of the MiiApiErrorCode as an integer representation that
     * matches the API documentation. 
     * 
     * @return value of the MiiApiErrorCode as an integer
     */
    public Integer valueInteger() {
    	return valueInteger;
    }

    public final static MiiApiErrorCode fromValue(
    		final String value) {
        
    	for (MiiApiErrorCode miiApiErrorCode: MiiApiErrorCode.values()) {
    		
    		if (miiApiErrorCode.value.equals(value)) {
                return miiApiErrorCode;
            }
        }
        
    	throw new IllegalArgumentException(value);
    }    

    public final static MiiApiErrorCode fromValue(
    		final Integer value) {
        
    	for (MiiApiErrorCode miiApiErrorCode: MiiApiErrorCode.values()) {
    		
    		if (miiApiErrorCode.valueInteger.equals(value)) {
                return miiApiErrorCode;
            }
        }
        
    	throw new IllegalArgumentException();
    }
}
