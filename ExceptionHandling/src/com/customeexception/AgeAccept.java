package com.customeexception;

import java.util.Scanner;

public class AgeAccept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
			if (age <= 18) {
				throw new InvalidAgeException("not elligibal for votting, age must be greater than 18");
			}
			System.out.println("you are elligibal for votting " + age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
