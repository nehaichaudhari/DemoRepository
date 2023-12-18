package com.varags;

public class VarargsWrapper {
	public static void display(Object... s) {
		System.out.println("In int");
		for (Object st : s) {
			System.out.println(st);
		}
	}

	public static void display(Number... s) {
		System.out.println("In number");
		for (Number st : s) {
			System.out.println(st);
		}
	}

	public static void display(Double... s) {
		System.out.println("In double");
		for (Double st : s) {
			System.out.println(st);
		}
	}

	public static void main(String[] args) {

		display(7.8f, 6.7f); // Float : Number: Object

	}

}
