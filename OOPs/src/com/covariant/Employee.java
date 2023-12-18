package com.covariant;

public class Employee {
	int id;
	String name;
	int salary;
	Employee() {
		
	}
	Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	static Employee display(){
		Employee e = new Employee(101,"radha",25000);
		return e;
	}
	
	public String toString() {
		return "\nid is: "+id+"\nname is: "+name+"\nsalary: "+salary;
	}
	public static void main(String[] args) {
		System.out.println(Employee.display());
		Person1 p = new Person1();
		System.out.println(p.display());
		
	}
}
class Person1{
	static Employee display(){
		Employee e = new Employee(102,"seeta",20000);
		return e;
	}
}