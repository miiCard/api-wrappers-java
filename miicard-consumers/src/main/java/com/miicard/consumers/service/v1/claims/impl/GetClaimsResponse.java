package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getClaimsResult"
})
@XmlRootElement(name = "GetClaimsResponse", namespace = "http://tempuri.org/")
class GetClaimsResponse {

	/**
	 * Results of Claims as MiiApiResponseOfMiiUserProfile.
	 */
    @XmlElement(name = "GetClaimsResult", namespace = "http://tempuri.org/", nillable = true)
    protected MiiApiResponseOfMiiUserProfile getClaimsResult;

    /**
     * Gets the value of the getClaimsResult property.
     * 
     * @return possible object is
     * {@link MiiApiResponseOfMiiUserProfile }
     *     
     */
    public final MiiApiResponseOfMiiUserProfile getGetClaimsResult() {
        return getClaimsResult;
    }

    /**
     * Sets the value of the getClaimsResult property.
     * 
     * @param value allowed object is
     * {@link MiiApiResponseOfMiiUserProfile }
     *     
     */
    public final void setGetClaimsResult(
    		final MiiApiResponseOfMiiUserProfile value) {
        
    	this.getClaimsResult = value;
    }
}
