package com.classobject;

import java.util.Scanner;

public class Item {
	// instance variable
	int itemId;
	String itemName;
	float price;

	void display() {
		System.out.println("Item id: "+itemId+" Item name: "+itemName+" Price:"+price);
	}

	public static void main(String[] args) {
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		/*item.itemId = sc.nextInt();
		item.itemName = sc.next();
		item.price = sc.nextFloat();*/
		item.display();
	}
}
