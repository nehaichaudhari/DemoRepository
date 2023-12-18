package com.exceptionhandingsixtyoct;

public class FirstExceptionHandled {
	public static void main(String[] args) {

		int x = 10;
		int y = 10;

		try {
			int ans = (x + y) / (x - y);

			System.out.println(ans);
		}

		catch (ArithmeticException e) {
			System.out.println(e + " Divide by zero exception");
		}

		System.out.println("-----------------------------------");

		int result = (2 * x) + (2 * y);

		System.out.println("Result:" + result);
	}

}
