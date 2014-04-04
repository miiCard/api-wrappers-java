package com.miicard.consumers.testharness;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import com.miicard.consumers.service.v1.MiiApiResponse;
import com.miicard.consumers.service.v1.claims.api.AuthenticationDetails;
import com.miicard.consumers.service.v1.claims.api.CreditBureauRefreshStatus;
import com.miicard.consumers.service.v1.claims.api.CreditBureauVerification;
import com.miicard.consumers.service.v1.claims.api.EmailAddress;
import com.miicard.consumers.service.v1.claims.api.GeographicLocation;
import com.miicard.consumers.service.v1.claims.api.Identity;
import com.miicard.consumers.service.v1.claims.api.IdentitySnapshot;
import com.miicard.consumers.service.v1.claims.api.IdentitySnapshotDetails;
import com.miicard.consumers.service.v1.claims.api.MiiUserProfile;
import com.miicard.consumers.service.v1.claims.api.PhoneNumber;
import com.miicard.consumers.service.v1.claims.api.PostalAddress;
import com.miicard.consumers.service.v1.claims.api.Qualification;
import com.miicard.consumers.service.v1.financial.api.FinancialAccount;
import com.miicard.consumers.service.v1.financial.api.FinancialCreditCard;
import com.miicard.consumers.service.v1.financial.api.FinancialProvider;
import com.miicard.consumers.service.v1.financial.api.FinancialRefreshStatus;
import com.miicard.consumers.service.v1.financial.api.FinancialTransaction;
import com.miicard.consumers.service.v1.financial.api.MiiFinancialData;

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
	public final static String renderResponse(final MiiApiResponse<?> response, PrettifyConfiguration configuration) {
		
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
        		
        		toReturn += getRenderedObject(obj, configuration);
        		
        		toReturn += "</div>";
        		
        		ct++;
        	}
        }
        else 
        {
        	toReturn += getRenderedObject(data, configuration);
        }
        
        toReturn += "</div>";

        return toReturn;
    }
	
	private final static String getRenderedObject(Object obj, PrettifyConfiguration configuration)
	{
		if (obj == null)
		{
			return renderFact("Data", obj);
		}
		else if (obj instanceof MiiUserProfile)
		{
			return Prettify.renderUserProfile((MiiUserProfile) obj, configuration); 
		}
		else if (obj instanceof IdentitySnapshotDetails)
		{
			return Prettify.renderIdentitySnapshotDetails((IdentitySnapshotDetails) obj, configuration);
		}
		else if (obj instanceof IdentitySnapshot)
		{
			return Prettify.renderIdentitySnapshot((IdentitySnapshot) obj, configuration);
		}
		else if (obj instanceof CreditBureauRefreshStatus)
		{
			return Prettify.renderCreditBureauRefreshStatus((CreditBureauRefreshStatus) obj, configuration);
		}
		else if (obj instanceof MiiFinancialData)
		{
			return Prettify.renderFinancialData((MiiFinancialData) obj, configuration);		
		}
		else if (obj instanceof FinancialRefreshStatus)
		{
			return Prettify.renderFinancialRefreshStatus((FinancialRefreshStatus) obj, configuration);
		}
		else if (obj instanceof AuthenticationDetails)
		{
			return Prettify.renderAuthenticationDetails((AuthenticationDetails) obj, configuration);
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
        toReturn += renderFact("Nati)onal number", number.getNationalNumber());
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
    public static String renderUserProfile(MiiUserProfile profile, PrettifyConfiguration configuration){
        
    	String toReturn = "<div class='fact'>";
        
    	toReturn += "<h2>User profile</h2>";
    	toReturn += renderFact("Username", profile.getUsername());
        toReturn += renderFact("Salutation", profile.getSalutation());
        toReturn += renderFact("First name", profile.getFirstName());
        toReturn += renderFact("Middle name", profile.getMiddleName());
        toReturn += renderFact("Last name", profile.getLastName());
        toReturn += renderFact("Date of birth", profile.getDateOfBirth());
        toReturn += renderFact("Age", profile.getAge());
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
        
        toReturn += renderFactHeading("Qualifications");
        ct = 0;
        
        if (!profile.getQualifications().isEmpty()) {
        	for (Qualification qualification : profile.getQualifications()) {
        		toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderQualification(qualification);
                toReturn += "</div>";
        	}
        }
        
        toReturn += renderFactHeading("Credit Bureau Data");

        if (profile.getCreditBureauVerification() != null)
        {
            toReturn += renderCreditBureauVerification(profile.getCreditBureauVerification());
        }

        if (profile.getPublicProfile() != null) {
        	
        	toReturn += "<div class='fact'>";
            toReturn += Prettify.renderUserProfile(profile.getPublicProfile(), configuration);
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
    		final IdentitySnapshotDetails identitySnapshotDetails, PrettifyConfiguration configuration) {
        
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
    		final IdentitySnapshot identitySnapshot, PrettifyConfiguration configuration) {
        
    	String toReturn = "<div class='fact'>";
    	
    	toReturn += renderFactHeading("Snapshot Details");
    	toReturn += renderIdentitySnapshotDetails(identitySnapshot.getDetails(), configuration);
    	toReturn += renderFactHeading("Snapshot");
    	toReturn += renderUserProfile(identitySnapshot.getSnapshot(), configuration);
                
        toReturn += "</div>";
        
        return toReturn;   
    }
    
    private final static String getModestyFilteredAmount(BigDecimal value, PrettifyConfiguration configuration) {
    	String toReturn = "";
    	
    	if (value != null) {
    		if (configuration.getModestyLimit() == null || value.abs().compareTo(configuration.getModestyLimit()) <= 0) {
	    		toReturn = String.format("%,.2f", value); 
	    	}
	    	else {
	    		toReturn = "?.??";
	    	}
    	}
    	
    	return toReturn;
    }
    
    private final static String renderFinancialAccount(final FinancialAccount account, PrettifyConfiguration configuration) {
    	String toReturn = "<div class='fact'>";
    	
    	toReturn += renderFact("Holder", account.getHolder());
        toReturn += renderFact("Account number", account.getAccountNumber());
        toReturn += renderFact("Sort code", account.getSortCode());
        toReturn += renderFact("Account name", account.getAccountName());
        toReturn += renderFact("Type", account.getType());
        toReturn += renderFact("Last updated", account.getLastUpdatedUtc());
        toReturn += renderFact("Currency", account.getCurrencyIso());
        toReturn += renderFact("Closing balance", getModestyFilteredAmount(account.getClosingBalance(), configuration));
        toReturn += renderFact("Credits (count)", account.getCreditsCount());
        toReturn += renderFact("Credits (sum)", getModestyFilteredAmount(account.getCreditsSum(), configuration));
        toReturn += renderFact("Debits (count)", account.getDebitsCount());
        toReturn += renderFact("Debits (sum)", getModestyFilteredAmount(account.getDebitsSum(), configuration));

        toReturn += renderFactHeading("Transactions");
        
        toReturn += "<table class='table table-striped table-condensed table-hover'><thead><tr><th>Date</th><th>Description</th><th class='r'>Credit</th><th class='r'>Debit</th></tr></thead><tbody>";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        
        for (FinancialTransaction transaction : account.getTransactions())
        {
        	String desc = transaction.getDescription();
        	if (desc == null) {
        		desc = "[None]";
        	}
        	
        	String amountCredited = "";
        	if (transaction.getAmountCredited() != null) {
        		amountCredited = getModestyFilteredAmount(transaction.getAmountCredited(), configuration);
        	}
        	
        	String amountDebited = "";
        	if (transaction.getAmountDebited() != null) {
        		amountDebited = getModestyFilteredAmount(transaction.getAmountDebited(), configuration);
        	}
        	
        	String dateFormatted = dateFormat.format(transaction.getDate());
        	
        	toReturn += "<tr><td>" + dateFormatted + "</td><td title='ID: " + transaction.getID() + "'>" + transaction.getDescription() +"</td><td class='r'>" + amountCredited + "</td><td class='r d'>" + amountDebited + "</td></tr>";
        }
        
        toReturn += "</tbody></table>";
        
    	toReturn += "</div>";
    	return toReturn;
    }
    
    private final static String renderFinancialCreditCard(final FinancialCreditCard creditCard, PrettifyConfiguration configuration) {
	String toReturn = "<div class='fact'>";

	toReturn += renderFact("Holder", creditCard.getHolder());
	toReturn += renderFact("Account number", creditCard.getAccountNumber());
	toReturn += renderFact("Account name", creditCard.getAccountName());
	toReturn += renderFact("Type", creditCard.getType());
	toReturn += renderFact("Last updated", creditCard.getLastUpdatedUtc());
	toReturn += renderFact("Currency", creditCard.getCurrencyIso());
	toReturn += renderFact("Credit limit", getModestyFilteredAmount(creditCard.getCreditLimit(), configuration));
	toReturn += renderFact("Running balance", getModestyFilteredAmount(creditCard.getRunningBalance(), configuration));
	toReturn += renderFact("Credits (count)", creditCard.getCreditsCount());
	toReturn += renderFact("Credits (sum)", getModestyFilteredAmount(creditCard.getCreditsSum(), configuration));
	toReturn += renderFact("Debits (count)", creditCard.getDebitsCount());
	toReturn += renderFact("Debits (sum)", getModestyFilteredAmount(creditCard.getDebitsSum(), configuration));

	toReturn += renderFactHeading("Transactions");

	toReturn += "<table class='table table-striped table-condensed table-hover'><thead><tr><th>Date</th><th>Description</th><th class='r'>Credit</th><th class='r'>Debit</th></tr></thead><tbody>";

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	for (FinancialTransaction transaction : creditCard.getTransactions())
	{
		String desc = transaction.getDescription();
		if (desc == null) {
			desc = "[None]";
		}

		String amountCredited = "";
		if (transaction.getAmountCredited() != null) {
			amountCredited = getModestyFilteredAmount(transaction.getAmountCredited(), configuration);
		}

		String amountDebited = "";
		if (transaction.getAmountDebited() != null) {
			amountDebited = getModestyFilteredAmount(transaction.getAmountDebited(), configuration);
		}

		String dateFormatted = dateFormat.format(transaction.getDate());

		toReturn += "<tr><td>" + dateFormatted + "</td><td title='ID: " + transaction.getID() + "'>" + transaction.getDescription() +"</td><td class='r'>" + amountCredited + "</td><td class='r d'>" + amountDebited + "</td></tr>";
	}

	toReturn += "</tbody></table>";

	toReturn += "</div>";
	return toReturn;
    }

    private final static String renderFinancialProvider(FinancialProvider financialProvider, PrettifyConfiguration configuration)
    {
        String toReturn = "<div class='fact'>";

        toReturn += renderFact("Name", financialProvider.getProviderName());

        int ct = 0;
        if (financialProvider.getFinancialAccounts() != null && !financialProvider.getFinancialAccounts().isEmpty())
        {
		toReturn += renderFactHeading("Financial Accounts");

		for (FinancialAccount account : financialProvider.getFinancialAccounts())
		{
			toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
			toReturn += renderFinancialAccount(account, configuration);
			toReturn += "</div>";
		}
        }
        else if (financialProvider.getFinancialCreditCards() != null && !financialProvider.getFinancialCreditCards().isEmpty())
        {
		toReturn += renderFactHeading("Financial Credit Cards");

		for (FinancialCreditCard creditCard : financialProvider.getFinancialCreditCards())
		{
			toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
			toReturn += renderFinancialCreditCard(creditCard, configuration);
			toReturn += "</div>";
		}
        }

        toReturn += "</div>";

        return toReturn;
    }
    
    private final static String renderFinancialData(MiiFinancialData miiFinancialData, PrettifyConfiguration configuration)
    {
        String toReturn = "<div class='fact'>";

        toReturn += "<h2>Financial Data</h2>";
        toReturn += renderFactHeading("Financial Providers");

        int ct = 0;
        if (miiFinancialData.getFinancialProviders() != null)
        {
            for (FinancialProvider provider : miiFinancialData.getFinancialProviders())
            {
                toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderFinancialProvider(provider, configuration);
                toReturn += "</div>";
            }
        }

        toReturn += "</div>";

        return toReturn;
    }
    
    private final static String renderFinancialRefreshStatus(FinancialRefreshStatus financialRefreshStatus, PrettifyConfiguration configuration)
    {
        String toReturn = "<div class='fact'>";

    	toReturn += renderFact("State", financialRefreshStatus.getState());
    	
        toReturn += "</div>";

        return toReturn;
    }
    
    private final static String renderQualification(Qualification qualification) {
        String toReturn = "<div class='fact'>";

    	toReturn += renderFact("Type", qualification.getType());
    	toReturn += renderFact("Title", qualification.getTitle());
    	toReturn += renderFact("Provider", qualification.getDataProvider());
    	toReturn += renderFact("Provider URL", qualification.getDataProviderUrl());
    	
        toReturn += "</div>";

        return toReturn;
    }
    
    private final static String renderAuthenticationDetails(AuthenticationDetails authenticationDetails, PrettifyConfiguration configuration) {
        String toReturn = "<div class='fact'>";
        toReturn += renderFactHeading("Authentication details");

        toReturn += renderFact("Timestamp UTC", authenticationDetails.getAuthenticationTimeUtc());
        toReturn += renderFact("2FA type", authenticationDetails.getSecondFactorTokenType());
        toReturn += renderFact("2FA provider", authenticationDetails.getSecondFactorProvider());

        toReturn += "<div class='fact'>";
        toReturn += renderFactHeading("Locations");

        int ct = 0;
        if (authenticationDetails.getLocations() != null && !authenticationDetails.getLocations().isEmpty())
        {
            for (GeographicLocation location : authenticationDetails.getLocations())
            {
                toReturn += "<div class='fact'><h4>[" + ct++ + "]</h4>";
                toReturn += renderGeographicLocation(location);
                toReturn += "</div>";
            }
        }
        else
        {
            toReturn += "<p><i>No locations</i></p>";
        }

        toReturn += "</div></div>";

        return toReturn;
    }
    
    private final static String renderGeographicLocation(GeographicLocation location) {
        String toReturn = "<div class='fact'>";

    	toReturn += renderFact("Provider", location.getLocationProvider());
    	toReturn += renderFact("Latitude", location.getLatitude());
    	toReturn += renderFact("Longitude", location.getLongitude());
    	toReturn += renderFact("Accuracy (metres, est.)", location.getLatLongAccuracyMetres());
    	
    	if (location.getApproximateAddress() != null) {
    		toReturn += renderFactHeading("Approximate postal address");
    		
    		toReturn += renderAddress(location.getApproximateAddress());
    	}
    	else {
    		toReturn += renderFact("Approximate postal address", null);
    	}
    	
        toReturn += "</div>";

        return toReturn;    	
    }

    public final static String renderCreditBureauVerification(CreditBureauVerification verification) {
	String toReturn = "<div class='fact'>";

	toReturn += renderFact("Last verified", verification.getLastVerified());
	toReturn += renderFact("Data", verification.getData());

	toReturn += "</div>";

	return toReturn;
    }

    private final static String renderCreditBureauRefreshStatus(CreditBureauRefreshStatus status, PrettifyConfiguration configuration) {
	String toReturn = "<div class='fact'>";

	toReturn += renderFact("State", status.getState());

	toReturn += "</div>";

	return toReturn;
    }
}
