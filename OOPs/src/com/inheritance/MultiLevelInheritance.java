package com.inheritance;

class Vehicle1 {
	private int id;
	protected int model;
	protected int price;

	Vehicle1() {
		super();
	}

	Vehicle1(int id, int model, int price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId(int id) {
		return id;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getModel(int model) {
		return model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice(int price) {
		return price;
	}

	public String toString() {
		return "\nVehicle details: " + "\nVehicle id is: " + id + "\nmodel is: " + model + "\nprice is: " + price;
	}

}

class Car1 extends Vehicle1 {
	private int noOfGears;
	private String fuelType;

	Car1() {

	}

	Car1(int id, int model, int price, int noOfGears, String fuelType) {
		super(id, model, price);
		this.noOfGears = noOfGears;
		this.fuelType = fuelType;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public int getNoOfGears(int noOfGears) {
		return noOfGears;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType(String fuelType) {
		return fuelType;
	}

	public String toString() {
		return super.toString() +"Car details: "+"\nNo of gears is: " + noOfGears + "\nfuel type is: " + fuelType;
	}
}

class RacingCar extends Car1 {
	private int maxSpeed;
	private int mileage;

	RacingCar() {
		super();
	}

	RacingCar(int id, int model, int price, int noOfGears, String fuelType, int maxSpeed, int mileage) {
		super(id, model, price, noOfGears, fuelType);
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return "racing car details:" + super.toString() + "\nmax speed: " + maxSpeed + "\nmileage is: " + mileage;
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Car1 bmw = new Car1(101, 2020, 800000, 5, "pertrol");
		System.out.println(bmw);

		RacingCar rc1 = new RacingCar(102, 2022, 900000, 5, "diesel", 160, 20);
		System.out.println(rc1);
	}

}
