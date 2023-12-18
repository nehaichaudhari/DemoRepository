package com.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack<String> names = new Stack<>();
		names.push("Harshada");
		names.push("Priyanka");
		System.out.println(names.push("Shahid"));

		names.push("Anuj");
		names.push("Gauri");

		System.out.println(names);

		System.out.println(names.pop());
		System.out.println(names);

	}

}
