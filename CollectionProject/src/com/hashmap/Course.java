package com.hashmap;

public class Course {
	private int courseId;
	private String cname;
	private float fees;
	
	public Course() {
		
	}
	
	Course(int courseId, String cname, float fees){
		this.courseId=courseId;
		this.cname=cname;
		this.fees=fees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", cname=" + cname + ", fees=" + fees + "]";
	}

}
