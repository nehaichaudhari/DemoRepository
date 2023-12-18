package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMap3 {
	public static void main(String[] args) {
		HashMap<Student,Course> shm = new HashMap<>();
		Course c1 = new Course(1, "java", 15000);
		Course c2 = new Course(2, "angular", 24000);
		Course c3 = new Course(3, "c", 22000);
		
		shm.put(new Student(103, "madhu", 80.0f), c1);
		shm.put(new Student(101, "harshada", 90.0f),c3);
		shm.put(new Student(102, "gauri", 75.0f),c1);
		shm.put(new Student(104, "shivani", 69.0f), c3);
		shm.put(new Student(104, "shivani", 69.0f),c1);
		shm.put(new Student(105, "radha", 69.0f),c2);
		
		
		for(Entry<Student, Course> e: shm.entrySet()){
			System.out.println("id: "+e.getKey());
			System.out.println("Details: "+e.getValue());
			System.out.println("----------------------");
		}
		
	}

}
