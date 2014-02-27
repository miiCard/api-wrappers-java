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
    "refreshFinancialDataResult"
})
@XmlRootElement(name = "RefreshFinancialDataResponse", namespace = "http://tempuri.org/")
public class RefreshFinancialDataResponse {
	@XmlElement(name = "RefreshFinancialDataResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfFinancialRefreshStatus refreshFinancialDataResult;

	protected MiiApiResponseOfFinancialRefreshStatus getRefreshFinancialDataResult() {
		return refreshFinancialDataResult;
	}

	protected void setRefreshFinancialDataResult(
			final MiiApiResponseOfFinancialRefreshStatus refreshFinancialDataResult) {
		this.refreshFinancialDataResult = refreshFinancialDataResult;
	}
}
