package com.containment;

public class CompanyGetterSetter {
	public static void main(String[] args) {
		Department d1 = new Department(1,"IT");
		
		Employee e1 = new Employee(101,"radha",d1);
		Employee e2 = new Employee(102,"seeta",d1);
		
		//2nd way usnig annonymous class
		Employee e3 = new Employee();
		e3.setEmpId(103);
		e3.setEname("john");
		e3.setDepartment(new Department());
		e3.getDepartment().setDeptId(101);
		e3.getDepartment().setDname("HR");
	}

}
