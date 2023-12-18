package com.polymorphism;

class Shape {
	void area(int side) {
		System.out.println("Area of square is: " + (side * side));
	}

	void area(int len, int br) {
		System.out.println("Area of rectangle is: " + (len * br));
	}

	void area(float radius) {
		float pi = 3.14f;
		System.out.println("Area of circle is: " + (pi * radius * radius));
	}
}

public class PolyDemo {
	public static void main(String[] args) {
		Shape square = new Shape();
		square.area(7);

		Shape rectangle = new Shape();
		rectangle.area(5, 4);

		Shape circle = new Shape();
		circle.area(3.0f);
	}
}
