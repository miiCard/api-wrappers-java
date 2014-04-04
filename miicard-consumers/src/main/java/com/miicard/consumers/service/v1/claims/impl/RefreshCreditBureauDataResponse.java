package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfCreditBureauRefreshStatus;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refreshCreditBureauDataResult"
})
@XmlRootElement(name = "RefreshCreditBureauDataResponse", namespace = "http://tempuri.org/")
public class RefreshCreditBureauDataResponse {
	@XmlElement(name = "RefreshCreditBureauDataResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfCreditBureauRefreshStatus refreshCreditBureauDataResult;

	protected MiiApiResponseOfCreditBureauRefreshStatus getRefreshCreditBureauDataResult() {
		return refreshCreditBureauDataResult;
	}

	protected void setRefreshCreditBureauDataResult(
			final MiiApiResponseOfCreditBureauRefreshStatus refreshCreditBureauDataResult) {
		this.refreshCreditBureauDataResult = refreshCreditBureauDataResult;
	}
}
