package com.LinkedHashset;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Employee> emp = new LinkedHashSet<>();
		emp.add(new Employee(1, "john", 15000));
		emp.add(new Employee(2, "ram", 25000));
		emp.add(new Employee(3, "kunal", 30000));
		emp.add(new Employee(1, "john", 15000));
		emp.add(new Employee(4, "pratik", 22000));
		
		for(Employee e : emp) {
			System.out.println(e);
		}
	}

}
