package com.CRUDOperations;

public class Bank {
	private int bid;
	private String bname;
	private Account acc[];

	public Bank() {

	}

	public Bank(int bid, String bname, Account acc[]) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.acc = acc;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Account[] getAcc() {
		return acc;
	}

	public void setAcc(Account[] acc) {
		this.acc = acc;
	}

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", acc=" + acc + "]";
	}
}
