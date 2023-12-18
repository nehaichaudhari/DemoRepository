package com.files;

import java.io.File;
import java.io.IOException;

public class FileProperties {
	public static void main(String[] args) throws IOException {
		 File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\first.txt");
		 f1.createNewFile();

		//File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles");
		if (f1.exists()) {
			if (f1.isFile()) {
				System.out.println("path: " + f1.getAbsolutePath());
				System.out.println("length: " + f1.length());
				System.out.println("file name: " + f1.getName());
				System.out.println("Write: " + f1.canWrite());
			} else if (f1.isDirectory()) {
				System.out.println("It is a Directory");
			} else {
				System.out.println("unknown");
			}
		} else {
			System.out.println("Nothing");
		}
	}

}
