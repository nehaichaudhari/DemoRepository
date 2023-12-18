package com.overriding_and_overloading;

class Cake1 {
	String flavour;
	int price;

	Cake1() {

	}

	Cake1(String flavour, int price) {
		this.flavour = flavour;
		this.price = price;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "\ncake flavour is: " + flavour + "\ncake price is: " + price;
	}
}

class MyBakery {
	int bid;
	String name;
	Cake1 c;
	static int count;
	static int amount;

	static {
		count = 0;
		amount = 0;
	}

	MyBakery() {

	}

	public MyBakery(int bid, String name, Cake1 c) {
		this.bid = bid;
		this.name = name;
		this.c = c;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyBakery.count = count;
	}

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int amount) {
		MyBakery.amount = amount;
	}

	public Cake1 getC() {
		return c;
	}

	public void setC(Cake1 c) {
		this.c = c;
		count++;
		amount = amount + c.getPrice();
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\ncake details:" + "\nbakery id: " + bid + "\nname is: " + name;
	}
}

public class BakeryTracker {
	public static void main(String[] args) {
		MyBakery b1 = new MyBakery();

		Cake1 c1 = new Cake1("Pineapple", 350);
		Cake1 c2 = new Cake1("Chocolate", 400);
		Cake1 c3 = new Cake1("Fruit", 250);
		Cake1 c4 = new Cake1("Truffle", 550);

		System.out.println(b1.getBid() + "  " + b1.getName());
		System.out.println("--------------------------------------");
		System.out.println("Number of cakes:" + b1.getCount());
		System.out.println("Amount :" + b1.getAmount());

		b1.setC(c1);
		System.out.println(b1.getC());
		b1.setC(c3);
		System.out.println(b1.getC());
		b1.setC(c2);
		System.out.println(b1.getC());

		System.out.println("---------------------------------------------");

		System.out.println("Number of cakes:" + b1.getCount());
		System.out.println("Amount :" + b1.getAmount());

	}

}
