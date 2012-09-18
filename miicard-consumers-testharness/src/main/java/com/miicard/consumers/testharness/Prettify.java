package com.miicard.consumers.testharness;

import com.miicard.consumers.service.v1.MiiApiResponse;

import com.miicard.consumers.service.v1.claims.api.EmailAddress;
import com.miicard.consumers.service.v1.claims.api.Identity;
import com.miicard.consumers.service.v1.claims.api.MiiUserProfile;
import com.miicard.consumers.service.v1.claims.api.PhoneNumber;
import com.miicard.consumers.service.v1.claims.api.PostalAddress;

/**
 * 
 * @author Paul.ONeill
 * 
 */
public class Prettify {
    
	/**
	 * Returns the HTML String of the rendered response.
	 * 
	 * @param response the MiiApiResponse
	 * @return HTML String of the response.
	 */
	public final static String renderResponse(
			final MiiApiResponse<?> response) {
		
		String toReturn = "<div class='response'>";
        
		toReturn += renderFact("Status", response.getStatus());
        toReturn += renderFact("Error code", response.getErrorCode());
        toReturn += renderFact("Error message", response.getErrorMessage());

        Object data = response.getData();
        
        if (data instanceof MiiUserProfile) {
        	toReturn += Prettify.renderUserProfile(
        			(MiiUserProfile) response.getData());
        }
        else {
        	toReturn += renderFact("Data", data);
        }
        
        toReturn += "</div>";

        return toReturn;
    }
    
	/**
	 * Returns the HTML String of the rendered Fact.
	 * 
	 * @param fact_name String of the Fact name.
	 * @param fact_value the Fact value.
	 * @return HTML String of the Fact value.
	 */
    private final static String renderFact(
    		final String fact_name, 
    		final Object fact_value) {
        
    	String fact_value_render = "[Empty]";
        
    	if (fact_value != null) {
            fact_value_render = fact_value.toString();
        }
        
    	return "<div class='fact-row'><span class='fact-name'>"
    		+ fact_name 
    		+ "</span><span class='fact-value'>" 
    		+ fact_value_render 
    		+ "</span></div>";
    }
    
    /**
     * Returns the HTML String of the Identity rendered.
     * 
     * @param identity the Identity
     * @return HTML String of the rendered Identity
     */
    private final static String renderIdentity(
    		final Identity identity) {
        
    	String toReturn = "<div class='fact'>";
        
        toReturn += renderFact("Source", identity.getSource());
        toReturn += renderFact("User ID", identity.getUserId());
        toReturn += renderFact("Profile URL", identity.getProfileUrl());
        toReturn += renderFact("Verified?", identity.isVerified());
        toReturn += "</div>";
        
        return toReturn;
    }
    
    /**
     * Returns the HTML String of the 
     * rendered Email Address.
     * 
     * @param email the EmailAddress
     * @return HTML String of the EmailAddress
     */
    private final static String renderEmail(
    		final EmailAddress email) {
        
    	String toReturn = "<div class='fact'>";
        
        toReturn += renderFact("Display name", email.getDisplayName());
        toReturn += renderFact("Address", email.getAddress());
        toReturn += renderFact("Is primary?", email.isPrimary());
        toReturn += renderFact("Verified?", email.isVerified());
        toReturn += "</div>";
        
        return toReturn;
    }
    
    /**
     * Returns the HTML String of the rendered PostalAddress.
     * 
     * @param address the PostalAddress
     * @return HTML String of the PostalAddress
     */
    private final static String renderAddress(
    		final PostalAddress address) {
        
    	String toReturn = "<div class='fact'>";
        
        toReturn += renderFact("House", address.getHouse());
        toReturn += renderFact("Line1", address.getLine1());
        toReturn += renderFact("Line2", address.getLine2());
        toReturn += renderFact("City", address.getCity());
        toReturn += renderFact("Region", address.getRegion());
        toReturn += renderFact("Code", address.getCode());
        toReturn += renderFact("Country", address.getCountry());
        toReturn += renderFact("Is primary?", address.isPrimary());
        toReturn += renderFact("Verified?", address.isVerified());        
        toReturn += "</div>";
        
        return toReturn;   
    }
    
    /**
     * Returns the HTML String of the rendered phone number.
     * 
     * @param number the PhoneNumber
     * @return HTML String of the PhoneNumber
     */
    private final static String renderPhone(
    		final PhoneNumber number) {
        
    	String toReturn = "<div class='fact'>";
        
        toReturn += renderFact("Display name", number.getDisplayName());
        toReturn += renderFact("Country code", number.getCountryCode());
        toReturn += renderFact("National number", number.getNationalNumber());
        toReturn += renderFact("Is mobile?", number.isMobile());
        toReturn += renderFact("Is primary?", number.isPrimary());
        toReturn += renderFact("Verified?", number.isVerified());
        toReturn += "</div>";
        
        return toReturn;   
    }
    
    /**
     * Returns the HTML String of Fact heading.
     * 
     * @param heading the Fact heading.
     * @return HTML String of the Fact heading.
     */
    private final static String renderFactHeading(final String heading) {
        return "<h3>" + heading + "</h3>";
    }
    
    /**
     * Returns the HTML String of the rendered MiiUserProfile.
     * 
     * @param profile the MiiUserProfile.
     * @return HTML String of the MiiUserProfile.
     */
    public static String renderUserProfile(MiiUserProfile profile){
        
    	String toReturn = "<div class='fact'>";
        
    	toReturn += "<h2>User profile</h2>";
    	toReturn += renderFact("Username", profile.getUsername());
        toReturn += renderFact("Salutation", profile.getSalutation());
        toReturn += renderFact("First name", profile.getFirstName());
        toReturn += renderFact("Middle name", profile.getMiddleName());
        toReturn += renderFact("Last name", profile.getLastName());
        toReturn += renderFact("Identity verified?", profile.isIdentityAssured());
        toReturn += renderFact("Identity last verified?", profile.getLastVerified());
        toReturn += renderFact("Has a public profile?", profile.hasPublicProfile());
        toReturn += renderFact("Previous first name", profile.getPreviousFirstName());
        toReturn += renderFact("Previous middle name", profile.getPreviousMiddleName());
        toReturn += renderFact("Previous last name", profile.getPreviousLastName());
        toReturn += renderFact("Profile URL", profile.getProfileUrl());
        toReturn += renderFact("Profile short URL", profile.getProfileShortUrl());
        toReturn += renderFact("Card image URL", profile.getCardImageUrl());
        toReturn += renderFactHeading("Postal addresses");
        
        int ct = 0;
        
        if (!profile.getPostalAddresses().isEmpty()) {
            
        	for (PostalAddress address : profile.getPostalAddresses()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]";
                toReturn += renderAddress(address);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Phone numbers");
        ct = 0;
        
        if (!profile.getPhoneNumbers().isEmpty()) {
            
        	for (PhoneNumber number : profile.getPhoneNumbers()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]";
                toReturn += renderPhone(number);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Email addresses");
        ct = 0;
        
        if (!profile.getEmailAddresses().isEmpty()) {
            
        	for (EmailAddress address : profile.getEmailAddresses()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]";
                toReturn += renderEmail(address);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Internet identities");
        ct = 0;
        
        if (!profile.getIdentities().isEmpty()) {
            
        	for (Identity identity : profile.getIdentities()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]";
                toReturn += renderIdentity(identity);
                toReturn += "</div>";
            }
        }
        
        if (profile.getPublicProfile() != null) {
        	
        	toReturn += "<div class='fact'>";
            toReturn += Prettify.renderUserProfile(profile.getPublicProfile());
            toReturn += "</div>";
        }
        
        toReturn += "</div>";
        
        return toReturn;
    }
}
