package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.CreditBureauRefreshStatus;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBureauRefreshStatus", propOrder = {
    "state"
})
public class CreditBureauRefreshStatusImpl implements CreditBureauRefreshStatus {
    @XmlElement(name = "State")
    protected CreditBureauRefreshState state;

	public CreditBureauRefreshState getState() {
		return this.state;
	}
}
