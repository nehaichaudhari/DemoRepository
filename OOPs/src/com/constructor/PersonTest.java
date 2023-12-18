package com.constructor;

class Person {
	private int id;
	private String name;
	private int age;
	
	public Person() {
		id=100;
		name = "radha";
		age = 18;
	}
	
	public String toString() {
		return id+" "+name+" "+age;
	}
}
public class PersonTest{
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
	}
}
