package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfBoolean;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isCreditBureauRefreshInProgressResult"
})
@XmlRootElement(name = "IsCreditBureauRefreshInProgressResponse", namespace = "http://tempuri.org/")
public class IsCreditBureauRefreshInProgressResponse {
	@XmlElement(name = "IsCreditBureauRefreshInProgressResult", namespace = "http://tempuri.org/", nillable = true)
	private MiiApiResponseOfBoolean isCreditBureauRefreshInProgressResult;

	protected MiiApiResponseOfBoolean getIsCreditBureauRefreshInProgressResult() {
		return isCreditBureauRefreshInProgressResult;
	}

	protected void setIsCreditBureauRefreshInProgressResult(
			final MiiApiResponseOfBoolean isCreditBureauRefreshInProgressResult) {
		this.isCreditBureauRefreshInProgressResult = isCreditBureauRefreshInProgressResult;
	}
}
