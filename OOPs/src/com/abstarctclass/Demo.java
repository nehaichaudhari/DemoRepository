package com.abstarctclass;
abstract class Animal{
	String name;
	Animal(String name){
		this.name= name;
	}
	abstract void discription();
	void name() {
		System.out.println("name of animal is: "+name);
	}
}
class Cat extends Animal{

	Cat(String name) {
		super(name);
	}

	@Override
	void discription() {
		System.out.println("cat is a pet animal");
	}
	
}
class Dog extends Animal{

	Dog(String name) {
		super(name);
	}

	@Override
	void discription() {
		System.out.println("dog is a domestic animal");
	}
}
public class Demo {
	public static void main(String[] args) {
		Animal a1 = new Cat("simba");
		a1.discription();
		a1.name();
		
		a1=new Dog("sheru");
		a1.discription();
		a1.name();
	}

}
