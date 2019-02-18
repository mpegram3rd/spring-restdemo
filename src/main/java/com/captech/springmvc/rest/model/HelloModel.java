package com.captech.springmvc.rest.model;

import java.util.Date;

/**
 * <p>
 * Model for rest response
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class HelloModel {
	private final String name;
	private final Date date;

	public HelloModel(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	/**
	 * Getter for <code>name</code>
	 *
	 * @return a {@link String} object
	 */
	public String getName() {
		return new StringBuilder("Hello ").append(name).toString();
	}

	/**
	 * Getter for <code>date</code>
	 *
	 * @return a {@link java.util.Date} object
	 */
	public Date getDate() {
		return date;
	}
}
