package com.polymorphism;

class Room {
	int len;
	int br;

	Room() {
		System.out.println("Default");
		len = 5;
		br = 5;
	}

	Room(int len, int br) {
		System.out.println("Rectangel");
		this.len = len;
		this.br = br;
	}

	Room(int len) {
		System.out.println("Square");
		this.len = len;
		this.br = len;
	}
	
	void area() {
		System.out.println("Area of room is: "+(len*br));
	}
}

public class RoomConstOverloading {
	public static void main(String[] args) {
		Room r1=new Room();
		r1.area();
		Room r2=new Room(5);
		r2.area();
		Room r3=new Room(5, 4);
		r3.area();

	}
}
