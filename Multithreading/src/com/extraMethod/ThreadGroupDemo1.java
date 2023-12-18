package com.extraMethod;

public class ThreadGroupDemo1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo1 t = new ThreadGroupDemo1();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		Thread t1 = new Thread(tg1, t, "One");
		Thread t2 = new Thread(tg1, t, "Two");
		Thread t3 = new Thread(tg1, t, "Three");
		System.out.println("Thread group name is: " + tg1.getName());
		System.out.println(t1.getPriority());
		//System.out.println("Thread group priority is: " + tg1.getMaxPriority());
		t1.start();
		t2.start();
		t3.start();
		tg1.list();
	}
}
