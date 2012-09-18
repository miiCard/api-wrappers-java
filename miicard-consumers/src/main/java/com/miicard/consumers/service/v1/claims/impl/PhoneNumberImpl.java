package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.PhoneNumber;

/**
 * <p>Java class for PhoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}Claim">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NationalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumber", propOrder = {
    "countryCode",
    "displayName",
    "isMobile",
    "isPrimary",
    "nationalNumber"
})
class PhoneNumberImpl extends ClaimImpl implements PhoneNumber {

    @XmlElement(name = "CountryCode", nillable = true)
    protected String countryCode;
    
    @XmlElement(name = "DisplayName", nillable = true)
    protected String displayName;
    
    @XmlElement(name = "IsMobile")
    protected Boolean isMobile;
    
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    
    @XmlElement(name = "NationalNumber", nillable = true)
    protected String nationalNumber;

    /**
     * {@inheritDoc}
     */
    public final String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setCountryCode(
    		final String value) {
        
    	this.countryCode = value;
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
    public final Boolean isMobile() {
        return isMobile;
    }

    /**
     * Sets the value of the isMobile property.
     * 
     * @param value allowed object is
     * {@link Boolean }
     *     
     */
    public final void setIsMobile(
    		final Boolean value) {
        
    	this.isMobile = value;
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
    public final void setPrimary(
    		final Boolean value) {
        
    	this.isPrimary = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getNationalNumber() {
        return nationalNumber;
    }

    /**
     * Sets the value of the nationalNumber property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setNationalNumber(
    		final String value) {
        
    	this.nationalNumber = value;
    }
}
