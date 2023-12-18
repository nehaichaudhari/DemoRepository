package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student(1, "suraj",78.5f));
		student.add(new Student(2, "madhu", 55.56f));
		student.add(new Student(3, "rani", 65.2f));
		student.add(new Student(4, "rani", 65.2f));
		student.add(new Student(7, "harshada", 65.2f));
		student.add(new Student(5, "shivani", 61.5f));
		student.add(new Student(6, "gauri", 89.4f));
		
		for(Student s:student) {
			//System.out.println(s.getName()+" "+s.getMarks());
			System.out.println(s);
		}
		Collections.sort(student);
		System.out.println("--------------------------");
		
		for(Student s:student) {
			//System.out.println(s.getName()+" "+s.getMarks());
			System.out.println(s);
		}
	}

}
