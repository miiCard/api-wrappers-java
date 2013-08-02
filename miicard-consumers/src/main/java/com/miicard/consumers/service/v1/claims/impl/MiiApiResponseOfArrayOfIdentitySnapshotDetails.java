package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.transactional.impl.ArrayOfIdentitySnapshotDetails;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiiApiResponseOfArrayOfIdentitySnapshotDetails", propOrder = {
    "data",
    "errorCode",
    "errorMessage",
    "isTestUser",
    "status"
})
public class MiiApiResponseOfArrayOfIdentitySnapshotDetails {

    @XmlElement(name = "Data", nillable = true)
    protected ArrayOfIdentitySnapshotDetails data;
    
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
     * {@link ArrayOfIdentitySnapshotDetails }
     *     
     */
    public final ArrayOfIdentitySnapshotDetails getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value allowed object is
     * {@link ArrayOfIdentitySnapshotDetails }
     *     
     */
    public final void setData(
    		final ArrayOfIdentitySnapshotDetails value) {
        
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
