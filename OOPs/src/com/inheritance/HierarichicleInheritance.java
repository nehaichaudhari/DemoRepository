package com.inheritance;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private int fees;

	Student() {

	}

	Student(int id, String name, int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
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

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String toString() {
		return "\nId is: " + id + "\nname is: " + name + "\nfees: " + fees;
	}
}

class SchoolStudent extends Student {
	private String schoolName;
	private int std;

	public SchoolStudent() {
		super();
	}

	public SchoolStudent(int id, String name, int fees, String schoolName, int std) {
		super(id, name, fees);
		this.schoolName = schoolName;
		this.std = std;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String toString() {
		return "\nSchool details:" + super.toString() + ", school name: " + schoolName + ", std:" + std;
	}
}

class CollegeStudent extends Student {
	private String univerCity;
	private String course;
	private int sem;

	CollegeStudent() {
		super();
	}

	CollegeStudent(int id, String name, int fees, String univerCity, String course, int sem) {
		super(id, name, fees);
		this.univerCity = univerCity;
		this.course = course;
		this.sem = sem;
	}

	public String getUniverCity() {
		return univerCity;
	}

	public void setUniverCity(String univerCity) {
		this.univerCity = univerCity;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String toString() {
		return "\nCollege Details:" + super.toString() + univerCity + ",course: " + course + ",semister:" + sem;
	}
}

public class HierarichicleInheritance {
	public static void enterSchoolDetails() {
		Scanner sc = new Scanner(System.in);
		SchoolStudent s =new SchoolStudent();
		System.out.println("Enter the id: ");
		s.setId(sc.nextInt());
		System.out.println("Enter the name: ");
		s.setName(sc.next());
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		/*SchoolStudent s1 =new SchoolStudent(1, "nikita", 25000, "bishop's", 10);
		System.out.println(s1);
		
		CollegeStudent c1 = new CollegeStudent(101, "gauri", 300000, "pune", "science",2);
		System.out.println(c1);*/
		
		enterSchoolDetails();
	}

}
