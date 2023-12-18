package com.thiskeyword;

public class Account {

	private int id;
	private String name;
	private int balance;

	Account() {
		this(101, "radha");// 1.constructor chaining
	}

	// difference between argument and instance variable
	Account(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// 2.difference between local variable and instance variable
	Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = 5000;
	}
	
	void display() {
		System.out.println("In display method");
	}
	
	//3.call one method in another method
	void print() {
		System.out.println("In print method");
		this.display();//also right this()
	}

	public String toString() {
		return "\nAccount id is: " + id + "\nname is: " + name + "\nbalance is: " + balance;
	}
	
	//4.return the current object
	Account changeName() {
		name=name+"shraddha";
		return this;
	}
	public static void main(String[] args) {
		Account acc = new Account(102, "seeta", 2000);
		System.out.println(acc);
		
		Account acc1 = new Account();
		System.out.println(acc1);
		acc1.print();
		
		Account acc2 = new Account();
		acc2.changeName();
		System.out.println(acc2);
	}
}
