package com.array.containment;

import java.util.Arrays;

public class StudentContUsingAnnonimus {
	public static void main(String[] args) {
		
		Student stud[] = new Student[4];
		
		stud[0]=new Student(1, "radha", (new Course(101, "java", 34000)));
		stud[1]=new Student(2, "shyam", (new Course(102, ".net", 20000)));
		stud[2]=new Student(3, "ram", (new Course(103, "c++", 15000)));
		
		//hard code getter setter
		stud[3]=new Student();
		stud[3].setSid(4);
		stud[3].setSname("john");
		stud[3].setCourse(new Course(101, "java", 34000));
		
		for(Student s:stud) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(stud));
	}

}
