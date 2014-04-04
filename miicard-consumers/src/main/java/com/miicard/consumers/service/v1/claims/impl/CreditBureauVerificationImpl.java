package com.miicard.consumers.service.v1.claims.impl;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.CreditBureauVerification;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBureauVerification", propOrder = {
    "data",
    "lastVerified"
})
public class CreditBureauVerificationImpl implements CreditBureauVerification {
	@XmlElement(name = "Data", nillable = true)
	protected String data;
	
	@XmlElement(name = "LastVerified")
    @XmlSchemaType(name = "dateTime")
	protected Date lastVerified;
	
	/**
	 * Gets the value of the data property.
	 * @return possible object is
	 * {@link String }
	 * 
     */
	public final String getData() {
		return data;
	}

	/**
	 * Gets the value of the lastVerified property.
	 * @return possible object is
	 * {@link Date }
	 * 
	 */
	public final Date getLastVerified() {
		return lastVerified;
	}
}
