package com.statickeyword;

class Empolyee {
	private int id;
	private String name;
	private int salary;
	static String cname;
	static int count;
	
	//static block
	static
	{
		cname="HCL";
	}
	
	static void changeCompanyName(String companyName) {
		cname=companyName;
	}
	
	//instance block
	{
		count++;
	}
	
	Empolyee(){
		
	}
	
	Empolyee(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	//setter getter
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
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return "id is: "+id+"\nname is: "+name+"\nsalary is: "+salary+"\ncompany name is: "+cname;
	}
}
public class Company{
public static void main(String[] args) {
	System.out.println("Company name is: "+Empolyee.cname);
	System.out.println("Number of employee is: "+Empolyee.count);
	
	Empolyee e1 = new Empolyee(101,"radha",25000);
	Empolyee e2 = new Empolyee(102,"seeta",15000);
	Empolyee e3 = new Empolyee(103,"geeta",30000);
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	
	System.out.println("After number of employee is: "+Empolyee.count);
	Empolyee.changeCompanyName("TCS");
	System.out.println(e3);
	
	
}	
}