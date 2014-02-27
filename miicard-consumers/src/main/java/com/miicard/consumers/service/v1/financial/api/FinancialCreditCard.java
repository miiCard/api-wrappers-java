package com.miicard.consumers.service.v1.financial.api;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface FinancialCreditCard {
	String getHolder();
	
	String getAccountNumber();
	
	String getAccountName();
	
	String getType();
	
	Date getFromDate();
		
	Date getLastUpdatedUtc();
	
	BigDecimal getCreditLimit();
	
	BigDecimal getRunningBalance();
	
	BigDecimal getDebitsSum();
	
	int getDebitsCount();
	
	BigDecimal getCreditsSum();
	
	int getCreditsCount();
	
	String getCurrencyIso();
		
	List<? extends FinancialTransaction> getTransactions();
}
