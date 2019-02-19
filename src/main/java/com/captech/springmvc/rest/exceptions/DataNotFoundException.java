package com.captech.springmvc.rest.exceptions;

/**
 * <p>
 * Exception when a data element can't be found.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class DataNotFoundException extends Exception {

	public DataNotFoundException() {
	}

	public DataNotFoundException(String message) {
		super(message);
	}

	public DataNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataNotFoundException(Throwable cause) {
		super(cause);
	}

	public DataNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
