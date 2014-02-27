package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfMiiFinancialData;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFinancialTransactionsCreditCardsResult")
@XmlRootElement(name = "GetFinancialTransactionsCreditCards", namespace = "http://tempuri.org/")
public class GetFinancialTransactionsCreditCardsResponse {
	@XmlElement(name = "GetFinancialTransactionsCreditCardsResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfMiiFinancialData getFinancialTransactionsCreditCardsResult;

	public MiiApiResponseOfMiiFinancialData getGetFinancialTransactionsCreditCardsResult() {
		return getFinancialTransactionsCreditCardsResult;
	}

	public void setGetFinancialDataCreditCardsResult(MiiApiResponseOfMiiFinancialData getFinancialTransactionsCreditCardsResult) {
		this.getFinancialTransactionsCreditCardsResult = getFinancialTransactionsCreditCardsResult;
	}
}
