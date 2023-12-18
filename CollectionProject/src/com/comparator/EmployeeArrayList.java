package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "john", 15000));
		emp.add(new Employee(102, "radha", 22000));
		emp.add(new Employee(103, "gauri", 22000));
		emp.add(new Employee(104, "kunal", 10000));
		emp.add(new Employee(105, "varsha", 35000));
		emp.add(new Employee(106, "reena", 32000));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		Collections.sort(emp, new SalaryNameComparator());;
		System.out.println("----------------------------------");
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------------");
		//2.
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		Collections.sort(emp, new SalaryComparator());;
		System.out.println("----------------------------------");
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------------------");
		//3.
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		//it will reverse the logic
		Collections.sort(emp,Collections.reverseOrder(new SalaryComparator()));
		//Collections.sort(emp, new NameComaprator());
		System.out.println("----------------------------------");
		for(Employee e:emp) {
			System.out.println(e);
		}
	}

}
