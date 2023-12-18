package com.arrayobject.example1;

import java.util.Scanner;

public class SchoolGetterSetter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Student s= new Student();
		// s.setId(id);

		Student st[] = new Student[3];

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(); // important statement

			System.out.println("Enter student id:");
			// int id= sc.nextInt()
			// st[0].setSid(id)

			st[i].setSid(sc.nextInt());

			System.out.println("Enter name:");
			st[i].setName(sc.next());

			System.out.println("Enter marks:");
			st[i].setMarks(sc.nextFloat());
		}

		System.out.println("--------------------------------------------------------");

		for (Student s : st) {
			System.out.println(s);
		}
	}
}
