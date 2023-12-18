package com.polymorphism;
class Shape1 {
	static void area(int side) {
		System.out.println("Area of square is: " + (side * side));
	}

	static void area(int len, int br) {
		System.out.println("Area of rectangle is: " + (len * br));
	}

	static void area(float radius) {
		float pi = 3.14f;
		System.out.println("Area of circle is: " + (pi * radius * radius));
	}
}
public class StaticPolyDemo {
public static void main(String[] args) {
	Shape1.area(7);
	Shape1.area(5, 6);
	Shape1.area(3f);
	
}
}
