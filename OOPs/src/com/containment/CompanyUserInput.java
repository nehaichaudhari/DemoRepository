package com.containment;

import java.util.Scanner;

public class CompanyUserInput {
	static Scanner sc = new Scanner(System.in);

	void enterEmployeeDtails(Employee e) {
		System.out.println("Enter employee id: ");
		e.setEmpId(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setEname(sc.next());

		e.setDepartment(new Department());

		System.out.println("Enter department id:");
		e.getDepartment().setDeptId(sc.nextInt());

		System.out.println("Enter department name:");
		e.getDepartment().setDname(sc.next());
	}

	public static void main(String[] args) {
		CompanyUserInput company = new CompanyUserInput();
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		company.enterEmployeeDtails(e1);
		company.enterEmployeeDtails(e2);

		System.out.println(e1);
		System.out.println(e2);

	}

}
