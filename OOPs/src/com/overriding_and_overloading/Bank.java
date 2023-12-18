package com.overriding_and_overloading;

class Account {
	protected int accNo;
	protected String name;
	protected float balance;
	protected float rateOfIntrest;

	Account() {

	}

	Account(int accNo, String name, float balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setRateOfIntrest(float rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}

	public float getRateOfIntrest() {
		rateOfIntrest = 0f;
		return rateOfIntrest;
	}

	void deposite(float amount) {
		balance += amount;
	}

	void withdraw(float amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance: " + balance);
		}
	}
}

class SavingAccount extends Account {
	private String panNumber;

	SavingAccount() {
		super();
	}

	SavingAccount(int accNo, String name, float balance) {
		super(accNo, name, balance);
	}

	SavingAccount(int accNo, String name, float balance, String panNumber) {
		super(accNo, name, balance);
		this.panNumber = panNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public float getRateOfIntrest() {
		rateOfIntrest = 8.5f;
		return rateOfIntrest;
	}

	void deposite(float amount) {
		float b = balance + amount;
		if (b > 5000) {
			if (panNumber != null) {
				balance = b;
			} else {
				System.out.println("Please enter your pan number as your balance is getting above 50000");
			}
		}
	}

	void withdraw(float amount) {
		if ((balance - amount) > 1000) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance: " + balance);
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		Account a1 = new Account(101, "dipti", 1000);
		System.out.println("Accunt details: " + a1.getAccNo() + " " + a1.getBalance());
		System.out.println("rate: " + a1.getRateOfIntrest());

		a1.withdraw(900);
		System.out.println("balance: " + a1.getBalance());
		a1.deposite(67000);
		System.out.println("balance: " + a1.getBalance());

		System.out.println("---------");

		SavingAccount s1 = new SavingAccount(102, "neha", 2000);
		System.out.println("Accunt details: " + s1.getAccNo() + " " + s1.getBalance());
		System.out.println("rate: " + s1.getRateOfIntrest());
		s1.withdraw(19500);
		System.out.println("balance: " + s1.getBalance());
		s1.deposite(67000);
		System.out.println("balance: " + s1.getBalance());
		s1.setPanNumber("ATKP9285K");
		s1.deposite(67000);
		System.out.println("balance: " + s1.getBalance());
	}
}
