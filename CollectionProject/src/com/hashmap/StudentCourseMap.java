package com.hashmap;

import java.util.HashMap;

public class StudentCourseMap {
	public static void main(String[] args) {
		HashMap<Student1, Course1> hm = new HashMap<>();
		Course1 c1 = new Course1(101, "java", 25000);
		Course1 c2 = new Course1(102, ".net", 20000);
		
		hm.put(new Student1(1, "ram", 56.8f, c1), c2);
	}
}
