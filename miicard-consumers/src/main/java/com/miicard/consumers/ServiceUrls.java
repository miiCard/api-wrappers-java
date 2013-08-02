package com.miicard.consumers;

/**
 * Houses the service URLs used by the miiCard API wrapper.
 * 
 * @author Paul.ONeill
 * 
 */
public class ServiceUrls {
    
	/**
     * The endpoint URL used for OAuth authorisation.
     */
    public static final String OAUTH_ENDPOINT 
    	= "https://sts.miicard.com/auth/OAuth.ashx";
    
    /**
     * The endpoint URL used for the Claims service.
     */
    public static final String CLAIMS_SERVICE_V1 
    	= "https://sts.miicard.com/api/v1/Claims.svc";
    
    /**
     * The endpoint URL used for the Financial service.
     */
    public static final String FINANCIAL_SERVICE_V1
    	= "https://sts.miicard.com/api/v1/Financial.svc";
    
    /**
     * The endpoint URL used for the Directory service.
     */
    public static final String DIRECTORY_SERVICE_V1
    	= "https://sts.miicard.com/api/v1/Members";
}
