package com.inheritance;
class Father{
	private String fname;
	private int age;
	
	Father(){
		
	}
	Father(String fname, int age){
		this.fname=fname;
		this.age=age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "\nfather name: "+fname+"\nfather age: "+age;
	}
	
}
class Child extends Father{
	private String schoolName;
	private int std;
	
	Child(){
		super();
	}
	
	Child(String fname, int age, String schoolName, int std){
		super(fname,age);
		this.schoolName=schoolName;
		this.std=std;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}
	
	public String toString() {
		return super.toString()+"\nSchool name: "+schoolName+"\nStd: "+std;
	}
}
public class SingleLevel {
	public static void main(String[] args) {
		//Father f1 = new Father("ram", 35);
		Child c1 = new Child("ram", 35, "bishop's", 9);
		
		System.out.println(c1);
	}
	
}
