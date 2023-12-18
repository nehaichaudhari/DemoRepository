package com.overriding_and_overloading;
class Parent{
	int x = 10;
	int y = 20;
}

class Child extends Parent{
	int x = 30;
	
	void display() {
		System.out.println("value of x in parent class: "+super.x);
		System.out.println("value of x in child class: "+x);
		System.out.println("value of y is in parent class: "+y);
		System.out.println(x+x);
		System.out.println(x+super.x);
	}
}
public class ParentInfo {
	public static void main(String[] args) {
		Child c1  =new Child();
		c1.display();
	}

}
