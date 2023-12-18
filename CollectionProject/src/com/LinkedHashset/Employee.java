package com.LinkedHashset;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		if (id != emp.id)
			return false;
		if (name == null) {
			if (emp.name != null)
				return false;
		} else if (!name.equals(emp.name))
			return false;
		if (salary != emp.salary)
			return false;
		return true;
	}

}
