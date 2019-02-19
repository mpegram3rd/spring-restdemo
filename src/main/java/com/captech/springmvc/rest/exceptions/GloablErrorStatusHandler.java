package com.captech.springmvc.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <p>
 * Handler for Exceptions to produce normalized error responses.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
@ControllerAdvice
public class GloablErrorStatusHandler {

	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(DataNotFoundException.class)
	public void notFound(final Exception ex) {
		System.err.println("We didn't find data... throwing a 404.  Error Msg: " + ex.getMessage());
	}
}
