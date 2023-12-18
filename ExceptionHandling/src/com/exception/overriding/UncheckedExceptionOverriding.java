package com.exception.overriding;

import java.io.IOException;

class Parent2 {
	int data = 50;

	void printdata() throws ArithmeticException {
		System.out.println(data);
		// throwing unchecked(runtime) exception
	}
}

/// child class : overriding: can throw unchecked exception
//                         sub class of unchecked exception, any other exception
// it cannot throw :  checked(compiletime) exception
class Child2 extends Parent2 {
	int val = 10;

	void printdata() throws ArrayIndexOutOfBoundsException, RuntimeException {
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data / val);
		// throw new IOException(); - cannot give
	}
}

public class UncheckedExceptionOverriding {

}
