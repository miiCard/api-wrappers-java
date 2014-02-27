package com.miicard.consumers.testharness;

/**
 * 
 * @author Paul.ONeill
 * 
 */
public class HarnessViewModel {
	
	private String consumerKey = "";
	private String consumerSecret = "";
    private String accessToken = "";
    private String accessTokenSecret = "";
    private String lastGetClaimsResult;
    private String lastIsUserAssuredResult;
    private String lastIsSocialAccountAssuredResult;
    private String lastGetIdentitySnapshotDetailsResult;
    private String lastGetIdentitySnapshotResult;
    private String lastGetFinancialTransactionsResult;
    private String lastGetFinancialTransactionsCreditCardsResult;
    private boolean showAssuranceImage;
    private String assuranceImageType = "";
    private String socialAccountId = "";
    private String socialAccountType = "";
    private boolean showOAuthDetailsRequiredError;
    private String identitySnapshotDetailsSnapshotId = "";
    private String identitySnapshotId = "";
    private String identitySnapshotPdfId = "";
    private String authenticationDetailsSnapshotId = "";
    private boolean showCardImage;
    private String cardImageSnapshotId = "";
    private String cardImageFormat = "";
    private boolean cardImageShowEmailAddress;
    private boolean cardImageShowPhoneNumber;
    private String financialDataModestyLimit = "100";
    private String financialDataCreditCardsModestyLimit = "100";
    private String lastIsRefreshInProgressResult;
    private String lastIsRefreshInProgressCreditCardsResult;
    private String lastRefreshFinancialDataResult;
    private String lastRefreshFinancialDataCreditCardsResult;
    private String lastGetAuthenticationDetailsResult;
    
    private String directoryCriterion;
    private String directoryCriterionValue = "";
    private Boolean directoryCriterionValueHashed = false;
    private String lastDirectorySearchResult;

    /**
     * Gets the Consumer Key.
     * 
     * @return the Consumer Key
     */
    public final String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Sets the Consumer Key.
     * 
     * @param consumerKey the Consumer Key
     */
    public final void setConsumerKey(
    		final String consumerKey) {
        
    	this.consumerKey = consumerKey;
    }

    /**
     * Gets the Consumer Secret.
     * 
     * @return the Consumer Secret
     */
    public final String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Sets the Consumer Secret.
     * 
     * @param consumerSecret the Consumer Secret
     */
    public final void setConsumerSecret(
    		final String consumerSecret) {
        
    	this.consumerSecret = consumerSecret;
    }

    /**
     * Gets the Access Token.
     * 
     * @return the Access Token
     */
    public final String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the Access Token.
     * 
     * @param accessToken the Access Token
     */
    public final void setAccessToken(
    		final String accessToken) {
        
    	this.accessToken = accessToken;
    }

    /**
     * Gets the Access Token Secret.
     * 
     * @return the Access Token Secret
     */
    public final String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    /**
     * Sets the Access Token Secret.
     * 
     * @param accessTokenSecret  the Access Token Secret
     */
    public final void setAccessTokenSecret(
    		final String accessTokenSecret) {
        
    	this.accessTokenSecret = accessTokenSecret;
    }

    /**
     * Gets the last getClaims result.
     * 
     * @return the last getClaims result
     */
    public final String getLastGetClaimsResult() {
        return lastGetClaimsResult;
    }

    /**
     * Sets the last getClaims result.
     * 
     * @param lastGetClaimsResult the last getClaims result
     */
    public final void setLastGetClaimsResult(
    		final String lastGetClaimsResult) {
        
    	this.lastGetClaimsResult = lastGetClaimsResult;
    }

    /**
     * Gets the last isUserAssured result.
     * 
     * @return the last isUserAssured result
     */
    public final String getLastIsUserAssuredResult() {
        return lastIsUserAssuredResult;
    }

    /**
     * Sets the last isUserAssured result. 
     * 
     * @param lastIsUserAssuredResult the last isUserAssured result
     */
    public final void setLastIsUserAssuredResult(
    		final String lastIsUserAssuredResult) {
        
    	this.lastIsUserAssuredResult = lastIsUserAssuredResult;
    }

    /**
     * Gets the last isSocialAccountAssured result.
     * 
     * @return the last isSocialAccountAssured result
     */
    public final String getLastIsSocialAccountAssuredResult() {
        return lastIsSocialAccountAssuredResult;
    }

    /**
     * Sets the last isSocialAccountAssured result.
     * 
     * @param lastIsSocialAccountAssuredResult 
     * the last isSocialAccountAssured result
     */
    public final void setLastIsSocialAccountAssuredResult(
    		final String lastIsSocialAccountAssuredResult) {
        
    	this.lastIsSocialAccountAssuredResult 
    		= lastIsSocialAccountAssuredResult;
    }
    
    public final String getLastGetIdentitySnapshotDetailsResult() {
    	return lastGetIdentitySnapshotDetailsResult;
    }
    
    public final void setLastGetIdentitySnapshotDetailsResult(String lastGetIdentitySnapshotDetailsResult){
    	this.lastGetIdentitySnapshotDetailsResult = lastGetIdentitySnapshotDetailsResult;
    }
    
    public final String getLastGetIdentitySnapshotResult() {
    	return lastGetIdentitySnapshotResult;
    }
    
    public final void setLastGetIdentitySnapshotResult(String lastGetIdentitySnapshotResult) {
    	this.lastGetIdentitySnapshotResult = lastGetIdentitySnapshotResult;
    }

    /**
     * Is showAssuranceImage true?
     * 
     * @return is showAssuranceImage true
     */
    public final boolean isShowAssuranceImage() {
        return showAssuranceImage;
    }

    /**
     * Sets the Assurance Image to true or false.
     * 
     * @param showAssuranceImage the Assurance Image
     */
    public final void setShowAssuranceImage(
    		final boolean showAssuranceImage) {
       
    	this.showAssuranceImage = showAssuranceImage;
    }

    /**
     * Gets the Assurance Image type.
     * 
     * @return the Assurance Image type
     */
    public final String getAssuranceImageType() {
        return assuranceImageType;
    }

    /**
     * Sets the Assurance Image type
     * 
     * @param assuranceImageType
     */
    public final void setAssuranceImageType(
    		final String assuranceImageType) {
        
    	this.assuranceImageType = assuranceImageType;
    }

    /**
     * Gets the Social Account ID.
     * 
     * @return the Social Account ID
     */
    public final String getSocialAccountId() {
        return socialAccountId;
    }

    /**
     * Sets the Social Account ID.
     * 
     * @param socialAccountId the Social Account ID
     */
    public final void setSocialAccountId(
    		final String socialAccountId) {
        
    	this.socialAccountId = socialAccountId;
    }

    /**
     * Gets the Social Account Type.
     * 
     * @return the Social Account Type
     */
    public final String getSocialAccountType() {
        return socialAccountType;
    }

    /**
     * Sets the Social Account Type.
     * 
     * @param socialAccountType the Social Account Type
     */
    public final void setSocialAccountType(
    		final String socialAccountType) {
        
    	this.socialAccountType = socialAccountType;
    }

    /**
     * Is show OAuth details required?
     * 
     * @return is show OAuth details required
     */
    public final boolean isShowOAuthDetailsRequiredError() {
        return showOAuthDetailsRequiredError;
    }

    /**
     * Sets if show OAuth details required
     * 
     * @param showOAuthDetailsRequiredError 
     * is show OAuth details required
     */
    public final void setShowOAuthDetailsRequiredError(
    		final boolean showOAuthDetailsRequiredError) {
        
    	this.showOAuthDetailsRequiredError 
    		= showOAuthDetailsRequiredError;
    }
    
    public final String getIdentitySnapshotDetailsSnapshotId() {
    	return this.identitySnapshotDetailsSnapshotId;    	
    }
    
    public final void setIdentitySnapshotDetailsSnapshotId(String identitySnapshotDetailsId){
    	this.identitySnapshotDetailsSnapshotId = identitySnapshotDetailsId;
    }
    
    public final String getIdentitySnapshotId() {
    	return this.identitySnapshotId;
    }
    
    public final void setIdentitySnapshotId(String identitySnapshotId){
    	this.identitySnapshotId = identitySnapshotId;
    }
    
    public final String getIdentitySnapshotPdfId() {
    	return this.identitySnapshotPdfId;
    }
    
    public final void setIdentitySnapshotPdfId(String identitySnapshotPdfId) {
    	this.identitySnapshotPdfId = identitySnapshotPdfId;
    }

	public boolean getShowCardImage() {
		return showCardImage;
	}

	public void setShowCardImage(boolean showCardImage) {
		this.showCardImage = showCardImage;
	}

	public String getCardImageSnapshotId() {
		return cardImageSnapshotId;
	}

	public void setCardImageSnapshotId(String cardImageSnapshotId) {
		this.cardImageSnapshotId = cardImageSnapshotId;
	}

	public boolean getCardImageShowEmailAddress() {
		return cardImageShowEmailAddress;
	}

	public void setCardImageShowEmailAddress(boolean cardImageShowEmailAddress) {
		this.cardImageShowEmailAddress = cardImageShowEmailAddress;
	}

	public String getCardImageFormat() {
		return cardImageFormat;
	}

	public void setCardImageFormat(String cardImageFormat) {
		this.cardImageFormat = cardImageFormat;
	}

	public boolean getCardImageShowPhoneNumber() {
		return cardImageShowPhoneNumber;
	}

	public void setCardImageShowPhoneNumber(boolean cardImageShowPhoneNumber) {
		this.cardImageShowPhoneNumber = cardImageShowPhoneNumber;
	}

	public String getLastGetFinancialTransactionsResult() {
		return lastGetFinancialTransactionsResult;
	}

	public void setLastGetFinancialTransactionResult(String lastGetFinancialDataResult) {
		this.lastGetFinancialTransactionsResult = lastGetFinancialDataResult;
	}

	public String getLastGetFinancialTransactionsCreditCardsResult() {
		return lastGetFinancialTransactionsCreditCardsResult;
	}

	public void setLastGetFinancialTransactionCreditCardsResult(String lastGetFinancialDataCreditCardsResult) {
		this.lastGetFinancialTransactionsCreditCardsResult = lastGetFinancialDataCreditCardsResult;
	}
	
	public String getFinancialDataModestyLimit() {
		return this.financialDataModestyLimit;
	}
	
	public void setFinancialDataModestyLimit(final String value) {
		this.financialDataModestyLimit = value;
	}

	public String getFinancialDataCreditCardsModestyLimit() {
		return this.financialDataCreditCardsModestyLimit;
	}

	public void setFinancialDataCreditCardsModestyLimit(final String value) {
		this.financialDataCreditCardsModestyLimit = value;
	}

	public String getLastIsRefreshInProgressResult() {
		return lastIsRefreshInProgressResult;
	}

	public void setLastIsRefreshInProgressResult(
			String lastIsRefreshInProgressResult) {
		this.lastIsRefreshInProgressResult = lastIsRefreshInProgressResult;
	}

	public String getLastIsRefreshInProgressCreditCardsResult() {
		return lastIsRefreshInProgressCreditCardsResult;
	}

	public void setLastIsRefreshInProgressCreditCardsResult(
			String lastIsRefreshInProgressCreditCardsResult) {
		this.lastIsRefreshInProgressCreditCardsResult = lastIsRefreshInProgressCreditCardsResult;
	}

	public String getLastRefreshFinancialDataResult() {
		return lastRefreshFinancialDataResult;
	}

	public void setLastRefreshFinancialDataResult(
			String lastRefreshFinancialDataResult) {
		this.lastRefreshFinancialDataResult = lastRefreshFinancialDataResult;
	}

	public String getLastRefreshFinancialDataCreditCardsResult() {
		return lastRefreshFinancialDataCreditCardsResult;
	}

	public void setLastRefreshFinancialDataCreditCardsResult(
			String lastRefreshFinancialDataCreditCardsResult) {
		this.lastRefreshFinancialDataCreditCardsResult = lastRefreshFinancialDataCreditCardsResult;
	}

	public String getAuthenticationDetailsSnapshotId() {
		return authenticationDetailsSnapshotId;
	}

	public void setAuthenticationDetailsSnapshotId(
			String authenticationDetailsSnapshotId) {
		this.authenticationDetailsSnapshotId = authenticationDetailsSnapshotId;
	}

	public String getLastGetAuthenticationDetailsResult() {
		return lastGetAuthenticationDetailsResult;
	}

	public void setLastGetAuthenticationDetailsResult(
			String lastGetAuthenticationDetailsResult) {
		this.lastGetAuthenticationDetailsResult = lastGetAuthenticationDetailsResult;
	}
	
    public String getDirectoryCriterion() {
    	return this.directoryCriterion;
    }
    
    public void setDirectoryCriterion(final String directoryCriterion) {
    	this.directoryCriterion = directoryCriterion;
    }
    
    public String getDirectoryCriterionValue() {
    	return this.directoryCriterionValue;
    }
    
    public void setDirectoryCriterionValue(final String directoryCriterionValue) {
    	this.directoryCriterionValue = directoryCriterionValue;
    }
    
    public Boolean getDirectoryCriterionValueHashed() {
    	return this.directoryCriterionValueHashed;
    }
    
    public void setDirectoryCriterionValueHashed(final Boolean value) {
    	this.directoryCriterionValueHashed = value;
    }
    
    public String getLastDirectorySearchResult() {
    	return this.lastDirectorySearchResult;
    }
    
    public void setLastDirectorySearchResult(final String directorySearchResult) {
    	this.lastDirectorySearchResult = directorySearchResult;
    }
}
