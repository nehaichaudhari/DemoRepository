package com.constructor;

public class Testify {
	String name;
	
	Testify() {
		
	}
	
	Testify(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Hi "+name);
		this.show();//also return show();
	}
	
	void show() {
		System.out.println("Welcome to thinkquotient: "+name);
	}
	
	Testify changeName() {
		name = name+"ThinkQ";
		return this;
	}
	public static void main(String[] args) {
		Testify t1 = new Testify("Shuruti");
		t1.display();
		
		Testify dummy = new Testify();
		dummy= t1.changeName();
		
		System.out.println(dummy.name);
	}

}
