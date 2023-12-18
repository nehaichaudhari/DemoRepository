package com.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentHashMap {
	public static void sortByMarks(HashMap<Student,String> hm) {
		TreeMap<Student, String> tm = new TreeMap<>(new MarksComparator());
		tm.putAll(hm);
		for(Map.Entry<Student, String> e : tm.entrySet()) {
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
	}
	public static void main(String[] args) {
		HashMap<Student,String> shm = new HashMap<>();
		shm.put(new Student(103, "madhu", 80.0f),"java");
		shm.put(new Student(101, "harshada", 90.0f),"python");
		shm.put(new Student(102, "gauri", 75.0f),"java");
		shm.put(new Student(104, "shivani", 69.0f),".net");
		shm.put(new Student(104, "shivani", 69.0f),"c");
		shm.put(new Student(105, "radha", 69.0f),"c++");
		
		
		for(Map.Entry<Student, String> e: shm.entrySet()){
			System.out.println("id: "+e.getKey());
			System.out.println("Details: "+e.getValue());
			System.out.println("----------------------");
		}
		System.out.println("/////////////////////////////");
		sortByMarks(shm);
	}

}
