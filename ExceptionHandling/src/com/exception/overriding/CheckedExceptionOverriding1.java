package com.exception.overriding;

import java.io.IOException;

class Parent3{
	int data=50;
	void printdata() throws Exception{
		System.out.println(data);
		//throws checked(compiletime) exception
	}
}
//child class : overriding: can throw unchecked(runtime) exception
//                         
// it can throw :  same checked(compile time) exception, sub type
                   // not super type
//
class Child3 extends Parent3{
	int val=10;
	void printdata() throws ArithmeticException//,IOException//, Exception
	{
		if(val==0)
			//throw new IOException();
		System.out.println(data/val);
			throw new NullPointerException();
	}
}
public class CheckedExceptionOverriding1 {

}
