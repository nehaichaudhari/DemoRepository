package com.finalkeyword;
final class Student{
	final int aadharNo;
	String name;
	int age;
	final static String schoolName;
	
	static
	{
		schoolName = "Bishop's";
	}
	
	Student(int aadharNo){
		this.aadharNo= aadharNo;
	}
	
	Student(int aadharNo, String name, int age, String schoolName){
		this.aadharNo=aadharNo;
		this.name=name;
		this.age=age;
		//this.schoolName= "st.mery";
	}
	
	/*public void setAadharNo(int aadharNo) { // setter is not possible when we use final keyword
		this.aadharNo=aadharNo;
	}*/
	
	public int getAadharNo() {
		return aadharNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	/*public void SetSchoolName(String schoolName) { //not possible
		this.schoolName=schoolName;
	}*/
	
	public String getSchoolName(){
		return schoolName;
	}
	
	final void display() {
		System.out.println("student details is: ");
	}
}
/*class SchoolStudent extends Student{ // this is not possible because class Student is final
	SchoolStudent(){
		super(78945625);
	}
	
	void display() { // this is not possible because display method is final
		System.out.println("school student are: ");
	}
	
}*/
public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(12345612);
		Student s2 = new Student(452356, "ram", 25, "st.mery");// value cannot change
		//System.out.println(s1.setAadharNo); //not possible
		System.out.println(s1.getAadharNo());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		//s1.setSchoolName("kroot memorial"); not able to set school name because it is final
		//System.out.println(s1.getSchoolName());
		
		System.out.println(s1.schoolName);
		System.out.println("---------");
		System.out.println(s2.getAadharNo());
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getSchoolName());
		
	}

}
