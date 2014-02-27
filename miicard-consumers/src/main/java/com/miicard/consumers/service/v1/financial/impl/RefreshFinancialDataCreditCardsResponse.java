package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfFinancialRefreshStatus;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refreshFinancialDataCreditCardsResult"
})
@XmlRootElement(name = "RefreshFinancialDataCreditCardsResponse", namespace = "http://tempuri.org/")
public class RefreshFinancialDataCreditCardsResponse {
	@XmlElement(name = "RefreshFinancialDataCreditCardsResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfFinancialRefreshStatus refreshFinancialDataCreditCardsResult;

	protected MiiApiResponseOfFinancialRefreshStatus getRefreshFinancialDataCreditCardsResult() {
		return refreshFinancialDataCreditCardsResult;
	}

	protected void setRefreshFinancialDataCreditCardsResult(
			final MiiApiResponseOfFinancialRefreshStatus refreshFinancialDataCreditCardsResult) {
		this.refreshFinancialDataCreditCardsResult = refreshFinancialDataCreditCardsResult;
	}
}
