package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.PostalAddress;

/**
 * <p>Java class for PostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}Claim">
 *       &lt;sequence>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="House" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress", propOrder = {
    "city",
    "code",
    "country",
    "house",
    "isPrimary",
    "line1",
    "line2",
    "region"
})
class PostalAddressImpl extends ClaimImpl implements PostalAddress {

    @XmlElement(name = "City", nillable = true)
    protected String city;
    
    @XmlElement(name = "Code", nillable = true)
    protected String code;
    
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    
    @XmlElement(name = "House", nillable = true)
    protected String house;
    
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    
    @XmlElement(name = "Line1", nillable = true)
    protected String line1;
    
    @XmlElement(name = "Line2", nillable = true)
    protected String line2;
    
    @XmlElement(name = "Region", nillable = true)
    protected String region;

    /**
     * {@inheritDoc}
     */
    public final String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setCity(
    		final String value) {
       
    	this.city = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setCode(
    		final String value) {
        
    	this.code = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setCountry(
    		final String value) {
        
    	this.country = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setHouse(
    		final String value) {
        
    	this.house = value;
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
    public final String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setLine1(
    		final String value) {
        
    	this.line1 = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setLine2(
    		final String value) {
        
    	this.line2 = value;
    }

    /**
     * {@inheritDoc}
     */
    public final String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setRegion(
    		final String value) {
        
    	this.region = value;
    }
}
