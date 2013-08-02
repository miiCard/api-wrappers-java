package com.miicard.consumers.service.v1.financial.api;

import com.miicard.consumers.service.v1.financial.impl.RefreshState;

public interface FinancialRefreshStatus {
	public RefreshState getState();
}
