package com.containment;

public class Department {
	private int deptId;
	private String dname;
	
	Department(){
		
	}
	
	Department(int deptId,String dname){
		this.deptId=deptId;
		this.dname=dname;
	}
	
	//setter getter
	public void setDeptId(int deptId) {
		this.deptId=deptId;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	public void setDname(String dname) {
		this.dname=dname;
	}
	
	public String getDname() {
		return dname;
	}
	
	//toString
	public String toString() {
		return "\nDepartment id: "+deptId+"\nName is: "+dname;
	}

}
