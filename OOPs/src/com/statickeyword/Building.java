package com.statickeyword;

public class Building {
	private int id;
	private int floor;
	private int noOfMembers;
	private char wing;
	static String bname="royal building";

	Building() {

	}

	Building(int id, int floor, int noOfMembers, char wing) {
		this.id = id;
		this.floor = floor;
		this.noOfMembers = noOfMembers;
		this.wing = wing;
	}

	/*static {
		bname = "royal building pvt ltd";
	}*/

	static void playArea() {
		System.out.println("In play area ");
	}

	static void swimmingPool() {
		System.out.println("Swimming pool ");
	}
	
	public String toString() {
		return "Id is: "+id+"\nfloor is: "+floor+"\nno of members: "
	+noOfMembers+"\nwing is: "+wing+"\nbuilding name is: "+bname;
	}

public static void main(String[] args) {
	Building.playArea();
	Building.swimmingPool();
	//swimmingPool(); also call because it is in same class and method is static
	Building b1 = new Building(101,1,5,'A');
	System.out.println(b1);
}
}
