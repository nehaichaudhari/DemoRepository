package com.overriding_and_overloading;

class Fruit {
	String name;
	boolean seasonal;
	int seeds;
	String taste;

	public Fruit(String name, boolean seasonal, int seeds, String taste) {
		this.name = name;
		this.seasonal = seasonal;
		this.seeds = seeds;
		this.taste = taste;
	}

	void display() {
		System.out.println("\nfruit name is: " + name + "\nseasonal yes or no: " + seasonal + "\nseeds: " + seeds
				+ "\ntaste is: " + taste);
	}
}

class Mango extends Fruit {
	String desc;

	Mango(String name, boolean seasonal, int seeds, String taste, String desc) {
		super(name, seasonal, seeds, taste);
		this.desc = desc;
	}

	void display() {
		super.display();
		System.out.println(desc);
	}

}

class Orange extends Fruit {
	String desc;

	Orange(String name, boolean seasonal, int seeds, String taste, String desc) {
		super(name, seasonal, seeds, taste);
		this.desc = desc;
	}

	void display() {
		super.display();
		System.out.println(desc);
	}

}

public class FruitInfo {
	public static void main(String[] args) {
		Mango m1 = new Mango("Mango", true, 1, "sweet", "Mango is the king of fruits ");
		m1.display();
		Orange o1 = new Orange("Orange", true, 10, "sour", "Orange is a citrus fruit ");
		o1.display();
	}

}
