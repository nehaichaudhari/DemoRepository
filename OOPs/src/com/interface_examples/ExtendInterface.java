package com.interface_examples;
interface Movable{
	void move();
}
interface Printable extends Movable{
	void printMe(String name);
}
class Car implements Printable{

	@Override
	public void move() {
		System.out.println("car is moving with the speed of : 100 km/h");
	}

	@Override
	public void printMe(String name) {
		System.out.println("My car name is: "+name);	
	}
}
public class ExtendInterface {
	public static void main(String[] args) {
		Movable m;
		m=new Car();
		m.move();
		//m.printMe("audi");// not possible
		
		Printable p;
		p= new Car();
		p.move();
		p.printMe("BMW");
	}

}
