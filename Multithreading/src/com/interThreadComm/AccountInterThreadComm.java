package com.interThreadComm;

class Account {
	int balance = 1000;

	public synchronized void withdraw(int amount) {
		System.out.println("------------------------");
		System.out.println(Thread.currentThread().getName() + ": want to withdraw: " + amount);
		if ((balance - amount) < 0) {
			System.out.println("------------------------");
			System.out.println("Insufficient balance: "+balance);
			System.out.println(Thread.currentThread().getName()+" is waiting for deposite..");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			withdraw(amount);
		} else {
			balance = balance - amount;
			System.out.println("----------------------------");
			System.out.println("withdraw successfull by :" + Thread.currentThread().getName());
			System.out.println("Account balance: "+balance);
			System.out.println("----------------------------");
		}
	}
	public synchronized void deposite(int amount) throws InterruptedException {
		Thread.sleep(1000);
		balance = balance + amount;
		System.out.println("------------------------------------");
		System.out.println(Thread.currentThread().getName()+" has deposited: "+amount);
		System.out.println("Account balance: "+balance);
		notifyAll();
		System.out.println("------------------------------------");
	}
}

public class AccountInterThreadComm {
	public static void main(String[] args) {
		Account a1 = new Account();
		Thread t1 = new Thread() {
			public void run() {
				a1.withdraw(2000);
			}
		};
		t1.setName("son");
		
		Thread t2 = new Thread() {
			public void run() {
				a1.withdraw(2000);
			}
		};
		t2.setName("daughter");
		Thread t3 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1500);
					a1.deposite(1000);;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t3.setName("father");
		
		Thread t4 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1500);
					a1.deposite(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t4.setName("mother");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
