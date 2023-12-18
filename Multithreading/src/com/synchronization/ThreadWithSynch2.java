package com.synchronization;

class MTable {
	public synchronized void printTable(int n) {
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

class Thread1 extends Thread {
	MTable t;

	public Thread1(MTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}
}

class Thread2 extends Thread {
	MTable t;

	public Thread2(MTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(3);
	}
}

public class ThreadWithSynch2 {
	public static void main(String[] args) {
		MTable obj = new MTable();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);

		t1.start();
		t2.start();
	}
}
