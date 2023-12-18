package com.containment;

public class Employee {
	private int empId;
	private String ename;
	private Department department;

	Employee() {

	}

	Employee(int empId, String ename,Department department) {
		this.empId = empId;
		this.ename = ename;
		this.department=department;
	}

	// setter getter
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setDepartment(Department department) {
		this.department=department;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	//toString
	public String toString() {
		return "\nEmployee id is: "+empId+"\nName is: "+ename+"\nDepartment details: "+department;
	}
}
