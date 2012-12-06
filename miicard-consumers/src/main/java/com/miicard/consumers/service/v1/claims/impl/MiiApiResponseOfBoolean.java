package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for MiiApiResponseOfboolean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiiApiResponseOfboolean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}MiiApiErrorCode" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}MiiApiCallStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiiApiResponseOfboolean", propOrder = {
    "data",
    "errorCode",
    "errorMessage",
    "isTestUser",
    "status"
})
public class MiiApiResponseOfBoolean {

    @XmlElement(name = "Data")
    protected Boolean data;
    
    @XmlElement(name = "ErrorCode")
    protected MiiApiErrorCode errorCode;
    
    @XmlElement(name = "ErrorMessage", nillable = true)
    protected String errorMessage;
    
    @XmlElement(name = "IsTestUser")
    protected Boolean isTestUser;
    
    @XmlElement(name = "Status")
    protected MiiApiCallStatus status;

    /**
     * Gets the value of the data property.
     * 
     * @return possible object is
     * {@link Boolean }
     *     
     */
    public final Boolean isData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value allowed object is
     * {@link Boolean }
     *     
     */
    public final void setData(
    		final Boolean value) {
        
    	this.data = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return possible object is
     * {@link MiiApiErrorCode }
     *     
     */
    public final MiiApiErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value allowed object is
     * {@link MiiApiErrorCode }
     *     
     */
    public final void setErrorCode(
    		final MiiApiErrorCode value) {
        
    	this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return possible object is 
     * {@link String }
     *     
     */
    public final String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setErrorMessage(
    		final String value) {
        
    	this.errorMessage = value;
    }
    
    public final Boolean getIsTestUser() {
    	return isTestUser;
    }
    
    public final void setIsTestUser(Boolean isTestUser)
    {
    	this.isTestUser = isTestUser;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is
     * {@link MiiApiCallStatus }
     *     
     */
    public final MiiApiCallStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is
     * {@link MiiApiCallStatus }
     *     
     */
    public final void setStatus(
    		final MiiApiCallStatus value) {
        
    	this.status = value;
    }
}
