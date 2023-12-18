package com.polymorphism;

public class TypePromotion {
	/*static void display(int n) {
		System.out.println("In int: ");
		System.out.println(n);
	}*/
	
	static void display(float n) {
		System.out.println("In float: ");
		System.out.println(n);
	}
	
	static void display(long n) {
		System.out.println("In long: ");
		System.out.println(n);
	}
	public static void main(String[] args) {
		display(5);// here int converted to float
	}

}
