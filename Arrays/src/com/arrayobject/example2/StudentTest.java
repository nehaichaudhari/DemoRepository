package com.arrayobject.example2;

public class StudentTest {
	static float calcPercentage(Student s) {
		float m[] = s.getMarks();
		float total = 0;
		for (float m1 : m) {
			total += m1;
		}

		float per = (total / 500) * 100;
		return per;
	}

	public static void main(String[] args) {

		Student st[] = new Student[3];

		float m1[] = { 67.4f, 89.5f, 90.6f };
		st[0] = new Student(101, "Vaibhav", m1);

		float m2[] = { 78.4f, 80.5f, 99.6f };
		st[1] = new Student(102, "Sneha", m2);

		float m3[] = { 77.4f, 85.5f, 93.6f };
		st[2] = new Student();
		st[2].setId(103);
		st[2].setName("Pratik");
		st[2].setMarks(m3);

		System.out.println("------------------------------");
		for (Student s : st) {
			System.out.println(s.getId() + " " + s.getName() + " " + calcPercentage(s));
		}
	}
}
