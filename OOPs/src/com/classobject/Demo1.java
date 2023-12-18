package com.classobject;

import com.accessmodifier.A;

class D{
	A a1 = new A();
	void display() {
		//System.out.println("in class D value of i is: "+a1.i);
		//System.out.println("in class D value of j is: "+a1.j);
		//System.out.println("in class D value of k is: "+a1.k);
		System.out.println("in class D value of m is: "+a1.m);
	}
}
class E extends A{
	void display() {
		//System.out.println("in class E value of i is: "+i);
		//System.out.println("in class E value of j is: "+j);
		System.out.println("in class E value of k is: "+k);
		System.out.println("in class E value of m is: "+m);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.display();
		
		D d1 = new D();
		d1.display();
		
	}
}
