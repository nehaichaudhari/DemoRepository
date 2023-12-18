package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserObjectInputOutput{
	static Scanner sc = new Scanner(System.in);

	public void readData(File f) {
		try {
			if (f.exists()) {
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
				for (int i = 0; i < 3; i++) {
					User user = (User) oin.readObject();
					System.out.println(user);
				}
				oin.close();
			} else
				System.out.println("File does not exist....");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void writeUserData(File f) {
		try {
			if (f.exists()) {
				f.createNewFile();
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
			User u[] = new User[3];
			for (int i = 0; i < u.length; i++) {
				u[i] = new User();
				System.out.println("Enter user id: ");
				u[i].setUserId(sc.nextInt());
				System.out.println("Enter user name: ");
				u[i].setUname(br.readLine());
				System.out.println("Enter passsword: ");
				u[i].setPassword(sc.next());

				oout.writeObject(u[i]);
				System.out.println("user " + (i + 1) + " is added...");
			}
			System.out.println("--------------------------------");
			oout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\usertdate.txt");
		UserObjectInputOutput s1 = new UserObjectInputOutput();
		//s1.writeUserData(f1);
		s1.readData(f1);
	}
}
