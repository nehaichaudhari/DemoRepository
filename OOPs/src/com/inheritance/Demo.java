package com.inheritance;

public class Demo {
	public static void main(String[] args) {
		Emp e = new Emp();
		System.out.println(e);
	}

}
class Emp{
	int id;
	String name;
	
	Emp(){
		System.out.println("hello");
	}
}