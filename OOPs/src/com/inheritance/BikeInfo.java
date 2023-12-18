package com.inheritance;

class Bike {
	private String colour;
	private int speed;
	
	Bike(){
		
	}

	Bike(String colour, int speed) {
		this.colour = colour;
		this.speed = speed;
	}

	void bikeInfo() {
		System.out.println("in bike info method" + "\ncolour is: " + colour + "\nbike speed is: " + speed);
	}
}

class Jupiter extends Bike {
	String type;

	public Jupiter(String colour, int speed, String type) {
		super(colour, speed);
		this.type = type;
	}

	void bike() {
		super.bikeInfo();
		System.out.println("type is: " + type);
	}
}
public class BikeInfo{
	public static void main(String[] args) {
		Jupiter j1 = new Jupiter("red", 120, "petrol");
		j1.bikeInfo();
	}
}
