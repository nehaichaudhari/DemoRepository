package com.accessmodifier;

public class AccessDemo1 {
	
	public static void main(String[] args) {
		AccessDemo demo1 = new AccessDemo();
		//demo1.a = 21; private access specifier is accessible within same class only, not outside class
		demo1.b = 30;
		demo1.c = 24;
		
		//demo1.m1();
		demo1.m2();
		demo1.m3();
	}

}
