package com.miicard.consumers.service.v1.claims.api;

import java.util.Date;

public interface CreditBureauVerification {
	/**
	 * Gets the value of the data property.
	 * @return possible object is
	 * {@link String }
	 * 
	 */
	String getData();

	/**
	 * Gets the value of the lastVerified property.
	 * @return possible object is
	 * {@link Date }
	 * 
	 */
	Date getLastVerified();
}
