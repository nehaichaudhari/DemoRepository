package com.polymorphism;
class Shape2{
	int area(int side) {
		return (side * side);
	}

	int area(int len, int br) {
		return (len * br);
	}
	
	//no effect if we change the return type if the method is overload
	float area(float radius) {
		float pi = 3.14f;
		return (pi * radius * radius);
	}
	
	//we cannot overload a method only by changing return type
	//float area(int len,int br){
	//return (len*br);
	//}
	
}
public class ReturnPoly {
public static void main(String[] args) {
	Shape2 square = new Shape2();
	System.out.println("Area of square is: "+square.area(7));
	//square.area(7); also right this
	
	Shape2 rectangle = new Shape2();
	int rect = rectangle.area(6, 7);
	System.out.println("Area of rectangle is: "+rect);
	
	Shape2 circle = new Shape2();
	System.out.println("Area of circle is: "+circle.area(3f));
	
}
}
