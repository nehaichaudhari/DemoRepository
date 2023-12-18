package com.classobject;

import java.util.Scanner;

public class Student {

	int sid;
	String name;
	float marks1;
	float marks2;
	float marks3;
	float per;
	char grade;

	void calPercentage() {
		per = (((marks1 + marks2 + marks3) / 300) * 100);
	}

	void calGrade() {

		if (per >= 90)
			grade = 'A';
		else if (per >= 75)
			grade = 'B';
		else if (per >= 60)
			grade = 'C';
		else if (per >= 40)
			grade = 'D';
		else
			grade = 'F';
	}

	void display() {
		System.out.println("Id: " + sid + " Name: " + name + " Percentage: " + per + "%");
		if (grade == 'F')
			System.out.println("You have fialed:");
		else
			System.out.println("Congratulations: You have passed "+grade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter student id:");
		s1.sid = sc.nextInt();
		System.out.println("Enter student name:");
		s1.name = sc.next();
		System.out.println("Enter student marks1:");
		s1.marks1 = sc.nextFloat();
		System.out.println("Enter student marks2:");
		s1.marks2 = sc.nextFloat();
		System.out.println("Enter student marks3:");
		s1.marks3 = sc.nextFloat();
		
		s1.calPercentage();
		s1.calGrade();
		s1.display();
		
		/*s1.name = "raja";
		s1.marks1 = 70f;
		s1.marks2 = 60f;
		s1.marks3 = 55f;*/
		

		Student s2 = new Student();
		System.out.println("Enter student id:");
		s2.sid = sc.nextInt();
		System.out.println("Enter student name:");
		s2.name = sc.next();
		System.out.println("Enter student marks1:");
		s2.marks1 = sc.nextFloat();
		System.out.println("Enter student marks2:");
		s2.marks2 = sc.nextFloat();
		System.out.println("Enter student marks3:");
		s2.marks3 = sc.nextFloat();
		/*s2.sid = 2;
		s2.name = "seeta";
		s1.marks1 = 70f;*/

		s2.calPercentage();
		s2.calGrade();
		s2.display();
	}
}
