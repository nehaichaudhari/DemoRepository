package com.varags;

public class VarargsOverloading {
	static void display(int... ar) {
		for (int i : ar) {
			System.out.println(i);
		}
	}

	static void display(double... fl) {
		System.out.println("In double method");
		for (double f : fl) {
			System.out.println(f);
		}
	}

	static void display(String... str) {
		for (String s : str) {
			System.out.println(s);
		}
	}

	static void displayMe(int x, char... ch) {
		System.out.println(x);
		for (char c : ch) {
			System.out.println(c);
		}

	}

	static void displayMe(char x, int... ch) {
		System.out.println(x);
		for (int c : ch) {
			System.out.println(c);
		}

	}

	public static void main(String[] args) {

		display(2, 3, 4);
		display("Java", "C", "C++");
		display(4.5f, 87.9f);
		// display(); Ambiguity

		displayMe('a', 8, 9, 5);
		displayMe(8, 's', 'f', 'e');

		// displayMe(65,90,45,97); // ambiguity due to type promotion

	}

}
