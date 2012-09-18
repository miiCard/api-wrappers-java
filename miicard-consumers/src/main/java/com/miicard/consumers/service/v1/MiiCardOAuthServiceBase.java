package com.miicard.consumers.service.v1;

/**
 * Base class for miiCard API wrappers that perform OAuth-authorised requests
 * to the API.
 * 
 * @author Paul.ONeill
 * 
 */
public abstract class MiiCardOAuthServiceBase {
   
	/**
	 * The Consumer Key.
	 */
	private String consumerKey;
	
    /**
     * The Consumer Secret.
     */
    private String consumerSecret;
    
    /**
     * The Access Token.
     */
    private String accessToken;
    
    /**
     * The Access Token Secret.
     */
    private String accessTokenSecret;
    
	/**
     * Returns the Consumer Key used when signing OAuth requests.
     * 
     * @return the Consumer Key
     */
    public final String getConsumerKey(){
        return this.consumerKey;
    }
    
    /**
     * Returns the Consumer Secret used when signing OAuth requests.
     * 
     * @return the Consumer Secret
     */
    public final String getConsumerSecret(){
        return this.consumerSecret;
    }
    
    /**
     * Returns the Access Token used when signing OAuth requests.
     * 
     * @return the Access Token
     */
    public final String getAccessToken(){
        return this.accessToken;
    }
    
    /**
     * Returns the Access Token Secret used when signing OAuth requests.
     * 
     * @return the Access Token Secret
     */
    public final String getAccessTokenSecret() {
        return this.accessTokenSecret;
    }  
    
    /**
     * Initialises a new MiiCardOAuthServiceBase.
     * 
     * @param consumerKey       the OAuth consumer key
     * @param consumerSecret    the OAuth consumer secret
     * @param accessToken       the OAuth access token representing the user 
     * on whose behalf the API will make calls
     * @param accessTokenSecret the OAuth access token secret corresponding 
     * to the supplied access token
     * 
     */
    public MiiCardOAuthServiceBase(
    		final String consumerKey, 
    		final String consumerSecret, 
    		final String accessToken, 
    		final String accessTokenSecret) {
    	
    	this.consumerKey = consumerKey;
    	this.consumerSecret = consumerSecret;
    	this.accessToken = accessToken;
    	this.accessTokenSecret = accessTokenSecret;
    }
}
