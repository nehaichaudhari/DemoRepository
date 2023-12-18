package com.containment;

public class Student {
	private int sid;
	private String sname;
	private Course course;

	Student() {

	}

	Student(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}
	
	public String toString() {
		return "\nStudent details: "+"\nId is: " + sid + "\nName is: " + sname + "\nCourse details: " +course;
	}

}
