package com.containment;

public class Employee1 {
	private int eid;
	private String ename;
	private int salary;
	private Date1 date;
	
	Employee1() {
		
	}
	
	Employee1(int eid,String ename, int salary,Date1 date){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.date=date;
	}
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date1 getDate() {
		return date;
	}

	public void setDate(Date1 date) {
		this.date = date;
	}
	
	public String toString() {
		return null;
	}

}
