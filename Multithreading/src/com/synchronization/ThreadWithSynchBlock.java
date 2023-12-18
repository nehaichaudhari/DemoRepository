package com.synchronization;

class TableR {
	public synchronized void printTable(int n) {
		System.out.println(Thread.currentThread().getName() + " is started");

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + "X" + i + "=" + (n * i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has  finished");
	}
}

public class ThreadWithSynchBlock {

	public static void main(String[] args) {
		TableR obj = new TableR();

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(3);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}
}