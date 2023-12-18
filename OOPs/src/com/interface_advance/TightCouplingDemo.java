package com.interface_advance;
abstract class Car{
	String bname;
	int price;
	
	Car(String bname, int price){
		this.bname=bname;
		this.price=price;
	}
	public String toString() {
		return "brand name: "+bname+"\nprice is: "+price;
	}
}
class Maruti extends Car{

	Maruti(String bname, int price) {
		//if we give parameterized const so need to give it on sub class because it is highly dependent on each other
		super(bname, price);
	}
}
public class TightCouplingDemo {
	public static void main(String[] args) {
		Maruti m1 = new Maruti("Maruti", 700000);
		System.out.println(m1);
	}

}
