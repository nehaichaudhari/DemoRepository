package com.arrayobject.example2;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
	static void findHighestSalary(Employee emp[]) {
		float max = Integer.MIN_VALUE;
		Employee highSalEmp = null;
		for (Employee e : emp) {
			if (e.getSalary() > max) {
				max = e.getSalary();
				highSalEmp = e;
			}
		}
		System.out.println("highest salaty employee: " + highSalEmp);
	}

	static void sortBySalDesc(Employee emp[]) {
		Employee temp;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getSalary() < emp[j].getSalary()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(emp));
	}

	public static void main(String[] args) {
		System.out.println("Enter the no of employees: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		Employee arr[] = new Employee[no];
		/*
		 * arr[0]=new Employee(1, "roshan", 20000); arr[1]=new Employee(2, "kunal",
		 * 30000); arr[2]=new Employee(3, "pratik", 15000);
		 */

		for (int i = 0; i < no; i++) {
			Employee employee = new Employee();
			System.out.println("Enter the id: ");
			int id = sc.nextInt();

			System.out.println("Enter the name: ");
			String name = sc.next();

			System.out.println("Enter the salary: ");
			float salary = sc.nextFloat();
			
			employee.setId(id);
			employee.setName(name);
			employee.setSalary(salary);
			
			arr[i]=employee;
		}
		
		findHighestSalary(arr);
		sortBySalDesc(arr);
	}
}
