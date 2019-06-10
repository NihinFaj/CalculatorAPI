/**
 * Post Response Class that maps the arithmetic calculation response back to the client
 * @author Nihinlolamiwa Fajemilehin
 */

package com.example.calculatorapi.models;

public class PostResponse {
	private String message;
	private long id;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
