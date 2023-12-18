package com.exception.seventeenoct;

public class UncheckedExceptionPropagation2 {
	void method1() {
		int data = 50/0;
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
		method2();
		}catch (Exception e) {
			System.out.println("in catch block in method 3");
		}
	}
	public static void main(String[] args) {
		UncheckedExceptionPropagation2 obj1 = new UncheckedExceptionPropagation2();
		obj1.method3();
	}
	//if we cannot handle exception then it will propagate in next method

}
