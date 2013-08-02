package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AssuranceImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "type"
})
@XmlRootElement(name = "AssuranceImage", namespace = "http://tempuri.org/")
class AssuranceImage {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String type;

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is
     * {@link String }
     *     
     */
    public final String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setType(
    		final String value) {
        
    	this.type = value;
    }
}
