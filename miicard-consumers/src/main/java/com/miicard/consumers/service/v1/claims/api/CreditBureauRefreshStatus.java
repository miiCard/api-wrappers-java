package com.miicard.consumers.service.v1.claims.api;

import com.miicard.consumers.service.v1.claims.impl.CreditBureauRefreshState;

public interface CreditBureauRefreshStatus {
	public CreditBureauRefreshState getState();
}
