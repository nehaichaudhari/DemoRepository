package com.encapsulation;

public class Customer {
	private int custId;
	private String custName;
	private float balance=10000;
	private int accNo;
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public int getCustId() {
		return custId;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String toString() {
		return custId+" "+custName+" "+balance+" "+accNo;
	}

}
