package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFinancialProvider", propOrder = {
    "financialProvider"
})
public class ArrayOfFinancialProvider {
    @XmlElement(name = "FinancialProvider", nillable = true)
    protected List<FinancialProviderImpl> financialProvider;
    
    public final List<FinancialProviderImpl> getFinancialProvider() {
    	if (this.financialProvider == null) {
    		this.financialProvider = new ArrayList<FinancialProviderImpl>();
    	}
    	
    	return this.financialProvider;
    }
}
