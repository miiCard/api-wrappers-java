package com.miicard.consumers.service.v1.financial.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.financial.api.FinancialProvider;
import com.miicard.consumers.service.v1.financial.api.MiiFinancialData;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiiFinancialData", propOrder = {
    "financialProviders"
})
public class MiiFinancialDataImpl implements MiiFinancialData {
	
	@XmlElement(name = "FinancialProviders")
	protected ArrayOfFinancialProvider financialProviders;
	
	public List<? extends FinancialProvider> getFinancialProviders() {
		if (this.financialProviders != null && this.financialProviders.getFinancialProvider() != null) {
			return this.financialProviders.getFinancialProvider();
		}
		
		return new ArrayList<FinancialProvider>();
	}
}
