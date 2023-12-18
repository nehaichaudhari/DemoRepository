package com.overriding_and_overloading;
class Person1{
	void display() {
		System.out.println("in person class");
	}
}
class Employee1 extends Person1{
	protected void display() {
		super.display();
		System.out.println("in employee class");
	}
}
public class PersonInfo {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.display();
	}

}
