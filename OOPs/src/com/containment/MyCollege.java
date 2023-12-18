package com.containment;

public class MyCollege {
	public static void main(String[] args) {
		Course c1 = new Course(101,".net",23000f);
		Course c2 = new Course(102,"java",36000f);
		Course c3 = new Course(103,"php",20000f);
		
		Student s1 = new Student(1,"madhu",c1);
		Student s2 = new Student(2,"gauri",c2);
		Student s3 = new Student(3,"harshada",c3);
		Student s4 = new Student(4,"priya",c2);
		Student s5 = new Student(5,"shradha",c1);
		Student s6 = new Student(6,"radha",c1);
		
		System.out.println(s1);
		System.out.println("-----------");
		System.out.println(s2);
		System.out.println("-----------");
		System.out.println(s3);
		System.out.println("-----------");
		System.out.println(s4);
		System.out.println("-----------");
		System.out.println(s5);
		System.out.println("-----------");
		System.out.println(s6);	
		
	}

}
