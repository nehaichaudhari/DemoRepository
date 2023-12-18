package com.exception.seventeenoct;

public class CheckedExceptionPropagation1 {
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
	
	void method2() throws ClassNotFoundException {
		method1();// here it will give error so we need to throws exception or need to handle it using try catch
	}
	
	void method3() throws ClassNotFoundException {
		method2();
	}
	public static void main(String[] args) throws ClassNotFoundException {
		CheckedExceptionPropagation1 obj1 = new CheckedExceptionPropagation1();
		obj1.method3();// here also get the error so need to throws exception or give within try catch block
	}

}
