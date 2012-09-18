package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.Identity;

/**
 * <p>Java class for Identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}Claim">
 *       &lt;sequence>
 *         &lt;element name="ProfileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identity", propOrder = {
    "profileUrl",
    "source",
    "userId"
})
class IdentityImpl extends ClaimImpl implements Identity {

	/**
	 * String of the Profile URL.
	 */
    @XmlElement(name = "ProfileUrl", nillable = true)
    protected String profileUrl;
    
    /**
     * String of the Source.
     */
    @XmlElement(name = "Source", nillable = true)
    protected String source;
    
    /**
     * String of the User ID.
     */
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;

    /**
     * {@inheritDoc}
     */
    public final String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Sets the value of the profileUrl property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setProfileUrl(
    		final String value) {
        this.profileUrl = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setSource(
    		final String value) {
        
    	this.source = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setUserId(
    		final String value) {
        
    	this.userId = value;
    }
}
