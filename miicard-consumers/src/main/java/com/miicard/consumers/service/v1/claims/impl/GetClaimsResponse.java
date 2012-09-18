package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetClaimsResult" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}MiiApiResponseOfMiiUserProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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
