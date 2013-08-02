package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFinancialAccount", propOrder = {
    "financialAccount"
})
public class ArrayOfFinancialAccount {
    @XmlElement(name = "FinancialAccount", nillable = true)
    protected List<FinancialAccountImpl> financialAccount;
    
    public final List<FinancialAccountImpl> getFinancialAccount() {
    	if (this.financialAccount == null) {
    		this.financialAccount = new ArrayList<FinancialAccountImpl>();
    	}
    	
    	return this.financialAccount;
    }
}
