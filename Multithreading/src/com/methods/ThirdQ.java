package com.methods;

public class ThirdQ implements Runnable {
	int num = 1;

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Value " + i);

		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThirdQ t = new ThirdQ();
		Student s = new Student(1, "shiv", 90);
		Thread t1 = new Thread(s) {
			public void run() {
				s.name = "mr" + s.name;
				System.out.println(s.name + s.marks);
				System.out.println(getThreadGroup().getParent().getName());
				Thread t3 = new Thread(s) {
					public void run() {
						System.out.println(getThreadGroup().getName());
					}
				};
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t3.start();
			}
		};
		Thread t2 = new Thread(s);

		// t1.start();
		t1.start();

		t2.start();

	}

}

class Student implements Runnable {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void increasemarks() {
		marks = marks + 5;
		System.out.println("name " + name + "marks: " + marks);
	}

	@Override
	public void run() {

		increasemarks();

	}

}
