package com.overriding_and_overloading;

class Fish {
	public String name;
	public int noOfGill;
	public String breed;

	Fish() {
		System.out.println("In fish constructor");
	}

	Fish(String name, int noOfGill, String breed) {
		this.name = name;
		this.noOfGill = noOfGill;
		this.breed = breed;
	}

	public String toString() {
		return "\nname is: " + name + "\nno of gill is: " + noOfGill + "\nbreed: " + breed;
	}
}

class GoldFish extends Fish {
	String gname;
	String type;

	/*
	 * GoldFish() {
	 * 
	 * }
	 */

	GoldFish(String name, int noOfGill, String breed, String gname, String type) {
		super(name, noOfGill, breed);
		this.gname = gname;
		this.type = type;
	}

	public String toString() {
		return super.toString() + "\ngold fish name: " + gname + "\ngold fish type: " + type;
	}
}

class Whale extends Fish {
	int whaleSize;

	Whale(String name, int noOfGill, String breed, int whaleSize) {
		super(name, noOfGill, breed);
		this.whaleSize = whaleSize;
	}
}

public class FishInfo {
	public static void main(String[] args) {
		GoldFish g1 = new GoldFish("gold fish", 2, "guppy", "goldilocks", "water");
		System.out.println(g1);
		Whale w1 = new Whale("Whale shark", 4, "shark", 16);
		System.out.println(w1);
	}

}