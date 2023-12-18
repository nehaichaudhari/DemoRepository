package com.ThreadCommunication;

class SharedR {
	public synchronized void methodOne() {
		System.out.println(Thread.currentThread().getName() + "has locked method one");
		System.out.println(Thread.currentThread().getName() + "has realsed method one");
		try {
			wait();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + "has finished the task");
	}

	public synchronized void methodTwo() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		notify();
		System.out.println(Thread.currentThread().getName() + " has notified");
	}
}

public class InterThreadComm1 {
	public static void main(String[] args) {
		SharedR obj = new SharedR();

		Thread t1 = new Thread() {
			public void run() {
				obj.methodOne();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.methodTwo();
			}
		};

		t1.start();
		t2.start();
	}
}
