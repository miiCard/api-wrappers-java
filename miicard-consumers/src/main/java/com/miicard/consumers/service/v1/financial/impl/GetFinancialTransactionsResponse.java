package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfMiiFinancialData;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFinancialTransactionsResult")
@XmlRootElement(name = "GetFinancialTransactions", namespace = "http://tempuri.org/")
public class GetFinancialTransactionsResponse {
	@XmlElement(name = "GetFinancialTransactionsResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfMiiFinancialData getFinancialTransactionsResult;

	public MiiApiResponseOfMiiFinancialData getGetFinancialTransactionsResult() {
		return getFinancialTransactionsResult;
	}

	public void setGetFinancialDataResult(MiiApiResponseOfMiiFinancialData getFinancialTransactionsResult) {
		this.getFinancialTransactionsResult = getFinancialTransactionsResult;
	}
}
