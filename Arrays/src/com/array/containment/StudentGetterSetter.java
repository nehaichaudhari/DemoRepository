package com.array.containment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGetterSetter {
	static Scanner sc = new Scanner(System.in);
	static void enterDetails(Student s) {
		System.out.println("enter student id: ");
		s.setSid(sc.nextInt());
		
		System.out.println("enter name: ");
		s.setSname(sc.next());
		
		/*Course c= new Course();
		System.out.println("enter course id: ");
		c.setCid(sc.nextInt());
		System.out.println("course name: ");
		c.setName(sc.next());
		System.out.println("course fees: ");
		c.setFees(sc.nextDouble());
		
		s.setCourse(c);*/
		
		//2nd way
		s.setCourse(new Course());
		System.out.println("enter course id: ");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("course name: ");
		s.getCourse().setName(sc.next());
		
		System.out.println("course fees: ");
		s.getCourse().setFees(sc.nextDouble());
		
	}
	static void printDetails(Student[] st) {
		for(Student s:st) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Student stud[]= new Student[3];
		for(int i=0;i<stud.length;i++) {
			stud[i]=new Student();
			enterDetails(stud[i]);
		}
		printDetails(stud);
	}

}
