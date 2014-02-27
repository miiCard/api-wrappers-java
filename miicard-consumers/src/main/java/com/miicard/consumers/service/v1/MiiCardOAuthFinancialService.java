package com.miicard.consumers.service.v1;

import com.miicard.consumers.MiiCardSigningException;
import com.miicard.consumers.ServiceUrls;
import com.miicard.consumers.service.v1.MiiApiResponse;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfBoolean;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfFinancialRefreshStatus;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfMiiFinancialData;
import com.miicard.consumers.service.v1.financial.api.FinancialRefreshStatus;
import com.miicard.consumers.service.v1.financial.api.MiiFinancialData;
import com.miicard.consumers.service.v1.financial.impl.Financial;
import com.miicard.consumers.service.v1.financial.impl.IFinancial;

import java.util.Collections;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthException;

/**
 * Wraps the Claims API for easy integration.
 * 
 * @author Paul.ONeill
 * 
 */
@SuppressWarnings("restriction")
public class MiiCardOAuthFinancialService extends MiiCardOAuthServiceBase {
	/**
     * Initialises a new MiiCardOAuthFinancialService using the supplied OAuth
     * credentials.
     * 
     * @param consumerKey       the OAuth consumer key
     * @param consumerSecret    the OAuth consumer secret
     * @param accessToken       the OAuth access token representing the user 
     * on whose behalf the API will make calls
     * @param accessTokenSecret the OAuth access token secret 
     * corresponding to the supplied access token
     */
    public MiiCardOAuthFinancialService(
    		final String consumerKey, 
    		final String consumerSecret, 
    		final String accessToken, 
    		final String accessTokenSecret) {
        
    	super(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }
    
    public MiiApiResponse<Boolean> isRefreshInProgress() 
    		throws MiiCardSigningException {
    	MiiApiResponseOfBoolean response =
    			this.getAuthorisedService().isRefreshInProgress();
    	
    	return new MiiApiResponse<Boolean>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.isData(),
                response.getIsTestUser()
                );
    }
    
    public MiiApiResponse<Boolean> isRefreshInProgressCreditCards() 
    		throws MiiCardSigningException {
    	MiiApiResponseOfBoolean response =
    			this.getAuthorisedService().isRefreshInProgressCreditCards();
    	
    	return new MiiApiResponse<Boolean>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.isData(),
                response.getIsTestUser()
                );
    }
    
    public MiiApiResponse<FinancialRefreshStatus> refreshFinancialData() 
    		throws MiiCardSigningException {
    	MiiApiResponseOfFinancialRefreshStatus response =
    			this.getAuthorisedService().refreshFinancialData();
    	
    	return new MiiApiResponse<FinancialRefreshStatus>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.getData(),
                response.getIsTestUser()
                );
    }
    
    public MiiApiResponse<FinancialRefreshStatus> refreshFinancialDataCreditCards() 
    		throws MiiCardSigningException {
    	MiiApiResponseOfFinancialRefreshStatus response =
    			this.getAuthorisedService().refreshFinancialDataCreditCards();
    	
    	return new MiiApiResponse<FinancialRefreshStatus>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.getData(),
                response.getIsTestUser()
                );
    }

    public MiiApiResponse<MiiFinancialData> getFinancialData() 
    	throws MiiCardSigningException {
    	MiiApiResponseOfMiiFinancialData response = 
    			this.getAuthorisedService().getFinancialTransactions();
    	
    	return new MiiApiResponse<MiiFinancialData>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.getData(),
                response.getIsTestUser()
                );
    }

    public MiiApiResponse<MiiFinancialData> getFinancialDataCreditCards() 
    	throws MiiCardSigningException {
    	MiiApiResponseOfMiiFinancialData response = 
    			this.getAuthorisedService().getFinancialTransactionsCreditCards();
    	
    	return new MiiApiResponse<MiiFinancialData>(                
    			response.getStatus(), 
                response.getErrorCode(), 
                response.getErrorMessage(), 
                response.getData(),
                response.getIsTestUser()
                );
    }
    
    /**
     * Gets the Authorised Service.
     * 
     * @return the Authorised Service
     * @throws MiiCardSigningException
     */
    private final IFinancial getAuthorisedService() 
    		throws MiiCardSigningException {
        
    	Financial service = new Financial();
        
    	IFinancial port = service.getBasicHttpBindingIFinancial();
                
        OAuthConsumer consumer 
        	= new DefaultOAuthConsumer(
        			this.getConsumerKey(), 
        			this.getConsumerSecret());
        
        consumer.setTokenWithSecret(
        		this.getAccessToken(), 
        		this.getAccessTokenSecret());
        
        DummySOAPRequest request = new DummySOAPRequest();
        
        request.setRequestUrl(ServiceUrls.FINANCIAL_SERVICE_V1);
        
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
        		ServiceUrls.FINANCIAL_SERVICE_V1);
                
        return port;
    }
}
