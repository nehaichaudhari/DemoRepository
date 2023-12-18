package com.encapsulation;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cust = new Customer();
		
		cust.setCustId(101);
		cust.setCustName("radha");
		//cust.setBalance(10000);
		cust.setAccNo(1236554);
		System.out.println(cust);
		
		System.out.println("what transaction do you want 'c' or 'd':");
		char t = sc.next().charAt(0);
		System.out.println("Enter the value:");
		float amount = sc.nextFloat();
		if(t=='c') {
			float balance = cust.getBalance();
			balance+=amount;
			cust.setBalance(balance);
			System.out.println(amount+" credited: ");
			System.out.println("Availabel balance: "+balance);
		}
		if(t=='d') {
			float balance = cust.getBalance();
			balance-=amount;
			cust.setBalance(balance);
			System.out.println(amount+ " debited: ");
			System.out.println("Availabel balance: "+balance);
		}
	}

}
