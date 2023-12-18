package com.staticSynchronization;

class MyTable1 {
	public static synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadWithStaticSynch {
	public static void main(String[] args) {
		MyTable1 obj1 = new MyTable1();
		MyTable1 obj2 = new MyTable1();
		Thread t1 = new Thread() {
			public void run() {
				obj1.printTable(2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj1.printTable(3);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				obj2.printTable(5);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				obj2.printTable(6);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
