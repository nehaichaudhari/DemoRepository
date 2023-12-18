package com.polymorphism;

public class Calculator {
	void calci(int square) {
		System.out.println("Square is: " + (square * square));
	}

	void calci(int a, int b) {
		System.out.println("Sum is: " + (a + b));
	}

	void calci(float a, float b) {
		System.out.println("multiplication is: " + (a * b));
	}

	public static void main(String[] args) {
		Calculator square = new Calculator();
		square.calci(5);

		Calculator sum = new Calculator();
		sum.calci(5, 5);

		Calculator multi = new Calculator();
		multi.calci(3.0f, 4.5f);
	}
}
