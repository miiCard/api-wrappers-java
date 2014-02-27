package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfBoolean;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isRefreshInProgressCreditCardsResult"
})
@XmlRootElement(name = "IsRefreshInProgressCreditCardsResponse", namespace = "http://tempuri.org/")
public class IsRefreshInProgressCreditCardsResponse {
	@XmlElement(name = "IsRefreshInProgressCreditCardsResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfBoolean isRefreshInProgressCreditCardsResult;

	protected MiiApiResponseOfBoolean getIsRefreshInProgressCreditCardsResult() {
		return isRefreshInProgressCreditCardsResult;
	}

	protected void setIsRefreshInProgressCreditCardsResult(
			final MiiApiResponseOfBoolean isRefreshInProgressCreditCardsResult) {
		this.isRefreshInProgressCreditCardsResult = isRefreshInProgressCreditCardsResult;
	}
}
