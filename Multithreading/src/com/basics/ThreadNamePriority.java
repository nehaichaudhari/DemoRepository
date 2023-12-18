package com.basics;

public class ThreadNamePriority extends Thread {
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadNamePriority t1 = new ThreadNamePriority();
		ThreadNamePriority t2 = new ThreadNamePriority();
		ThreadNamePriority t3 = new ThreadNamePriority();

		// by default = 5 range : 1 to 10
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3");

		t3.setPriority(MAX_PRIORITY);// 10
		t1.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
	}
}
