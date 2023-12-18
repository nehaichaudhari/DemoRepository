package com.exception.seventeenoct;

public class RethrowException {
	static void method1() {
		try {
			String s =null;
			System.out.println(s.length());
		}catch (NullPointerException ex) {
			System.out.println("in cathch block of method1");
			throw ex;//we can rethrow exception in main
		}
	}
	public static void main(String[] args) {
		try {
			method1();
		}catch (NullPointerException e) {
			System.out.println("in main: "+e);// here we can catch the exception
		}
	}

}
