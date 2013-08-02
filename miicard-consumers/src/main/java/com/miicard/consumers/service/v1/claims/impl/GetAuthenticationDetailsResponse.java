package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticationDetailsResult"
})
@XmlRootElement(name = "GetAuthenticationDetailsResponse", namespace = "http://tempuri.org/")
class GetAuthenticationDetailsResponse {

    @XmlElement(name = "GetAuthenticationDetailsResult", namespace = "http://tempuri.org/", nillable = true)
    protected AuthenticationDetailsImpl authenticationDetailsResult;

    public final AuthenticationDetailsImpl getAuthenticationDetailsResult() {
        return authenticationDetailsResult;
    }
    
    public void setAuthenticationDetailsImpl(AuthenticationDetailsImpl value) {
        this.authenticationDetailsResult = value;
    }
}
