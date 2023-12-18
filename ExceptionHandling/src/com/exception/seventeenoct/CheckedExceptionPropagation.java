package com.exception.seventeenoct;

public class CheckedExceptionPropagation {
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException("class error");
	}
	void method2() throws ClassNotFoundException {
		method1();
	}
	//we cannot handle checked exception therefore we can we need to throws it
	void method3() {
		try {
		method2();
		}catch (Exception e) {
			System.out.println("in catch block in method 3");
		}
	}
	public static void main(String[] args) {
		CheckedExceptionPropagation obj1 = new CheckedExceptionPropagation();
		obj1.method3();
	}

}
