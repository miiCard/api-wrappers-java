package com.miicard.consumers;

/**
 * Base class for exceptions thrown as a result of trying to access the miiCard
 * API.
 * 
 * @author Paul.ONeill
 * 
 */
public class MiiCardException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * Creates a new instance of
     * <code>MiiCardException</code> without detail message.
     */
    public MiiCardException() {
        super("There was a problem accessing the API.");
    }

    /**
     * Constructs an instance of
     * <code>MiiCardException</code> with the specified message detail.
     *
     * @param message detail message
     */
    public MiiCardException(final String message) {
        super(message);
    }
    
    /**
     * Constructs an instance of
     * <code>MiiCardException</code> with the specified cause.
     * 
     * @param cause the root cause of the exception
     */
    public MiiCardException(final Throwable cause) {
    	super(cause);
    }
}
