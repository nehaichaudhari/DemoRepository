package com.containment;

public class Laptop {
	private int id;
	private String lname;
	private Printer printer;
	
	Laptop(){
		
	}
	
	Laptop(int id, String lname, Printer printer){
		this.id=id;
		this.lname=lname;
		this.printer=printer;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setLname(String lname) {
		this.lname=lname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setPrinter(Printer printer) {
		this.printer=printer;
	}
	
	public Printer getPrinter() {
		return printer;
	}
	
	public String toString() {
		return "\nLaptop id is: "+id+"\nlaptop name is: "+lname+"\nPrinter details: "+printer;
	}

}
