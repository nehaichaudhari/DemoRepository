package com.constructor;

public class Demo {
	int a;
	int b;
	String name;

	Demo() {
		this(10, 20);// Always has to first statment
		System.out.println("Default constructor: ");
	}

	Demo(int a, int b) {
		System.out.println("Param constructor 1 ");
		this.a = a;
		this.b = b;
		this.name = "unknown";
	}

	Demo(int a, int b, String name) {
		System.out.println("param constructor 2");
		this.a = a;
		this.b = b;
		this.name = name;
	}

	public String toString() {
		return " a " +a+"\n b "+b+ "\nname " +name;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
		System.out.println("-------");

		Demo d1 = new Demo(30, 40);
		System.out.println(d1);
		System.out.println("-------");

		Demo d2 = new Demo(100, 200, "radha");
		System.out.println(d2);

	}
}
