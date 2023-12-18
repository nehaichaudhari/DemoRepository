package com.accessmodifier;

public class A {
	private int i = 10;
	int j = 20;
	protected int k = 30;
	public int m = 40;

	void display() {
		System.out.println("value of i is: " + i);
		System.out.println("value of j is: " + j);
		System.out.println("value of k is: " + k);
		System.out.println("value of m is: " + m);
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.display();
		
		B b1 = new B();
		b1.display();
		
		C c1 = new C();
		c1.display();
	}
}

class B {
	A a1 = new A();
	void display() {
		//System.out.println("in class B value of i is: " + a1.i);
		System.out.println("in class B value of j is: " + a1.j);
		System.out.println("in class B value of k is: " + a1.k);
		System.out.println("in class B value of m is: " + a1.m);
	}
}

class C extends A {
	void display() {
		//System.out.println("in class B value of i is: " + i);
		System.out.println("in class B value of j is: " + j);
		System.out.println("in class B value of l is: " + k);
		System.out.println("in class B value of m is: " + m);
	}

}
