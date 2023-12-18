package com.customeexception;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private float marks;
	
	public Student(){
		super();
	}
	
	public Student(int id, String name, float marks) {
		this.id=id;
		this.name =name;
		this.marks =marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	void calculatePer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of 1st sub: ");
		float marks1 = sc.nextFloat();
		System.out.println("Enter the mark of 2nd sub: ");
		float marks2 = sc.nextFloat();
		System.out.println("Enter the mark of 3rd sub: ");
		float marks3 = sc.nextFloat();
		try {
		if(marks1<0 || marks2<0||marks3<0)
			throw new InvalidMarksException("Marks invalid");
		float per = (marks1+marks2+marks3*100)/3;
		System.out.println(per);
		}catch(InvalidMarksException e) {
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class StudentPercentage {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ram");
		s1.calculatePer();
	}

}
