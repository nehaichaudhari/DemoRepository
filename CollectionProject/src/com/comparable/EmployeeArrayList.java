package com.comparable;

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
		Collections.sort(emp);
		System.out.println("-----------------------");
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		Collections.sort(emp, Collections.reverseOrder());
	}

}
