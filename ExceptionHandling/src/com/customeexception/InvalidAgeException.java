package com.customeexception;

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
