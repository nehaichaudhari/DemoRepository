package com.statickeyword;

class Counter {
	int x;
	static int count = 0;

	// instance block
	{
		System.out.println("In instance block");
	}

	Counter() {
		System.out.println("default const: ");
		x = 10;
		count++;
	}

	Counter(int x) {
		// this();
		this.x = x;
		//count++;
	}
}

public class HitCounterApp {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println(Counter.count);//default =1

		Counter c2 = new Counter();
		System.out.println(Counter.count);//2

		Counter c3 = new Counter();
		System.out.println(Counter.count);//3

		Counter c4 = new Counter(80);
		System.out.println(Counter.count);//4
	}

}
