package com.miicard.consumers.service.v1.claims.api;

public interface EmailAddress extends Claim {

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getAddress();

	/**
	 * Gets the value of the displayName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getDisplayName();

	/**
	 * Gets the value of the isPrimary property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean isPrimary();
}