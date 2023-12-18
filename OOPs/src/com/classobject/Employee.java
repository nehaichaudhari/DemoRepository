package com.classobject;

import java.util.Scanner;

public class Employee {
	int eid;
	String name;
	String department;
	int salary;
	double hra, da, grossSalary;
	double basicSalary;

	void display() {
		System.out.println("employee id is: " + eid + " name " + name + " department " +department+" salary "+salary);
	}

	void grossSalary() {
		if (basicSalary <= 10000) {
			hra = 0.2 * basicSalary;
			da = 0.8 * basicSalary;
		} else if (basicSalary <= 20000) {
			hra = 0.25 * basicSalary;
			da = 0.9 * basicSalary;
		} else {
			hra = 0.3 * basicSalary;
			da = 0.95 * basicSalary;
		}
		grossSalary = basicSalary + hra + da;
		System.out.println("Gross salary: " + grossSalary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details:");
		Employee emp = new Employee();
		System.out.println("Enter emp id:");
		emp.eid = sc.nextInt();
		System.out.println("Enter emp name:");
		emp.name = sc.next();
		System.out.println("Enter emp department:");
		emp.department = sc.next();
		System.out.println("Enter the salary:");
		emp.salary = sc.nextInt();
		System.out.println("Enter the basic salary:");
		emp.basicSalary = sc.nextDouble();
		System.out.println("Enter the hra:");
		emp.hra = sc.nextDouble();
		System.out.println("Enter the da:");
		emp.da = sc.nextDouble();
		System.out.println("Enter the gross salary:");
		emp.grossSalary=sc.nextDouble();
		emp.grossSalary();
		emp.display();
		sc.close();
	}
}
