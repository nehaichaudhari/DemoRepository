package com.interface_advance;
interface Calculations{
	float pi = 3.14f;
	void area();
	
	//to make interface mutable and provide backward comptability
	default void volume() {
		display();
		System.out.println("in volume method");
	}
	
	//to provide common implementation
	//belongs to interface
	static void info() {
		System.out.println("Geometry shapes");
	}
	//confidential which cannot be accessed directly
	//any sensitive code of agreement
	//java 9: private 
	//If this private method is instance then it will can give in default method
	//if this private method is static then it will can give in static method
	private void show() {
		System.out.println("made by : harshada");
	}
	private static void display() {
		System.out.println("PAN No : ATK65I");
	}
}
class Square implements Calculations{
	int side;
	
	Square(){
		
	}
	Square(int side){
		super();
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("area of square is: "+(side*side));
	}
}
class Cube implements Calculations{
	int side;
	Cube(){
		
	}
	Cube(int side){
		super();
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("area of cube is: "+(6*side*side));
	}
	
	public void volume() {
		System.out.println("volume is: "+(side*side*side));
	}
}
public class DefaultMethodDemo {
	public static void main(String[] args) {
		Calculations c;
		c=new Square(6);
		c.area();
		c.volume();
		
		c=new Cube(5);
		c.area();
		c.volume();
		Calculations.info();
	}
}
