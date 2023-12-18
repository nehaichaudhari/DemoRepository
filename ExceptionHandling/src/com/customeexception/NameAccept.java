package com.customeexception;

import java.util.Scanner;

public class NameAccept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		try {
			if (name.length() < 3) {
				throw new InvalideNameException("Name should be greater than 2 characters");
			}
			System.out.println("welcome: " + name);
		} catch (InvalideNameException e) {
			System.out.println(e);
		}
	}

}
