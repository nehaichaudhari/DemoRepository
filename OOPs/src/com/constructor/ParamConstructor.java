package com.constructor;

class Student{
	private int id;
	private String name;
	private int age;
	
	//default constructor
	Student(){
		
	}
	
	//parameterized constructor
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	//getter setter
	public String toString() {
		return id+" "+name+" "+age;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
}
public class ParamConstructor {
public static void main(String[] args) {
	
	//early initilization
	Student s1 = new Student(101,"radha",20);
	Student s2 = new Student(102,"john",25);
	Student s3 = new Student(103,"geeta",30);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	//lazy initialization
	Student s4 = new Student();
	s4.setId(104);
	s4.setName("seeta");
	s4.setAge(28);
	System.out.println(s4);
}
}
