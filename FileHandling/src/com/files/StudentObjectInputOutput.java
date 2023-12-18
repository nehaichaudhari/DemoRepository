package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentObjectInputOutput {
	static Scanner sc = new Scanner(System.in);

	public void readData(File f) {
		try {
			if (f.exists()) {
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
				for (int i = 0; i < 3; i++) {
					Student stud = (Student) oin.readObject();
					System.out.println(stud);
				}
				oin.close();
			} else
				System.out.println("File does not exist....");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void writeStudentDate(File f) {
		try {
			if (f.exists()) {
				f.createNewFile();
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
			Student s[] = new Student[3];
			for (int i = 0; i < s.length; i++) {
				s[i] = new Student();
				System.out.println("Enter student id: ");
				s[i].setSid(sc.nextInt());
				System.out.println("Enter student name: ");
				s[i].setName(br.readLine());
				System.out.println("Enter marks: ");
				s[i].setMarks(sc.nextInt());

				oout.writeObject(s[i]);
				System.out.println("student " + (i + 1) + " is added...");
			}
			System.out.println("--------------------------------");
			oout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\studentdate.txt");
		StudentObjectInputOutput s1 = new StudentObjectInputOutput();
		//s1.writeStudentDate(f1);
		s1.readData(f1);
	}
}
