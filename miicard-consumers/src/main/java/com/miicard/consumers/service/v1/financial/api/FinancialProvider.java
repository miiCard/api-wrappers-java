package com.miicard.consumers.service.v1.financial.api;

import java.util.List;

public interface FinancialProvider {
	String getProviderName();
	
	List<? extends FinancialAccount> getFinancialAccounts();
	
	List<? extends FinancialCreditCard> getFinancialCreditCards();
}
