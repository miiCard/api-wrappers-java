package com.miicard.consumers.service.v1.financial.api;

import java.util.List;

public interface MiiFinancialData {
	List<? extends FinancialProvider> getFinancialProviders();
}
