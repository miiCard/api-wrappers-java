package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFinancialTransaction", propOrder = {
    "financialTransaction"
})
public class ArrayOfFinancialTransaction {
    @XmlElement(name = "FinancialTransaction", nillable = true)
    protected List<FinancialTransactionImpl> financialTransaction;
    
    public final List<FinancialTransactionImpl> getFinancialTransaction() {
    	if (this.financialTransaction == null) {
    		this.financialTransaction = new ArrayList<FinancialTransactionImpl>();
    	}
    	
    	return this.financialTransaction;
    }
}
