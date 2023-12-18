package com.interface_examples;
interface Showable{
	void display();
}
interface PrintMe{
	void display();
}
class Demo implements Showable, PrintMe{

	@Override
	public void display() {
		System.out.println("welcome");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Demo d =new Demo();
		d.display();
	}
}
