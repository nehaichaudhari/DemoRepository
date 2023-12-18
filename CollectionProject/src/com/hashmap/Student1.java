package com.hashmap;

public class Student1 {
	private int sid;
	private String sname;
	//private float marks;
	private Course1 course;
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	public Student1(int sid, String sname, float marks, Course1 course) {
		super();
		this.sid = sid;
		this.sname = sname;
		//this.marks = marks;
		this.course = course;
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
//	public float getMarks() {
//		return marks;
//	}
//	public void setMarks(float marks) {
//		this.marks = marks;
//	}
	public Course1 getCourse() {
		return course;
	}
	public void setCourse(Course1 course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}
	
}
