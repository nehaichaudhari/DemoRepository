package com.arrays.containment;

import java.util.Scanner;

public class EmpDeptMain {
	static void countEmp(Employee emp[], Department dep[]) {
		for(Department d : dep) {
			int count=0;
			for(Employee e:emp) {
				if(e.getDept().getDeptName().equals(d.getDeptName())) {
					count++;
				}
			}
			System.out.println(d.getDeptName()+" = "+count);
		}
	}
	static void deptEmpDetails(Employee emp[], Department dep[]) {
		for(Department d : dep) {
			System.out.println(d);
			for(Employee e:emp) {
				if(e.getDept().equals(d)) {
					System.out.println(e.getEid()+" "+e.getName());
				}
			}
			System.out.println("****************************");
		}
	}
	
	//using getter setter
	static Scanner sc = new Scanner(System.in);
	static void enterDetails(Employee emp) {
		System.out.println("Enter employee id: ");
		emp.setEid(sc.nextInt());
		
		System.out.println("name is: ");
		emp.setName(sc.next());
		
		System.out.println("salary is: ");
		emp.setSalary(sc.nextDouble());
		
		emp.setDept(new Department());
		System.out.println("Enter department id: ");
		emp.getDept().setId(sc.nextInt());
		
		System.out.println("department name is: ");
		emp.getDept().setDeptName(sc.next());
	}
	static void printDetails(Employee[] e) {
		for(Employee eAr:e) {
			System.out.println(eAr);
		}
	}
	
	public static void main(String[] args) {
		Employee emp[] = new Employee[6];
		Department dept[] = new Department[3];
		
		dept[0]=new Department(101, "IT");
		dept[1]=new Department(102, "HR");
		dept[2]=new Department(103, "Account");
		
		emp[0] = new Employee(1, "ram", 20000, dept[1]);
		emp[1] = new Employee(2, "kunal", 15000, dept[0]);
		emp[2] = new Employee(3, "shyam", 10000, dept[0]);
		emp[3] = new Employee(4, "pratik", 30000, dept[1]);
		emp[4] = new Employee(5, "varsha", 35000, dept[2]);
		emp[5] = new Employee(6, "mayuri", 18000, dept[1]);
		
		/*countEmp(emp, dept);
		System.out.println("---------------------------------------------");
		deptEmpDetails(emp, dept);*/
		
		Employee e2Arr[]= new Employee[2];
		for(int i=0;i<e2Arr.length;i++) {
			Employee e1 =new Employee();
			enterDetails(e1);
			e2Arr[i]=e1;
		}
		printDetails(e2Arr);
	}

}
