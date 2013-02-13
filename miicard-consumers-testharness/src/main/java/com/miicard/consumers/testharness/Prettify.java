package com.miicard.consumers.testharness;

import com.miicard.consumers.service.v1.MiiApiResponse;

import com.miicard.consumers.service.v1.claims.api.EmailAddress;
import com.miicard.consumers.service.v1.claims.api.Identity;
import com.miicard.consumers.service.v1.claims.api.IdentitySnapshot;
import com.miicard.consumers.service.v1.claims.api.IdentitySnapshotDetails;
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
        toReturn += renderFact("Is test user?", response.getIsTestUser());
        
        Object data = response.getData();
        
        if (data == null)
        {
        	toReturn += renderFact("Data", null);
        }
        else if (data instanceof Iterable<?>)
        {
        	int ct = 0;
        	for (Object obj : (Iterable<?>) data)
        	{
        		toReturn += "<div class='fact'><h4>[" + ct + "]</h4>";
        		
        		toReturn += getRenderedObject(obj);
        		
        		toReturn += "</div>";
        		
        		ct++;
        	}
        }
        else 
        {
        	toReturn += getRenderedObject(data);
        }
        
        toReturn += "</div>";

        return toReturn;
    }
	
	private final static String getRenderedObject(Object obj)
	{
		if (obj == null)
		{
			return renderFact("Data", obj);
		}
		else if (obj instanceof MiiUserProfile)
		{
			return Prettify.renderUserProfile((MiiUserProfile) obj); 
		}
		else if (obj instanceof IdentitySnapshotDetails)
		{
			return Prettify.renderIdentitySnapshotDetails((IdentitySnapshotDetails) obj);
		}
		else if (obj instanceof IdentitySnapshot)
		{
			return Prettify.renderIdentitySnapshot((IdentitySnapshot) obj);
		}
		else
		{
			return renderFact("Data", obj);
		}
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
        toReturn += renderFact("Date of birth", profile.getDateOfBirth());
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
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderAddress(address);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Phone numbers");
        ct = 0;
        
        if (!profile.getPhoneNumbers().isEmpty()) {
            
        	for (PhoneNumber number : profile.getPhoneNumbers()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderPhone(number);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Email addresses");
        ct = 0;
        
        if (!profile.getEmailAddresses().isEmpty()) {
            
        	for (EmailAddress address : profile.getEmailAddresses()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderEmail(address);
                toReturn += "</div>";
            }
        }
        
        toReturn += renderFactHeading("Internet identities");
        ct = 0;
        
        if (!profile.getIdentities().isEmpty()) {
            
        	for (Identity identity : profile.getIdentities()) {
        		
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
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
    
    /**
     * Returns the HTML representation of an IdentitySnapshotDetails instance.
     * 
     * @param identitySnapshotDetails the object to be rendered
     * @return HTML representation of the object
     */
    private final static String renderIdentitySnapshotDetails(
    		final IdentitySnapshotDetails identitySnapshotDetails) {
        
    	String toReturn = "<div class='fact'>";
    	
    	toReturn += renderFact("Snapshot ID", identitySnapshotDetails.getSnapshotId());
    	toReturn += renderFact("Username", identitySnapshotDetails.getUsername());
    	toReturn += renderFact("Timestamp", identitySnapshotDetails.getTimestampUtc());
    	toReturn += renderFact("Was a test user?", identitySnapshotDetails.getWasTestUser());
                
        toReturn += "</div>";
        
        return toReturn;   
    }
    
    /**
     * Returns the HTML String of the rendered PostalAddress.
     * 
     * @param address the PostalAddress
     * @return HTML String of the PostalAddress
     */
    private final static String renderIdentitySnapshot(
    		final IdentitySnapshot identitySnapshot) {
        
    	String toReturn = "<div class='fact'>";
    	
    	toReturn += renderFactHeading("Snapshot Details");
    	toReturn += renderIdentitySnapshotDetails(identitySnapshot.getDetails());
    	toReturn += renderFactHeading("Snapshot");
    	toReturn += renderUserProfile(identitySnapshot.getSnapshot());
                
        toReturn += "</div>";
        
        return toReturn;   
    }
}
