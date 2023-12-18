package com.inheritance;
class Student1 {
	private int sid;
	private String sname;
	int fees;
	
	Student1(){
		
	}
	
	Student1(int sid, String sname, int fees){
		this.sid=sid;
		this.sname=sname;
		this.fees=fees;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public String toString() {
		return "\nstudent id: "+sid+"\n student name: "+sname+"\nfees: "+fees;
	}
	
	void payFees() {
		System.out.println("monthly fees to be paid: "+fees);
	}
}
class ColStud extends Student1{
	private int semNo;
	private String collegeName;
	
	ColStud(){
		
	}
	
	ColStud(int sid, String sname, int fees, int semNo, String collegeName){
		super(sid, sname, fees);
		this.semNo=semNo;
		this.collegeName=collegeName;
	}
	
	public void setSemNo(int semNo) {
		this.semNo=semNo;
	}
	
	public int getSemNo() {
		return semNo;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public String toString() {
		return super.toString()+"\nsem number: "+semNo+"\n college name: "+collegeName;
	}
	
	void payFees() {
		System.out.println("College student fees: "+fees);
	}
	
}
class SchoolStud extends Student1{
	private int std;
	private String schName;
	
	SchoolStud(){
		
	}
	
	SchoolStud(int sid, String sname, int fees, int std, String schName){
		super(sid, sname, fees);
		this.std=std;
		this.schName=schName;
	}
	
	public void setStd(int std) {
		this.std=std;
	}
	
	public int getSemNo() {
		return std;
	}
	
	public void setCollegeName(String schName) {
		this.schName=schName;
	}
	
	public String getSchName() {
		return schName;
	}
	
	public String toString() {
		return super.toString()+"\nstd is: "+std+"\n school name: "+schName;
	}
	
	void payFees() {
		System.out.println("your sem fees is: "+fees*6);
	}
	
}
public class StudentInfo{
	public static void main(String[] args) {
		Student1 s = new Student1(101, "radha", 10000);
		System.out.println(s.getSname()+":");
		s.payFees();
		
		s =new SchoolStud(102, "gauri", 4000, 12, "heritage");
		System.out.println(s.getSname()+":");
		s.payFees();
		
		s = new ColStud(103, "harshada", 6000, 2, "sinhgad");
		System.out.println(s.getSname()+":");
		s.payFees();
	}
	
}
