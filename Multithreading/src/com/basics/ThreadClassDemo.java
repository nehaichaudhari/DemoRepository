package com.basics;

public class ThreadClassDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadClassDemo t1 = new ThreadClassDemo();// by default thread-0
		ThreadClassDemo t2 = new ThreadClassDemo();
		ThreadClassDemo t3 = new ThreadClassDemo();
		// separate call stack trace is create to context switching
		// run(): no separate call stack : o/p will be main for all threads
//		t1.start();
//		t2.start();
//		t3.start();
		
		t1.run();
		t2.run();
		t3.run();
	}

}
