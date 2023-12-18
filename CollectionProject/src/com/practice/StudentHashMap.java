package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentHashMap {
	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "madhu", "java"), 78);
		map.put(new Student(2, "harshada", ".net"), 65);
		map.put(new Student(3, "gauri", "java"), 49);
		map.put(new Student(4, "shivani", "python"), 56);
		map.put(new Student(5, "rani", "angular"), 47);

		ArrayList<Student> pass = new ArrayList<>();

		ArrayList<Student> fail = new ArrayList<>();

		for (Map.Entry<Student, Integer> keys : map.entrySet()) {
			if (keys.getValue() > 50) {
				pass.add(keys.getKey());
			} else {
				fail.add(keys.getKey());
			}
		}
		for(Student s: pass) {
		System.out.println(s);
		}
		
		System.out.println("--------------------");  
		for(Student s1:fail) {
			System.out.println(s1);			
		}
		
		HashMap<String, Integer> map1 = new HashMap<>();
		
		Iterator<Student> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int count;
			Student student = itr.next();
			if(map1.containsKey(student.getCourse())) {
				count = map1.get(student.getCourse());
				count++;
			}else {
				count=1;
			}
			map1.put(student.getCourse(), count);
		}	
		System.out.println();
	}

}
