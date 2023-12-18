package com.constructor;

public class Test {
	int a;
	int b;
	String name;

	Test() {
		System.out.println("default cons");
		this.a=10;
		this.b=20;
		this.name="unknown";
		System.out.println("Task has to be done everytime:");

	}

	Test(int a, int b) {
		this();
		System.out.println("param const ");
		this.a = a;
		this.b = b;
	}

	Test(int a, int b, String name) {
		this();
		System.out.println("param const 1");
		this.a = a;
		this.b = b;
		this.name = name;
	}

	public String toString() {
		return "a:" + a + "\nb: " + b + "\nname: " + name;
	}

	public static void main(String[] args) {
		System.out.println("-----");
		Test t1 = new Test();
		System.out.println(t1);

		System.out.println("-----");
		Test t2 = new Test(30, 40);
		System.out.println(t2);

		System.out.println("-----");
		Test t3 = new Test(100, 200, "radha");
		System.out.println(t3);
	}
}
