package com.CRUDOperations;

public class Account {
	private int accId;
	private String holderName;
	private String type;
	private double balance;

	public Account() {

	}

	public Account(int accId, String holderName, String type, double balance) {
		super();
		this.accId = accId;
		this.holderName = holderName;
		this.type = type;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [Account id=" + accId + ", Holder Name=" + holderName + ", type=" + type + ", balance=" + balance+ "]";
	}

}
