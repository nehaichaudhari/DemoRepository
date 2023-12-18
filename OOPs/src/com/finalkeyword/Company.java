package com.finalkeyword;
class Developer{
	final int noOfHours = 8;
	final String cname;
	final float salary;
	String ename;
	
	{
		//noOfHours = 10;// we cannot change its value because it is final variable
		cname = "HCL";
	}
	
	public Developer() {
		salary = 10000.0f;
	}
	
	public Developer(String ename, float salary) {
		this.ename=ename;
		this.salary=salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	//setter is not create for salary because we cannot change final var value once it is declare
	public float getSalary() {
		return salary;
	}
	
	final void skills() {
		System.out.println("html,java,c,c++,css");
	}
}
class FullStackDeveloper extends Developer{
	/*void skills() {// we cannot use this method because this method is final in developer class cannot override and change it implementation
		System.out.println("spring boot");
	}*/
	
}
public class Company {
	public static void main(String[] args) {
		Developer d1 = new Developer();
		System.out.println(d1.cname+" "+d1.ename+" "+d1.salary);
		
		//d1.setSalary(); not possible
		d1.setEname("shruti");
		System.out.println(d1.cname+" "+d1.ename+" "+d1.salary);
		
		Developer d2= new Developer("gauri", 25000f);
		System.out.println(d2.cname+" "+d2.ename+" "+d2.salary);
	}
}
