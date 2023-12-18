package com.containment;

public class Printer {
	private int id;
	private String name;
	private int price;
	
	Printer(){
		
	}
	
	Printer(int id, String name, int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public String toString() {
		return "\nPrinter id is: "+id+"\nprinter name is: "+name+"\nprinter price is: "+price;
	}

}
