package com.exception.overriding;

import java.io.IOException;

class Parent1{
	int data=50;
	void printdata() throws IOException{
		System.out.println(data);
		//checked exception
	}
}
//child class : overriding: can throw unchecked exception
//                         
// it can throw :  same checked exception, sub type
                     // not super type
//
class Child1 extends Parent1{
	int val=10;
	void printdata() throws ArithmeticException,IOException//,Exception
	{
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
			//throw new IOException(); - cannot give
	}
}
public class CheckedExceptionOverriding {

}
