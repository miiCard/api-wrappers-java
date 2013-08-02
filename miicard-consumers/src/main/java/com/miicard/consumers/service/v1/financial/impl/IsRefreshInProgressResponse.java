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
    "isRefreshInProgressResult"
})
@XmlRootElement(name = "IsRefreshInProgressResponse", namespace = "http://tempuri.org/")
public class IsRefreshInProgressResponse {
	@XmlElement(name = "IsRefreshInProgressResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfBoolean isRefreshInProgressResult;

	protected MiiApiResponseOfBoolean getIsRefreshInProgressResult() {
		return isRefreshInProgressResult;
	}

	protected void setIsRefreshInProgressResult(
			final MiiApiResponseOfBoolean isRefreshInProgressResult) {
		this.isRefreshInProgressResult = isRefreshInProgressResult;
	}
}
