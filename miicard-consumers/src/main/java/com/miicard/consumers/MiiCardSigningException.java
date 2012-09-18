package com.miicard.consumers;

/**
 * Represents an exception that occurred while signing a request before it
 * was sent to the API.
 * 
 * @author Paul.ONeill
 * 
 */
public class MiiCardSigningException extends MiiCardException {
	
	private static final long serialVersionUID = 1L;

	/**
     * Creates a new instance of
     * <code>MiiCardSigningException</code> without detail message.
     */
    public MiiCardSigningException() {
        super("There was a problem signing the API call message.");
    }

    /**
     * Constructs an instance of
     * <code>MiiCardSigningException</code> with the specified detail message.
     *
     * @param message the detail message.
     */
    public MiiCardSigningException(final String message) {
        super(message);
    }
    
    /**
     * Constructs an instance of
     * <code>MiiCardSigningException</code> with the specified detail message.
     *
     * @param cause the detail message.
     */
    public MiiCardSigningException(final Throwable cause) {
        super(cause);
    }
}
