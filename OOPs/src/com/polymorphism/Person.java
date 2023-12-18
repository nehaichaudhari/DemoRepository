package com.polymorphism;

public class Person {
	void activity(int salary) {
		System.out.println("Person is in office");
		salary = salary * 12;
		System.out.println("Yearly salary is: " + salary);
	}

	void activity(String name, String role) {
		System.out.println("Person name is: " + name);
		System.out.println("person play the " + role + " role at home");
	}

	String activity(String game) {
		return game;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.activity(25000);
		
		Person p2 = new Person();
		p2.activity("john", "father");
		
		Person p3 = new Person();
		String game = p3.activity("Cricket");
		System.out.println("Person playing "+game+" with friends");
	}
}
