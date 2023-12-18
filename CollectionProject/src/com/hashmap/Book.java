package com.hashmap;

public class Book {
	private int bid;
	private String name;
	private int price;
	private Author athr;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String name, int price, Author athr) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
		this.athr = athr;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAthr() {
		return athr;
	}

	public void setAthr(Author athr) {
		this.athr = athr;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", name=" + name + ", price=" + price + ", athr=" + athr + "]";
	}

}
