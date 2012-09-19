package com.miicard.consumers.service.v1.claims.api;

public interface PostalAddress extends Claim {

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getCity();

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getCode();

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getCountry();

	/**
	 * Gets the value of the house property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getHouse();

	/**
	 * Gets the value of the isPrimary property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean isPrimary();

	/**
	 * Gets the value of the line1 property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getLine1();

	/**
	 * Gets the value of the line2 property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getLine2();

	/**
	 * Gets the value of the region property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getRegion();
}