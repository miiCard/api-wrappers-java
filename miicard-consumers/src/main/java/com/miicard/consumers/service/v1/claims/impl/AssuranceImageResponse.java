package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AssuranceImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssuranceImageResult" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "assuranceImageResult"
})
@XmlRootElement(name = "AssuranceImageResponse", namespace = "http://tempuri.org/")
class AssuranceImageResponse {
	
	@XmlElement(name = "AssuranceImageResult", namespace = "http://tempuri.org/", required = true)
    protected byte[] assuranceImageResult;

    /**
     * Gets the value of the assuranceImageResult property.
     * 
     * @return possible object is byte[]
     */
    public final byte[] getAssuranceImageResult() {
        return assuranceImageResult;
    }

    /**
     * Sets the value of the assuranceImageResult property.
     * 
     * @param value allowed object is byte[]
     */
    public final void setAssuranceImageResult(final byte[] value) {
        this.assuranceImageResult = value;
    }
}
