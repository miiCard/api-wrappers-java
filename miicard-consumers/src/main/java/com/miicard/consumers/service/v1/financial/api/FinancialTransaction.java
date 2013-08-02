package com.miicard.consumers.service.v1.financial.api;

import java.util.Date;
import java.math.BigDecimal;

public interface FinancialTransaction {
	Date getDate();
	
	BigDecimal getAmountCredited();
	
	BigDecimal getAmountDebited();
		
	String getDescription();
	
	String getID();
}
