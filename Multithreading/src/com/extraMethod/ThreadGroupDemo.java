package com.extraMethod;

public class ThreadGroupDemo extends Thread {
	public void run() {

	}

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("Parent group");
		Thread t1 = new Thread(tg1, "child1");
		Thread t2 = new Thread(tg1, "child2");

		t1.setPriority(MIN_PRIORITY);
		tg1.setMaxPriority(MAX_PRIORITY);

		System.out.println("priority of thread 1: " + t1.getPriority());
		System.out.println("parent of thread 1: " + t1.getThreadGroup());

		t1.start();
		t2.start();

		System.out.println("Active threads: " + tg1.activeCount());

	}
}
