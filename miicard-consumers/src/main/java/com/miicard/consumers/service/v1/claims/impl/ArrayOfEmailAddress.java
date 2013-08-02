package com.miicard.consumers.service.v1.claims.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ArrayOfEmailAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmailAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}EmailAddress" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrayOfEmailAddress", propOrder = {
    "emailAddress"
})
public class ArrayOfEmailAddress {
	
	@XmlElement(name = "EmailAddress", nillable = true)
    protected List<EmailAddressImpl> emailAddress;

    public final List<EmailAddressImpl> getEmailAddress() {
        
    	if (emailAddress == null) {
    		emailAddress = new ArrayList<EmailAddressImpl>();
        }
        
    	return this.emailAddress;
    }
    
    public final void setEmailAddresses(final List<EmailAddressImpl> emailAddresses) {
    	this.emailAddress = emailAddresses;
    }
}
