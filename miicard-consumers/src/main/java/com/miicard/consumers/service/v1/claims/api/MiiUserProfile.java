package com.miicard.consumers.service.v1.claims.api;

import java.util.Date;
import java.util.List;

public interface MiiUserProfile {

	/**
	 * Gets the value of the cardImageUrl property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getCardImageUrl();
	
	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getFirstName();

	/**
	 * Gets the value of the hasPublicProfile property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean hasPublicProfile();
	
	/**
	 * Gets the value of the identityAssured property.
	 * 
	 * @return possible object is
	 * {@link Boolean }
	 *     
	 */
	Boolean isIdentityAssured();

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is 
	 * {@link String }
	 *     
	 */
	String getLastName();

	/**
	 * Gets the value of the lastVerified property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	Date getLastVerified();
	
	/**
	 * Gets the date of birth of the miiCard member, assuming miiCard has been able to verify it and the
	 * member has agreed to share it.
	 * @return The miiCard member's verified date of birth, or null if not possible.
	 */
	Date getDateOfBirth();

	/**
	 * Gets the value of the middleName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getMiddleName();
	
	/**
	 * Gets the value of the previousFirstName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getPreviousFirstName();

	/**
	 * Gets the value of the previousLastName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getPreviousLastName();

	/**
	 * Gets the value of the previousMiddleName property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getPreviousMiddleName();

	/**
	 * Gets the value of the profileShortUrl property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getProfileShortUrl();

	/**
	 * Gets the value of the profileUrl property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getProfileUrl();

	/**
	 * Gets the value of the publicProfile property.
	 * 
	 * @return possible object is
	 * {@link MiiUserProfile }
	 *     
	 */
	MiiUserProfile getPublicProfile();

	/**
	 * Gets the value of the salutation property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getSalutation();

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is
	 * {@link String }
	 *     
	 */
	String getUsername();
	
	/**
	 * Gets the age of the miiCard member in full years.
	 *  
	 * @return The miiCard member's age, or null if not known
	 * or shared.
	 */
	Integer getAge();
	
	/**
	 * Gets the List of Email addresses 
	 * associated with this User Profile.
	 * 
	 * @return possible object is
	 * {@link List}
	 * 
	 */
	List<? extends EmailAddress> getEmailAddresses();
	
	/**
	 * gets the List of Identities
	 * associated with this User Profile.
	 * 
	 * @return possible object is
	 * {@link List}
	 */
	List<? extends Identity> getIdentities();
	
	/**
	 * Gets the List of Phone Numbers
	 * associated with this User Profile.
	 * 
	 * @return possible object is
	 * {@link List}
	 */
	List<? extends PhoneNumber> getPhoneNumbers();
	
	/**
	 * Gets the List of Postal Addresses
	 * associated with this User Profile.
	 * 
	 * @return possible object is
	 * {@link List}
	 */
	List<? extends PostalAddress> getPostalAddresses();
	
	List<? extends Qualification> getQualifications();

	/**
	 * Gets the credit bureau data
	 *
	 * @return possible object is
	 * {@link CreditBureauVerification}
	 */
	CreditBureauVerification getCreditBureauVerification();
}