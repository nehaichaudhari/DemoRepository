package com.containment;

import com.encapsulation.Bank;

public class Book {
	private int bid;
	private String bname;
	private int price;
	private Author author;
	
	Book(){
		
	}
	
	Book(int bid,String bname, int price, Author author){
		this.bid=bid;
		this.bname=bname;
		this.price=price;
		this.author=author;
	}
	
	//getter setter
	public void setBid(int bid) {
		this.bid=bid;
	}
	
	public int getBid() {
		return bid;
	}
	
	public void setBname(String bname) {
		this.bname=bname;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setAuthor(Author author) {
		this.author=author;
	}
	
	public Author getAuthor() {
		return author;
	}
	//toString
	public String toString() {
		return "\nBook id is: "+bid+"\nbook name is: "+bname+"\nbook ptice is: "+price+"\nAuthor details: "+author;
	}

}
