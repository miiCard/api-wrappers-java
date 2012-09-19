package com.miicard.consumers.service.v1.claims.api;

public interface Identity extends Claim {

	/**
	 * Gets the value of the profile URL property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getProfileUrl();

	/**
	 * Gets the value of the source property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getSource();

	/**
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getUserId();
}