package com.abstarctclass;

abstract class Bike {
	private int id;
	private String model;
	private float cost;
	static String brandName;
	static float discount;

	static {
		brandName = "Honda";
	}

	Bike() {

	}

	public Bike(int id, String model, float cost) {
		super();
		this.id = id;
		this.model = model;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}

	abstract void description();// abstract method

	static float giveDiscount(int dis) {
		discount = dis;
		return discount;
	}

	final void display() {
		System.out.println("Brand name:" + brandName);
		System.out.println("Discount on all bikes:" + discount + "%");
		System.out.println("-------------------");

		System.out.println("Id:" + id);
		System.out.println("Model:" + model);
		System.out.println("Cost:" + cost);
		System.out.println("Discounted cost:" + (cost - ((discount / 100) * cost)));
	}

}

class SportsBike extends Bike {
	private int gears;
	private float speed;

	SportsBike() {

	}

	public SportsBike(int id, String model, float cost, int gears, float speed) {
		super(id, model, cost);
		this.gears = gears;
		this.speed = speed;
	}

	@Override
	void description() {

		System.out.println("This is a sports bike -----");
		System.out.println("Number of gears:" + gears);
		System.out.println("Max speed:" + speed);

	}

}

class BasicBike extends Bike {
	private float avg;

	BasicBike() {

	}

	public BasicBike(int id, String model, float cost, float avg) {
		super(id, model, cost);
		this.avg = avg;
	}

	@Override
	void description() {

		System.out.println("This is a normal bike -----");
		System.out.println("Number of gears:4");
		System.out.println("Average is:" + avg);

	}

}

public class AbstractDemo {

	public static void main(String[] args) {

		// Bike b = new Bike(101,"Honda1",67000);

		Bike.giveDiscount(50);

		SportsBike b1 = new SportsBike(101, "CVR10", 78000, 6, 250);
		b1.display();
		b1.description();

		System.out.println("============================================================");

		BasicBike b2 = new BasicBike(102, "Shine", 45000, 50f);
		b2.display();
		b2.description();

	}

}