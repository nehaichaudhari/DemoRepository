package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Student stud = new Student(1, "ram", 56);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\studentdate.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stud);
			oos.close();
			fos.close();
			System.out.println("Serialization complete");
		}catch (Exception e) {
			System.out.println("Error occured");
		}
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\studentdate.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student stud1 = (Student)ois.readObject();
			System.out.println(stud1);
			ois.close();
			fis.close();
			System.out.println("deserialization complete");
		}catch (Exception e) {
			System.out.println("Error occured");
		}
	}
}
