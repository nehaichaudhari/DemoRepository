package com.exception.seventeenoct;

public class UncheckedExceptionPropagation {
	void method1() {
		throw new ArithmeticException();
	}

	void method2() {
		method1();
	}

	void method3() {
		method2();
	}

	public static void main(String[] args) {
		UncheckedExceptionPropagation obj1 = new UncheckedExceptionPropagation();
		obj1.method3();//here we cannot handle exception then JVM handle it automatically
		//unchecked exception can propagate automatically but checked exception cannot propagate
	}
}
