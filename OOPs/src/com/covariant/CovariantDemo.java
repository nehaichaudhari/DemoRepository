package com.covariant;
class Person{
	int id;
	String name;
	
	Person(){
		
	}
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	Person showDetails() {
		name = name+": India";
		return this;
	}
	
	public String display() {
			return "\nid is: "+id+"\nname is: "+name;
	}
}
class Employee1 extends Person{
	float salary;
	
	Employee1(){
		
	}
	
	Employee1(int id, String name,float salary){
		super(id, name);
		this.salary=salary;
	}
	
	Employee1 showDetails() {
		name = name+": ThinkQ";
		salary = salary + 1000;
		return this;
	}
	
	public String show() {
		return "\nPerson details: "+"\nid is: "+id+"\nname is: "+name+"\nEmployee salary: "+salary;
	}
}
public class CovariantDemo {
	public static void main(String[] args) {
		Person p1;
		Employee1 e;
		p1=new Person(101, "shyam");
		System.out.println(p1.showDetails());
		System.out.println(p1.display());
		
		
		Employee1 e1 =new Employee1(102, "john", 15000);
		p1.showDetails();
		System.out.println(p1.display());
		//System.out.println(p1.show);
		
		Employee1 e2 = new Employee1(103, "rani", 20000);
		e = (Employee1) e1.showDetails();//if in sub class showDetail method return is Person then we need to cast it into employee
		System.out.println(e.show());
					
		
		Employee1 e3= new Employee1(1002, "Pratik", 55000f);
		e=  e.showDetails(); // no type casting required now
		System.out.println(e.show());
		
		
	}

}
