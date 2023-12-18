package com.files;

import java.io.File;
import java.io.FileInputStream;

public class FileReadDemo {
	public void fileRead(File f) throws Exception {
		char ch;
		int i;
		FileInputStream fis = new FileInputStream(f);
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
	}

	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\studentdate.txt");
		FileReadDemo read = new FileReadDemo();
		read.fileRead(f1);
	}

}
