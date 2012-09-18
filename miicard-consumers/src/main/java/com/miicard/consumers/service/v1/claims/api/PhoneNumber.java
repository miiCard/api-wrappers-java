package com.miicard.consumers.service.v1.claims.api;

/**
 * 
 * @author Derek Sooman dsooman@hotmail.com
 *
 */
public interface PhoneNumber extends Claim {

	/**
	 * Gets the value of the countryCode property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getCountryCode();

	/**
	 * Gets the value of the displayName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getDisplayName();

	/**
	 * Gets the value of the isMobile property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean isMobile();

	/**
	 * Gets the value of the isPrimary property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean isPrimary();

	/**
	 * Gets the value of the nationalNumber property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getNationalNumber();
}