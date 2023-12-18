package com.encapsulation;

public class Book {
	
	//instance variable
	private int bookId;
	private String bname;
	private float price;
	
	//getter and setter
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String toString() {
		return "Book id: "+bookId+" Book name:"+bname + " price:" + price;
	}

}
