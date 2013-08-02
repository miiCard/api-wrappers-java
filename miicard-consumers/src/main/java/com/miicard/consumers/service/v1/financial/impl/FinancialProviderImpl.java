package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.financial.api.FinancialAccount;
import com.miicard.consumers.service.v1.financial.api.FinancialProvider;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialProvider", propOrder = {
	"financialAccounts",
    "providerName"
})
public class FinancialProviderImpl implements FinancialProvider {
	
	@XmlElement(name = "FinancialAccounts", nillable = true)
	protected ArrayOfFinancialAccount financialAccounts;
	
	@XmlElement(name = "ProviderName", nillable = true)
	protected String providerName;
	
	public String getProviderName() {
		return this.providerName;
	}
	
	public List<? extends FinancialAccount> getFinancialAccounts() {
		if(this.financialAccounts != null 
				&& this.financialAccounts.getFinancialAccount() != null) {
			
			return this.financialAccounts.getFinancialAccount();
		}
		
		return new ArrayList<FinancialAccount>();
	}
}
