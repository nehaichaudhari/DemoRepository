package com.exception.seventeenoct;

public class RethrowException3 {
	static void method1() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ex) {
			System.out.println("in cathch block of method1");
			throw ex;
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (NullPointerException e) {
			System.out.println("in cathch block in main");
			throw e;// when here rethrown excption then it will handle by jvm
		}
	}

}
