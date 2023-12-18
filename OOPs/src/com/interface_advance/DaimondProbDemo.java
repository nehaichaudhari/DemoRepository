package com.interface_advance;
interface Mother{
	void display();
}
interface Father{
	void display();	
}
class MotherDemo implements Mother{

	@Override
	public void display() {
		System.out.println("display method in mother demo class");
	}
}
class FatherDemo implements Father{

	@Override
	public void display() {
		System.out.println("display method in father demo class");
	}
}
class Child implements Mother, Father{
	MotherDemo m = new MotherDemo();
	FatherDemo f = new FatherDemo();
	@Override
	public void display() {
		m.display();
		f.display();
	}
}
public class DaimondProbDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
