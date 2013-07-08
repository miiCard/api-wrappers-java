package com.miicard.consumers.testharness;

/**
 * 
 * @author Paul.ONeill
 * 
 */
public class HarnessViewModel {
	
	/**
	 * String of the Consumer Key.
	 */
	private String consumerKey = "";
	
	/**
	 * String of the Consumer Secret.
	 */
	private String consumerSecret = "";
    
	/**
	 * String of the Access Token.
	 */
	private String accessToken = "";
    
	/**
	 * String of the Access Token Secret.
	 */
    private String accessTokenSecret = "";
    
    /**
     * String of the result of the last getClaims.
     */
    private String lastGetClaimsResult;
    
    /**
     * String of the result of the last isUserAssuredResult.
     */
    private String lastIsUserAssuredResult;
    
    /**
     * String of the result of the last isSocialAccountAssured.
     */
    private String lastIsSocialAccountAssuredResult;
    
    private String lastGetIdentitySnapshotDetailsResult;
    private String lastGetIdentitySnapshotResult;
    
    /**
     * Boolean of show Assurance image.
     */
    private boolean showAssuranceImage;
    
    /**
     * String of the Assurance image type.
     */
    private String assuranceImageType = "";
    
    /**
     * String of the Social Account ID.
     */
    private String socialAccountId = "";
    
    /**
     * String of the Social Account Type.
     */
    private String socialAccountType = "";
    
    /**
     * Boolean of if show OAuth details is required.
     */
    private boolean showOAuthDetailsRequiredError;
    
    private String identitySnapshotDetailsId = "";
    private String identitySnapshotId = "";
    private String identitySnapshotPdfId = "";

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
    
    public final String getIdentitySnapshotDetailsId() {
    	return this.identitySnapshotDetailsId;    	
    }
    
    public final void setIdentitySnapshotDetailsId(String identitySnapshotDetailsId){
    	this.identitySnapshotDetailsId = identitySnapshotDetailsId;
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
}
