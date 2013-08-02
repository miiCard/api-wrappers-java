package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for IsSocialAccountAssured complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socialAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "socialAccountId",
    "socialAccountType"
})
@XmlRootElement(name = "IsSocialAccountAssured", namespace = "http://tempuri.org/")
class IsSocialAccountAssured {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String socialAccountId;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String socialAccountType;

    /**
     * Gets the value of the socialAccountId property.
     * 
     * @return possible object is
     * {@link String }
     *     
     */
    public final String getSocialAccountId() {
        return socialAccountId;
    }

    /**
     * Sets the value of the socialAccountId property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setSocialAccountId(
    		final String value) {
        
    	this.socialAccountId = value;
    }

    /**
     * Gets the value of the socialAccountType property.
     * 
     * @return possible object is
     * {@link String }
     *     
     */
    public final String getSocialAccountType() {
        return socialAccountType;
    }

    /**
     * Sets the value of the socialAccountType property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setSocialAccountType(
    		final String value) {
        
    	this.socialAccountType = value;
    }
}
