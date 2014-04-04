package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.financial.api.FinancialRefreshStatus;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRefreshStatus", propOrder = {
    "state"
})
public class FinancialRefreshStatusImpl implements FinancialRefreshStatus {
    @XmlElement(name = "State")
    protected RefreshState state;

	public RefreshState getState() {
		return this.state;
	}
}
