package com.miicard.consumers.service.v1.financial.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.financial.api.FinancialAccount;
import com.miicard.consumers.service.v1.financial.api.FinancialTransaction;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccount", propOrder = {
	"accountName",
    "accountNumber",
    "closingBalance",
    "creditsCount",
    "creditsSum",
    "currencyIso",
    "debitsCount",
    "debitsSum",
    "fromDate",
    "holder",
    "lastUpdatedUtc",
    "sortCode",
    "transactions",
    "type"
})
public class FinancialAccountImpl implements FinancialAccount {

	@XmlElement(name = "AccountName", nillable = true)
	protected String accountName;
	
	@XmlElement(name = "AccountNumber", nillable = true)
	protected String accountNumber;
	
	@XmlElement(name = "ClosingBalance", nillable = true)
	protected BigDecimal closingBalance;
	
	@XmlElement(name = "CreditsCount", nillable = true)
	protected int creditsCount;
	
	@XmlElement(name = "CreditsSum", nillable = true)
	protected BigDecimal creditsSum;

	@XmlElement(name = "CurrencyIso", nillable = true)
	protected String currencyIso;

	@XmlElement(name = "DebitsCount", nillable = true)
	protected int debitsCount;
	
	@XmlElement(name = "DebitsSum", nillable = true)
	protected BigDecimal debitsSum;	
	
	@XmlElement(name = "FromDate", nillable = true)
	protected Date fromDate;
	
	@XmlElement(name = "Holder", nillable = true)
	protected String holder;
	
	@XmlElement(name = "LastUpdatedUtc", nillable = true)
	protected Date lastUpdatedUtc;
	
	@XmlElement(name = "SortCode", nillable = true)
	protected String sortCode;
		
	@XmlElement(name = "Transactions", nillable = true)
	protected ArrayOfFinancialTransaction transactions;
	
	@XmlElement(name = "Type", nillable = true)
	protected String type;
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public BigDecimal getClosingBalance() {
		return this.closingBalance;
	}

	public int getCreditsCount() {
		return this.creditsCount;
	}
	
	public BigDecimal getCreditsSum() {
		return this.creditsSum;
	}
	
	public String getCurrencyIso() {
		return this.currencyIso;
	}
	
	public int getDebitsCount() {
		return this.debitsCount;
	}
	
	public BigDecimal getDebitsSum() {
		return this.debitsSum;
	}
	
	public Date getFromDate() {
		return this.fromDate;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public Date getLastUpdatedUtc() {
		return this.lastUpdatedUtc;
	}
	
	public String getSortCode() {
		return this.sortCode;
	}

	public String getType() {
		return this.type;
	}
	
	public List<? extends FinancialTransaction> getTransactions() {
		if (transactions != null && transactions.getFinancialTransaction() != null) {
			return transactions.getFinancialTransaction();
		}
		
		return new ArrayList<FinancialTransaction>();
	}
}
