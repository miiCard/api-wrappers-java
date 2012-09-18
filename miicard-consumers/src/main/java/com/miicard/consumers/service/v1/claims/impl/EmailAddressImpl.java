package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.EmailAddress;

/**
 * <p>Java class for EmailAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}Claim">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddress", propOrder = {
    "address",
    "displayName",
    "isPrimary"
})
class EmailAddressImpl extends ClaimImpl implements EmailAddress {

	/**
	 * String of the Address.
	 */
    @XmlElement(name = "Address", nillable = true)
    protected String address;
    
    /**
     * String of the Display name.
     */
    @XmlElement(name = "DisplayName", nillable = true)
    protected String displayName;
    
    /**
     * Boolean if Address is primary address.
     */
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    
    /**
     * {@inheritDoc}
     */
    public final String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setAddress(
    		final String value) {
        
    	this.address = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setDisplayName(
    		final String value) {
        
    	this.displayName = value;
    }

    /**
     * {@inheritDoc}
     */
    public final Boolean isPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value allowed object is
     * {@link Boolean }
     *     
     */
    public final void setIsPrimary(
    		final Boolean value) {
        
    	this.isPrimary = value;
    }
}
