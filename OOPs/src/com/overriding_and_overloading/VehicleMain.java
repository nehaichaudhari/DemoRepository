package com.overriding_and_overloading;

class Vehicle {

	void display(String name) {
		System.out.println("in vehicle class "+name);
	}
}

class Car extends Vehicle {

	protected void display(String name) {
		super.display("Car");
		System.out.println("in car class "+name);
	}
	
	void print() {
		System.out.println("print vehicle is a parent class");
	}
}

class Truck extends Vehicle {

	public void display(String name) {
		System.out.println("in truck class "+name);
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle v1;
		v1 = new Vehicle();
		v1.display("truck");
		//v1.print();

		v1 = new Car();
		v1.display("thar");
		//v1.print(); 

		v1 = new Truck();
		v1.display("abc");
		//v1.print();
	}
}
