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
 *         &lt;element name="IsSocialAccountAssuredResult" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}MiiApiResponseOfboolean" minOccurs="0"/>
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
    "isSocialAccountAssuredResult"
})
@XmlRootElement(name = "IsSocialAccountAssuredResponse", namespace = "http://tempuri.org/")
class IsSocialAccountAssuredResponse {

    @XmlElement(name = "IsSocialAccountAssuredResult", namespace = "http://tempuri.org/", nillable = true)
    protected MiiApiResponseOfBoolean isSocialAccountAssuredResult;

    /**
     * Gets the value of the isSocialAccountAssuredResult property.
     * 
     * @return possible object is
     * {@link MiiApiResponseOfBoolean }
     *     
     */
    public final MiiApiResponseOfBoolean getIsSocialAccountAssuredResult() {
        return isSocialAccountAssuredResult;
    }

    /**
     * Sets the value of the isSocialAccountAssuredResult property.
     * 
     * @param value allowed object is
     * {@link MiiApiResponseOfBoolean }
     *     
     */
    public final void setIsSocialAccountAssuredResult(
    		final MiiApiResponseOfBoolean value) {
        
    	this.isSocialAccountAssuredResult = value;
    }
}
