package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFinancialCreditCard", propOrder = {
    "financialCreditCard"
})
public class ArrayOfFinancialCreditCard {
    @XmlElement(name = "FinancialCreditCard", nillable = true)
    protected List<FinancialCreditCardImpl> financialCreditCard;
    
    public final List<FinancialCreditCardImpl> getFinancialCreditCard() {
    	if (this.financialCreditCard == null) {
    		this.financialCreditCard = new ArrayList<FinancialCreditCardImpl>();
    	}
    	
    	return this.financialCreditCard;
    }
}
