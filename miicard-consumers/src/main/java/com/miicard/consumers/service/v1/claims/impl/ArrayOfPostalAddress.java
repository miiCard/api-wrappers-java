package com.miicard.consumers.service.v1.claims.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ArrayOfPostalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalAddress" type="{http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api}PostalAddress" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrayOfPostalAddress", propOrder = {
    "postalAddress"
})
public class ArrayOfPostalAddress {

    @XmlElement(name = "PostalAddress", nillable = true)
    protected List<PostalAddressImpl> postalAddress;

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressImpl }
     * 
     * 
     */
    public final List<PostalAddressImpl> getPostalAddress() {
        
    	if (postalAddress == null) {
    		postalAddress = new ArrayList<PostalAddressImpl>();
        }
        
    	return this.postalAddress;
    }
    
    public final void setPostalAddresses(final List<PostalAddressImpl> addresses) {
    	this.postalAddress = addresses;
    }
}
