package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiiApiResponseOfAuthenticationDetails", propOrder = {
    "data",
    "errorCode",
    "errorMessage",
    "isTestUser",
    "status"
})
public class MiiApiResponseOfAuthenticationDetails {
	
    @XmlElement(name = "Data", nillable = true)
	private AuthenticationDetailsImpl data;
    
    @XmlElement(name = "ErrorCode")
	private MiiApiErrorCode errorCode;
    
    @XmlElement(name = "ErrorMessage", nillable = true)
	private String errorMessage;
    
    @XmlElement(name = "IsTestUser")
	private Boolean isTestUser;
    
    @XmlElement(name = "Status")
	private MiiApiCallStatus status;
	
	public AuthenticationDetailsImpl getData() {
		return data;
	}

	public void setData(AuthenticationDetailsImpl data) {
		this.data = data;
	}

	public MiiApiErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(MiiApiErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getIsTestUser() {
		return isTestUser;
	}

	public void setIsTestUser(Boolean isTestUser) {
		this.isTestUser = isTestUser;
	}

	public MiiApiCallStatus getStatus() {
		return status;
	}

	public void setStatus(MiiApiCallStatus status) {
		this.status = status;
	}
}
