package com.comparable;

import java.util.Collections;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;

	Employee() {
		super();
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	//on the basis of salary in desc order
//	@Override
//	public int compareTo(Employee e) {
//		if (this.getSalary() == e.getSalary())
//			return 0;
//		else if (this.getSalary() > e.getSalary())
//			return -1;
//		else
//			return 1;
//	}

	// on the basis of name - if salary is same then it check for name
	@Override
	public int compareTo(Employee e) {
		if (this.getSalary() == e.getSalary())
			return this.getName().compareTo(e.getName());
		else if (this.getSalary() > e.getSalary())
			return -1;
		else
			return 1;
	}
	

}
