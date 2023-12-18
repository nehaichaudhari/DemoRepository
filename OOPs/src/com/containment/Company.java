package com.containment;

public class Company {
	public static void main(String[] args) {
		Department d1 = new Department(1,"IT");
		Department d2 = new Department(2,"Account");
		Department d3 = new Department(3,"HR");	
		
		Employee e1 = new Employee(101,"radha",d1);
		Employee e2 = new Employee(102,"seeta",d2);
		Employee e3 = new Employee(103,"raju",d1);
		Employee e4 = new Employee(104,"john",d3);
		Employee e5 = new Employee(105,"nikita",d3);
		Employee e6 = new Employee(106,"rama",d2);
		
		System.out.println(e1);
		System.out.println("---------");
		System.out.println(e2);
		System.out.println("---------");
		System.out.println(e3);
		System.out.println("---------");
		System.out.println(e4);
		System.out.println("---------");
		System.out.println(e5);
		System.out.println("---------");
		System.out.println(e6);
	}

}
