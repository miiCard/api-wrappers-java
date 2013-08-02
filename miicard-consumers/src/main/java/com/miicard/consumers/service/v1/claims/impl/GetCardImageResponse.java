package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCardImageResult"
})
@XmlRootElement(name = "GetCardImageResponse", namespace = "http://tempuri.org/")
class GetCardImageResponse {
	
	@XmlElement(name = "GetCardImageResult", namespace = "http://tempuri.org/", required = true)
    protected byte[] getCardImageResult;

    public final byte[] getGetCardImageResult() {
        return getCardImageResult;
    }

    public final void setGetCardImageResult(final byte[] value) {
        this.getCardImageResult = value;
    }
}
