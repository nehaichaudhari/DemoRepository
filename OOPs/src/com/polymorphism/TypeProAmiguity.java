package com.polymorphism;

public class TypeProAmiguity {
	static void add(int n1, double n2) {
		System.out.println("In method 1: ");
		System.out.println(n1+n2);
	}
	
	static void add(long n1, float n2) {
		System.out.println("In method 2: ");
		System.out.println(n1+n2);
	}
	public static void main(String[] args) {
		//add(9,708f); int: asking 7.8f to convert to double
		//float: asking 9 to convert to long
	}

}
