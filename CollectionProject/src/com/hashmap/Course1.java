package com.hashmap;

public class Course1 {
	private int cid;
	private String cname;
	private int fees;
	
	public Course1() {
		// TODO Auto-generated constructor stub
	}

	public Course1(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course1 [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
}
