package com.arrayobject.example1;

public class School {
	static void findTopper(Student stud[]) {
		float maxMarks = Float.MIN_VALUE;
		Student st = new Student();

		for (Student s : stud) {
			if (s.getMarks() > maxMarks) {
				maxMarks = s.getMarks();
				st = s;
			}
		}
		System.out.println(st);
	}

	static void sortMarks(Student stud[]) {
		Student st = new Student(); // temp student

		for (int i = 0; i < stud.length; i++) {
			for (int j = i + 1; j < stud.length; j++) {
				if (stud[i].getMarks() < stud[j].getMarks()) {
					st = stud[i];
					stud[i] = stud[j];
					stud[j] = st;
				}
			}
		}

	}

	public static void main(String[] args) {

//		Student s= new Student();
//		System.out.println(s);

		Student st[] = new Student[5];

		// System.out.println(st[0]); return null object is not created yet

		// creating using constructor

		st[0] = new Student(1, "Ramesh", 78.5f);
		st[1] = new Student(2, "Aryan", 89.5f);
		st[2] = new Student(3, "Mira", 99.4f);
		st[3] = new Student(4, "Priya", 67.5f);
		st[4] = new Student(5, "Niya", 94.5f);
		// st[5]= new Student(6,"hjk",99.5f); ArrayIndexOutOfBound Exception

		for (Student s : st) {
			System.out.println(s);
		}

		System.out.println("------------------------------------");

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}

		System.out.println("-----------------------------------------------");
		System.out.println("Topper of the school is:");

		findTopper(st);

		System.out.println("------------------------------------");
		sortMarks(st);

		for (Student s : st) {
			System.out.println(s);
		}
	}
}
