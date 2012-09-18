package com.miicard.consumers.service.v1;

import com.miicard.consumers.MiiCardSigningException;
import com.miicard.consumers.ServiceUrls;
import com.miicard.consumers.service.v1.MiiApiResponse;
import com.miicard.consumers.service.v1.claims.api.MiiUserProfile;
import com.miicard.consumers.service.v1.claims.impl.Claims;
import com.miicard.consumers.service.v1.claims.impl.IClaims;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfMiiUserProfile;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfBoolean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.http.HttpRequest;

/**
 * Wraps the Claims API for easy integration.
 * 
 * @author Paul.ONeill
 * 
 */
public class MiiCardOAuthClaimsService extends MiiCardOAuthServiceBase {
    
	/**
     * Initialises a new MiiCardOAuthClaimsService using the supplied OAuth
     * credentials.
     * 
     * @param consumerKey       the OAuth consumer key
     * @param consumerSecret    the OAuth consumer secret
     * @param accessToken       the OAuth access token representing the user 
     * on whose behalf the API will make calls
     * @param accessTokenSecret the OAuth access token secret 
     * corresponding to the supplied access token
     */
    public MiiCardOAuthClaimsService(
    		final String consumerKey, 
    		final String consumerSecret, 
    		final String accessToken, 
    		final String accessTokenSecret) {
        
    	super(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }
    
    /**
     * Returns the set of identity information that the user has elected to
     * share with your application.
     * 
     * @return MiiUserProfile that the user has shared
     * @throws MiiCardSigningException 
     */
    public final MiiApiResponse<MiiUserProfile> getClaims()
            throws MiiCardSigningException {
        
    	MiiApiResponseOfMiiUserProfile response 
    		= this.getAuthorisedService().getClaims();
        
        return new MiiApiResponse<MiiUserProfile>(
                    response.getStatus(), 
                    response.getErrorCode(), 
                    response.getErrorMessage(), 
                    response.getData()
        );
    }
    
    /**
     * Returns whether the user's identity remains assured.
     * 
     * @return MiiApiResponse Boolean
     * @throws MiiCardSigningException
     */
    public final MiiApiResponse<Boolean> isUserAssured()
            throws MiiCardSigningException {
        
    	MiiApiResponseOfBoolean response 
    		= this.getAuthorisedService().isUserAssured();
        
        return new MiiApiResponse<Boolean>(
                    response.getStatus(), 
                    response.getErrorCode(), 
                    response.getErrorMessage(), 
                    response.isData()
        );
    }
    
    /**
     * Returns whether a social media account belongs to the user.
     * 
     * @param socialAccountId   The ID of the user on the social network. The ID
     *                          will vary depending on the network; for some
     *                          it might be an internal numeric identifier. You
     *                          may also query against the public profile URL
     *                          of the user on the social network
     * @param socialAccountType The social account type - this will be the
     *                          name of the network, and can at present be one
     *                          of 'Twitter', 'Google', 'LiveID', 'Facebook',
     *                          'LinkedIn'. Note that this list may expand in
     *                          future, and the most up-to-date list can be
     *                          found on the miiCard website.
     */
    public final MiiApiResponse<Boolean> isSocialAccountAssured(
    		final String socialAccountId, 
    		final String socialAccountType)
            throws MiiCardSigningException {
        
    	MiiApiResponseOfBoolean response 
    		= this.getAuthorisedService().isSocialAccountAssured(
    				socialAccountId, 
    				socialAccountType);
        
        return new MiiApiResponse<Boolean>(
                    response.getStatus(), 
                    response.getErrorCode(), 
                    response.getErrorMessage(), 
                    response.isData()
        );
    }
    
    /**
     * Returns a graphical representation of a user's identity assurance status,
     * in PNG format.
     * 
     * @param type  The type of image required - can be one of:
     *              <b>banner</b>: a 365x48px banner showing the date and time
     *              that the user's identity was last assured<br/>
     *              <b>badge</b>: a 118x53px image showing a tick on a green
     *              background or an exclamation mark on a red background
     *              depending on the user's assurance status.
     *              <b>badge-small</b>: a 40x18px equivalent of the <i>badge</i>
     *              type image.
     */
    public final InputStream assuranceImage(
    		final String type)
            throws MiiCardSigningException {
    	
    	byte[] response = this.getAuthorisedService().assuranceImage(type);
    	
    	return new ByteArrayInputStream(response);
    }
    
    /**
     * Gets the Authorised Service.
     * 
     * @return the Authorised Service
     * @throws MiiCardSigningException
     */
    private final IClaims getAuthorisedService() 
    		throws MiiCardSigningException {
        
    	Claims service = new Claims();
        
    	IClaims port = service.getBasicHttpBindingIClaims();
                
        OAuthConsumer consumer 
        	= new DefaultOAuthConsumer(
        			this.getConsumerKey(), 
        			this.getConsumerSecret());
        
        consumer.setTokenWithSecret(
        		this.getAccessToken(), 
        		this.getAccessTokenSecret());
        
        DummySOAPRequest request = new DummySOAPRequest();
        
        request.setRequestUrl(ServiceUrls.CLAIMS_SERVICE_V1);
        
        try {
        	consumer.sign(request);
        }
        catch (OAuthException cause) {
            throw new MiiCardSigningException(cause);
        }
        
        /**
         * Transplant the OAuth authorisation header from the dummy request to the actual SOAP request,
         * and change the endpoint to match that reported by the ServiceUrls class.
         */
        Map<String, Object> requestContext 
        	= ((BindingProvider) port).getRequestContext();
        
        requestContext.put(
        		MessageContext.HTTP_REQUEST_HEADERS, 
        		Collections.singletonMap("Authorization", 
        				Collections.singletonList(
        						(request.getHeader("Authorization")))));
        
        requestContext.put(
        		BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
        		ServiceUrls.CLAIMS_SERVICE_V1);
                
        return port;
    }
}

/**
 * Internal class for OAuth signing support.
 * 
 * @author Paul.ONeill
 * 
 */
final class DummySOAPRequest implements HttpRequest {
    
	/**
	 * String of the Request URL.
	 */
	private String requestUrl;
    
	/**
	 * Map of Headers.
	 */
	private Map<String, String> headers 
		= new HashMap<String, String>();
	
	/**
	 * Gets the HTTP Method.
	 */
    public final String getMethod() {
        return "POST";
    }
    
    /**
     * Gets the Request URL.
     */
    public final String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Sets the Request URL.
     */
    public final void setRequestUrl(
    		final String string) {
        
    	requestUrl = string;
    }

    /**
     * Sets the Header.
     */
    public final void setHeader(
    		final String key, 
    		final String value) {
        
    	headers.put(key, value);
    }

    /**
     * Gets the Header.
     */
    public final String getHeader(
    		final String string) {
        
    	return headers.get(string);
    }

   /**
    * Gets a Map of all Headers.
    */
    public final Map<String, String> getAllHeaders() {
        return headers;
    }

    /**
     * Gets the Message Payload.
     */
    public final InputStream getMessagePayload() 
    		throws IOException {
        
    	return null;
    }

    /**
     * Gets the Content Type.
     */
    public final String getContentType() {
        return "application/soap+xml";
    }

    /**
     * Unwrap, just returns Null...
     */
    public final Object unwrap() {
        return null;
    }
}