package com.treemap;

public class Customer {
	private int cid;
	private String cname;
	private long phoneNo;
	
	public Customer() {
		
	}

	public Customer(int cid, String cname, long phoneNo) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phoneNo = phoneNo;
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

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", phoneNo=" + phoneNo + "]";
	}

//	@Override
//	public int compareTo(Customer o) {
//		return this.cid-o.cid;
//	}
}
