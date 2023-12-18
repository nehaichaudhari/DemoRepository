package com.enumdemo;

public enum MovieSeats {
	STANDARD(300),PREMIUM(450),RECLINER(600);
	
	int price;// this is default or public
	private MovieSeats(int price) {
		this.price=price;
	}

}
