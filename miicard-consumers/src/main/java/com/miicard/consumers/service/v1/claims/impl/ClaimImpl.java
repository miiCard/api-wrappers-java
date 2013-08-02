package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.Claim;

/**
 * <p>Java class for Claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Verified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Claim", propOrder = {
    "verified"
})
@XmlSeeAlso({
    PhoneNumberImpl.class,
    PostalAddressImpl.class,
    IdentityImpl.class,
    EmailAddressImpl.class
})
class ClaimImpl implements Claim {

    @XmlElement(name = "Verified")
    protected Boolean verified;

    /**
     * {@inheritDoc}
     */
    public final Boolean isVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value allowed object is
     * {@link Boolean }
     *     
     */
    public final void setVerified(
    		final Boolean value) {
        
    	this.verified = value;
    }
}
