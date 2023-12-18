package com.interface_examples;

interface Electronic {
	// interface cannot have constructor
	/*
	 * Electronic(){
	 * 
	 * }
	 */
	// int price; // it will not allow we need to give value for var

	String shopName = "vijay electronics";

	// not use non abstract method
	/*
	 * void show() {
	 * 
	 * }
	 */
	
	public static int id = 1;
	public static final String name = "mobile";

	abstract void feature();

	abstract void show();
	
	default void addItem() {
		System.out.println("adding one more item");
	}
	
	static void display() {
		System.out.println("in display method");
	}
}

interface Complimantry{
	abstract void headphone();
}

class Mobile implements Electronic,Complimantry { // we can implement multiple interface
	int price;
	String name;
	
	Mobile() {
		
	}
	
	Mobile(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public void feature() {
		System.out.println(Electronic.id);
		System.out.println("shope name is: " + Electronic.shopName);
		System.out.println("mobile has a various features like: bluetooth, camera");
	}

	@Override
	public void show() {
		System.out.println("price is: " + price);
		System.out.println("name of mobile: " + name);
	}

	@Override
	public void headphone() {
			System.out.println("it is a complimentry gift with mobile");
	}

}

class Laptop implements Electronic {
	String processor;
	int price;
	
	Laptop(){
		
	}

	Laptop(String processor, int price) {
		this.processor = processor;
		this.price = price;
	}

	@Override
	public void feature() {
		System.out.println("use for coding, presentations, watching movies");
	}

	@Override
	public void show() {
		System.out.println("processor of laptop: " + processor);
		System.out.println("price of laptop is: " + price);
	}

}

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Electronic e1;
		Electronic.display();
		Complimantry c1;
		e1 = new Mobile(15000, "samsung");
		e1.show();
		e1.addItem();
		Electronic.display();
		c1 = new Mobile();
		c1.headphone();
		e1.feature();
		e1 = new Laptop("i3", 50000);
		e1.show();
		e1.feature();
	}

}
