package com.containment;

public class Course {
	private int cid;
	String cname;
	float fees;

	Course() {

	}

	Course(int cid, String cname, float fees) {
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	// setter getter
	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public float getFees() {
		return fees;
	}

	public String toString() {
		return "\nId is: " + cid + "\nName is: " + cname + "\nFees is: " + fees;
	}

}
