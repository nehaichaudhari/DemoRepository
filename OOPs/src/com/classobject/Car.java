package com.classobject;

public class Car {
	
	//instance variable
	int carId;
	String brand;
	float price;
	String cName;
	
	//instance method
	void carDetails() {
		System.out.println(carId + ": " + cName);
		System.out.println(brand);
		System.out.println(price);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carId = 101;
		c1.cName = "Ferrari rom";
		c1.brand = "Ferrari";
		c1.price = 500000.0f;
		c1.carDetails();

		Car c2 = new Car();
		c2.carId = 102;
		c2.cName = "Fortuner";
		c2.brand = "Toyota";
		c2.price = 7500000.0f;
		c2.carDetails();
	}
}
