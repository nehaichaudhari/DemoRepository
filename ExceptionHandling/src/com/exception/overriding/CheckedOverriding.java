package com.exception.overriding;

import java.io.IOException;

class Parent{
	int data=50;
	//not throwing any exception
	void printdata() {
		System.out.println(data);
	}
}
class Child extends Parent{
	int val=10;
	void printdata() throws ArithmeticException//,IOException-we cannot throw checked exception
	{
		if(val==0) {
			throw new ArithmeticException();
			//throw new IOException();
			//cannot throw checked exception
		}
	}
	
}
public class CheckedOverriding {

}
