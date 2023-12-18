package com.companyJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//show employees with highest salary
//2.show employees with lowest salary
//3.list employees who start with name 'A'
//4.show employees who are hired in 2017
//5.list department which has highest no of employees
//6.show top 3 list of managers who has maximum no of employees under them
//7.show minimum salary for each department
//8.show maximum salary for each department
//9.show locations which has maximum departments
//10.show alternate employee names under department with highest no of employees
//11.show list of region with highest no of employees
public class Assignment {
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public Assignment() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}

	public static void question1() {
		try {
			pstmt = conn.prepareStatement("select * from employees where SALARY =(select max(salary) from employees)");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("employee id: " + rs.getInt(1) + ", employee first_name: " + rs.getString(2)+", salary: "+rs.getInt(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question2() {
		try {
			pstmt = conn.prepareStatement("select * from employees where SALARY =(select min(salary) from employees)");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("employee id: " + rs.getInt(1) + ", employee first_name: " + rs.getString(2)+", salary: "+rs.getInt(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question3() {
		try {
			pstmt = conn.prepareStatement("select * from employees where FIRST_NAME like 'a%'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question4() {
		try {
			pstmt = conn.prepareStatement("select employee_id, first_name from employees where year(hire_date) = 2017");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question5() {
		try {
			pstmt = conn.prepareStatement("select count(employee_id) as total, DEPARTMENT_ID from employees GROUP BY DEPARTMENT_ID "
					+ "order by total desc limit 1");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question6() {
		try {
			pstmt = conn.prepareStatement("select count(*) as count, MANAGER_ID  from employees group by "
					+ "MANAGER_ID order by count desc limit 3");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void question7() {
		try {
			pstmt = conn.prepareStatement("select min(salary), DEPARTMENT_ID from employees group by DEPARTMENT_ID");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question8() {
		try {
			pstmt = conn.prepareStatement("select max(salary), DEPARTMENT_ID from employees group by DEPARTMENT_ID");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question9() {
		try {
			pstmt = conn.prepareStatement("select location_id, max(department_id) from departments");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question10() {
		try {
			pstmt = conn.prepareStatement("select location_id, max(department_id) from departments");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void question11() {
		try {
			pstmt = conn.prepareStatement("select c.REGION_ID, count(e.EMPLOYEE_ID) "
					+ "from employees e join departments d join countries c join locations l "
					+ "on e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID and l.COUNTRY_ID = c.COUNTRY_ID");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("region id: "+rs.getInt(1)+", employee count: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Assignment a1 = new Assignment();
		a1.question1();
		System.out.println("--------------------------------------------");
		a1.question2();
		System.out.println("--------------------------------------------");
		a1.question3();
		System.out.println("--------------------------------------------");
		a1.question4();
		System.out.println("--------------------------------------------");
		a1.question5();
		System.out.println("--------------------------------------------");
		a1.question6();
		System.out.println("--------------------------------------------");
		a1.question7();
		System.out.println("--------------------------------------------");
		a1.question8();
		System.out.println("--------------------------------------------");
		a1.question9();
		System.out.println("--------------------------------------------");
		a1.question10();
		System.out.println("--------------------------------------------");
		a1.question11();
	}

}
