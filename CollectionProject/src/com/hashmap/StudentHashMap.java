package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
	public static void main(String[] args) {
		HashMap<Integer , Student> shm = new HashMap<>();
		shm.put(103, new Student(103, "madhu", 80.0f));
		shm.put(101, new Student(101, "harshada", 90.0f));
		shm.put(102, new Student(102, "gauri", 75.0f));
		shm.put(104, new Student(104, "shivani", 69.0f));
		//System.out.println(shm.put(104, new Student(104, "shraddha", 55.3f)));
		shm.put(104, new Student(104, "shivani", 69.0f));
		shm.put(104, new Student(104, "shraddha", 85.0f));//if value is same then it will replace
		shm.put(105, new Student(105, "radha", 69.0f));
		
		System.out.println(shm);
		
		
//		for(Map.Entry<Integer, Student> e: shm.entrySet()){
//			System.out.println("id: "+e.getKey());
//			System.out.println("Details: "+e.getValue());
//			System.out.println("----------------------");
//		}
		
		for(Map.Entry<Integer, Student> e: shm.entrySet()) {
			System.out.println("id: "+e.getKey());
			//Student student = e.getValue();
			//System.out.println("Details: "+s.getName());
			System.out.println("Details: "+e.getValue().getName());
			System.out.println("---------------------------");
		}
	}

}
