package com.CRUDOperations;

public class Book {
	private int id;
	private String bname;
	private int price;
	private String authorName;
	
	public Book(int id, String bname, int price, String authorName) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.authorName = authorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", authorName=" + authorName + "]";
	}
}
