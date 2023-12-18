package com.customeexception;

class Account {
	private int accId;
	private String name;
	private double balance;

	public Account() {
		super();
	}

	public Account(int accId, String name, double balance) {
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println("amount is deposited: " + amount);
		System.out.println("new balance is: " + balance);
	}

	void withdraw(double amount) {
		try {
			if ((this.balance - amount) < 0)
				throw new InsufficientBalanceException("Insufficient balance");
			this.balance-=amount;
			System.out.println("withdraw amount is: " + amount);
			System.out.println("new balance is: " + balance);

		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class Bank {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccId(101);
		a1.setName("ram");
		a1.setBalance(2000);
		System.out.println(a1);
		
		a1.deposit(400);
		
		a1.withdraw(2500);
		a1.withdraw(300);
		
	}
}
