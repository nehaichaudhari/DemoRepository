package com.customeexception;

public class InvalideNameException extends RuntimeException {
	public InvalideNameException() {
		super();
	}

	public InvalideNameException(String message) {
		super(message);
	}

}
