package com.abstarctclass;

abstract class Card {
	static String shopName;
	String cardName;
	int price;
	static {
		shopName = "Handcraft";
	}

	Card() {

	}

	Card(String cardName, int price) {
		this.cardName = cardName;
		this.price = price;
	}

	void show() {
		System.out.println("Welcome to shop: " + shopName);
		System.out.println("we have different types od cards: wedding card, birthday card, mothers day card");
		System.out.println("card name is: "+cardName);
		System.out.println("card price is: "+price);
	}

	abstract void showCard();
}

class WeddingCard extends Card {
	float size;

	WeddingCard() {
	}
	
	WeddingCard(String cardName, int price, float size){
		super(cardName, price);
		this.size=size;
	}
	
	void show() {
		super.show();
		System.out.println("card size is: "+size);
	}

	@Override
	void showCard() {
		System.out.println("we have wedding card");
		System.out.println("----------");
	}
}

class BirthdayCard extends Card {
	String size;
	BirthdayCard() {
	}
	
	BirthdayCard(String cardName, int price,String size){
		super(cardName, price);
		this.size=size;
	}
	
	void show() {
		super.show();
		System.out.println("card size is: "+size);
	}

	@Override
	void showCard() {
		System.out.println("birthday card");
	}
}

public class CardMain {
	public static void main(String[] args) {
		Card c1;
		c1 = new WeddingCard("wedding card", 450, 10.5f);
		c1.show();
		c1.showCard();
		c1 = new BirthdayCard("birthday card", 250, "medium");
		c1.show();
		c1.showCard();
	}
}
