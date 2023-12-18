package com.CRUDOperations;

import java.util.Scanner;

public class BankImplementation implements BankDetails {
	Scanner sc = new Scanner(System.in);
	Bank b[] = new Bank[10];
	int accId;
	String bname, holderName, type;
	int count = 0;
	double balance;

	public void addAccount() {
		System.out.println("Add account");
		System.out.println("Enter the bank id");
		int bankId = sc.nextInt();
		Bank bank = null;
		for (int i=0;i<b.length;i++) {
			if (b[i] != null && b[i].getBid() == bankId) {
				bank = b[i];
			}
		}
		
		if (bank == null) {
			System.out.println("Bank not present");
			return;
		}
		System.out.println("Enter the no of account you want to add");
		int n = sc.nextInt();
		
		Account a[] = new Account[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter account id: ");
			accId = sc.nextInt();
			System.out.println("Enter bank name: ");
			bname = sc.next();
			System.out.println("Enter holder name");
			holderName = sc.next();
			System.out.println("Enter the account type");
			type = sc.next();
			System.out.println("Enter balance");
			balance = sc.nextDouble();
			a[i] = new Account(accId, holderName, type, balance);
			bank.setAcc(a);
		}
		System.out.println("Add account sucessufully");
	}

	public void updateAccount(Bank bank) {
		System.out.println("Update Account");
		System.out.println("Enter the account id you want to update");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == bank.getAcc()[i].getAccId() && bank.getAcc()[i] != null) {
				System.out.println("Enter the balance");
				double balance = sc.nextInt();
				bank.getAcc()[i].setBalance(balance);
			}
		}
		System.out.println("Update account sucessfully");
	}

	public void showAccount(Bank bank) {
		for (int i = 0; i < count; i++) {
			System.out.println(bank.getAcc()[i]);
		}

	}

	public void deleteAccount(Bank bank) {
		System.out.println("Delete Account");
		System.out.println("Enter the account id you want to delete");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == bank.getAcc()[i].getAccId()) {
				bank.getAcc()[i] = null;
			}
			System.out.println("Delete account sucessfully");
		}
	}

	public void searchAccount(Bank bank) {
		System.out.println("Search Account");
		System.out.println("Enter the account name you want to search");
		String holderName = sc.next();
		int flag = 0;
		int i;
		for (i = 0; i < count; i++) {
			if (holderName.equals(bank.getAcc()[i].getHolderName()) && bank.getAcc()[i] != null) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Given account available");
			System.out.println(bank.getAcc()[i]);
		} else {
			System.out.println("Given account is not available");
		}
	}
	
	@Override
	public void addBank() {
		System.out.println("Add Bank");
		System.out.println("Enter the no of banks you want to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter bank id: ");
			int bankId = sc.nextInt();
			System.out.println("Enter bank name: ");
			String bname = sc.next();
			
			b[count] = new Bank(bankId, bname, null);
			count++;
		}
		System.out.println("Add account sucessufully");
	}

	@Override
	public void updateBank() {
		System.out.println("Update Bank");
		System.out.println("Enter the bank id you want to update");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == b[i].getBid() && b[i] != null) {
				System.out.println("Enter the bank name");
				String bName = sc.next();
				b[i].setBname(bName);
			}
		}
		System.out.println("Update bank sucessfully");
	}

	@Override
	public void showBank() {
		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}

	}

	@Override
	public void deleteBank() {
		System.out.println("Delete Bank");
		System.out.println("Enter the bank id you want to delete");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == b[i].getBid()) {
				b[i] = null;
			}
			System.out.println("Delete bank sucessfully");
		}
	}

	@Override
	public void searchBank() {
		System.out.println("Search Bank");
		System.out.println("Enter the bank name you want to search");
		String bName = sc.next();
		int flag = 0;
		int i;
		for (i = 0; i < count; i++) {
			if (bName.equals(b[i].getBname()) && b[i] != null) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Given bank available");
			System.out.println(b[i]);
		} else {
			System.out.println("Given bank is not available");
		}
	}

}
