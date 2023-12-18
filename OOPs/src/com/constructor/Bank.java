package com.constructor;

class Account {
	private int id;
	private String name;
	private float balance;
	private String status;

	Account() {

	}

	Account(int id, String name, float balance, String status) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.status = status;
	}
	public void setId(int id) {
		this.id = id;
	}

	public float getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public String toString() {
		return id + " " + name + " " + balance + " " + status;
	}

}

public class Bank {
	static void allocateStatus(Account acc) {
		if (acc.getBalance() < 0) {
			acc.setStatus("deactivate");
		}else {
			acc.setStatus("activate");
		}
	}

	public static void main(String[] args) {
		
		//paramertrized constructor
		Account a1 = new Account(101, "radha", 36000, "unkown");
		Account a2 = new Account(102, "seeta",-250, "unkown");
		Account a3 = new Account(103, "geeta", 15000, "unkown");
		Account a4 = new Account(104, "raju", 0, "unkown");
		Account a5 = new Account(105, "john",-150, "unkown");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);

		allocateStatus(a1);
		allocateStatus(a2);
		allocateStatus(a3);
		allocateStatus(a4);
		allocateStatus(a5);

		System.out.println("After");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		//default constructor
		Account a6 = new Account();
		a6.setId(106);
		a6.setName("kunal");
		a6.setBalance(55000);
		a6.setStatus("unknown");
		System.out.println(a6);
	}

}
