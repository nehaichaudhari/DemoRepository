package com.statickeyword;

public class StaticVariableDemo {
	int x = 10;
	static int y = 20;

	void instanceMethod() {
		System.out.println(x);
		System.out.println("y is in instance method: "+y);
	}

	static void staticMethod() {
		// System.out.println(x);// not allow non static variable-- allow inly static
		// variable
		System.out.println("y is in static method: " + y);
	}

	public static void main(String[] args) {
		StaticVariableDemo s1 = new StaticVariableDemo();
		s1.instanceMethod();
		staticMethod();// new need to give reference
	}
}
