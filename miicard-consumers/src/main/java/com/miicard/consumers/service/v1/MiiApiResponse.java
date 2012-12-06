package com.miicard.consumers.service.v1;

import com.miicard.consumers.service.v1.claims.impl.MiiApiCallStatus;
import com.miicard.consumers.service.v1.claims.impl.MiiApiErrorCode;

/**
 * Wraps the result of an API call in a standardised response envelope.
 * 
 * @author Paul.ONeill
 *
 * @param <T>
 */
public class MiiApiResponse<T> { 
	
	/**
	 * The Api Call Status.
	 */
	private MiiApiCallStatus status;
	
    /**
     * The Error Message.
     */
    private String errorMessage;
    
    /**
     * The payload of the response.
     */
    private T data;
    
    /**
     * Whether the response relates to a user marked as a tester - for these types of users
     * identity assurance status always reports as valid, so cannot be trusted in production
     * systems.
     */
    private boolean isTestUser;
    
    /**
     * The Error Code.
     */
    private MiiApiErrorCode errorCode;
    
    /**
     * Returns the status of the API call.
     * 
     * @return the Api Call Status
     */
    public final MiiApiCallStatus getStatus() {
    	return this.status;   
    }
    
    /**
     * Returns the specific error code associated with the API call.
     * 
     * @return the Error Code
     */
    public final MiiApiErrorCode getErrorCode() {
        return this.errorCode;
    }
    
    /**
     * Returns any additional error information associated with an error state.
     * Intended for use only with the MiiCardApiErrorCode.EXCEPTION ErrorCode
     * value, though can be used for any additional error information.
     * 
     * @return the Error Message.
     */
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    /**
     * Returns the payload of the response, representing the raw result of the
     * API call being wrapped.
     * 
     * @return data
     */
    public final T getData() {
        return data;
    }
    
    /**
     * Returns whether the response relates to a user marked as a tester - for these types of users
     * identity assurance status always reports as valid, so cannot be trusted in production
     * systems.
     * @return True if the user is marked as a tester
     */
    public final boolean getIsTestUser() {
    	return this.isTestUser;
    }
    
    /**
     * Initialises a new MiiApiResponse.
     * 
     * @param status        the overall status of the API call
     * @param errorCode     the error code of any error raised by making the API call
     * @param errorMessage  the error message associated with any error raised by making the API call
     * @param data          the payload of the call, if any
     * @param isTestUser    whether the user is a tester
     */
    public MiiApiResponse(
    		final MiiApiCallStatus status, 
    		final MiiApiErrorCode errorCode, 
    		final String errorMessage, 
    		final T data,
    		final boolean isTestUser) {
        
    	this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
        this.isTestUser = isTestUser;
    }
}
