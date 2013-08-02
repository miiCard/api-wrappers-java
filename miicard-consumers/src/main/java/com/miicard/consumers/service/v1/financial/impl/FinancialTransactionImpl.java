package com.miicard.consumers.service.v1.financial.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.financial.api.FinancialTransaction;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialTransaction", propOrder = {
	"amountCredited",
	"amountDebited",
    "date",
    "description",
    "id"
})
public class FinancialTransactionImpl implements FinancialTransaction {
	
	@XmlElement(name = "AmountCredited")
	protected BigDecimal amountCredited;
	
	@XmlElement(name = "AmountDebited")
	protected BigDecimal amountDebited;
	
	@XmlElement(name = "Date")
	protected Date date;
	
	@XmlElement(name = "Description")
	protected String description;
	
	@XmlElement(name = "ID")
	protected String id;
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(final Date value) {
		this.date = value;
	}

	public BigDecimal getAmountCredited() {
		return this.amountCredited;
	}
	
	public void setAmountCredited(final BigDecimal value) {
		this.amountCredited = value;
	}	
	
	public BigDecimal getAmountDebited() {
		return this.amountDebited;
	}
	
	public void setAmountDebited(final BigDecimal value) {
		this.amountDebited = value;
	}

	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(final String value) {
		this.description = value;
	}

	public String getID() {
		return this.id;
	}
	
	public void setID(final String value) {
		this.id = value;
	}
}
