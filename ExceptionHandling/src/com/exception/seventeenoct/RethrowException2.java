package com.exception.seventeenoct;

public class RethrowException2 {
	static void method1() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ex) {
			System.out.println("in cathch block of method1");
			// throw ex;
		}
	}

	public static void main(String[] args) {

		method1();
	}

}
