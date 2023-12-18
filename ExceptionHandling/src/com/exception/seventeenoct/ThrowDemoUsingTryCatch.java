package com.exception.seventeenoct;

import java.util.Scanner;


public class ThrowDemoUsingTryCatch {
	static Scanner sc = new Scanner(System.in);
	static void enterDerails() {
		System.out.println("Enter name: ");
		String name= sc.next();
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		try {
		if(marks<0) {
			throw new RuntimeException("Marks should be greater than 0");
		}else {
			if(marks>=40) {
				System.out.println(name+" has cleard the exam");
			}else
			{
				System.out.println(name+" has failed");
			}
		}
		}catch (RuntimeException e) {
			System.out.println("in catch block");
		}
	}
	public static void main(String[] args) {
		enterDerails();
	}

}
