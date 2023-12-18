package com.accessmodifier;

public class AccessDemo {
	
	//instance variables
	private int a;
	int b;
	public int c;
	
	//instance methods
	private void m1() {
		System.out.println("In m1 method:");
	}
	void m2() {
		System.out.println("In m2 method:");
	}
	public void m3() {
		System.out.println("In m3 method:");
	}
	
	public static void main(String[] args) {
		AccessDemo demo = new AccessDemo();
		demo.a=10;
		demo.b=15;
		demo.c=22;
		
		demo.m1();
		demo.m2();
		demo.m3();
	}

}
