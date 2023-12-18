package com.customeexception;

public class DigitFoundException extends RuntimeException{
	public DigitFoundException() {
		super();
	}

	public DigitFoundException(String message) {
		super(message);
	}
}
