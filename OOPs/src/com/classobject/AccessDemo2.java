package com.classobject;

import com.accessmodifier.AccessDemo;

public class AccessDemo2 {
	public static void main(String[] args) {
		AccessDemo demo = new AccessDemo();
		//demo.a=10;
		//demo.b=20; default is not accessible in another package, it is only accessible within a same package only
		demo.c=30;// public is accessible in every package and class
		
		//demo.m1();
		//demo.m2();
		demo.m3();
	}

}
