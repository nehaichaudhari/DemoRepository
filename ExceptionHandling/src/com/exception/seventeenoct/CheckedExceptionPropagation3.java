package com.exception.seventeenoct;

public class CheckedExceptionPropagation3 {
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
	
	void method2() throws ClassNotFoundException {
		method1();// here it will give error so we need to throws exception or need to handle it using try catch
	}
	
	void method3() throws ClassNotFoundException {
		method2();
	}
	public static void main(String[] args){
		CheckedExceptionPropagation3 obj1 = new CheckedExceptionPropagation3();
		try {
			obj1.method3();
		} catch (ClassNotFoundException e) {
			System.out.println("in main catch block"+e);// here exception is handle in try catch block
		}
	}

}
