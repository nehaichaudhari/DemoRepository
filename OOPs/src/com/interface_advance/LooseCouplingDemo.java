package com.interface_advance;
interface Mobile2{
	void display();
}
class Samsung2 implements Mobile2{
	int price;
	//we can add constructor in class it is compulsory to add this in another class because it is loosely coupled
	Samsung2(int price){
		this.price=price;
	}
	
	public void display() {
		System.out.println("in display method");
		System.out.println("price is: "+price);
	}
}
class Vivo2 implements Mobile2{
	// constructor not added it is not compulsory because it is loosely coupled
	@Override
	public void display() {
		System.out.println("display method in vivo class");
	}
	
}
public class LooseCouplingDemo {
	public static void main(String[] args) {
		Mobile2 m1 = new Samsung2(15000);
		m1.display();
		m1 = new Vivo2();
		m1.display();
	}

}
