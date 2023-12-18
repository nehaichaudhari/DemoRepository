package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadUsingReader {
	public static void main(String[] args) throws IOException {
		char ch;
		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\first.txt");
		fw = new FileWriter("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\firstCopy.txt");
		int temp;
		while ((temp = fr.read()) != -1) {
			System.out.print((char) temp);
			fw.write(temp);
		}
		if (fr != null)
			fr.close();
		if (fr != null) 
			fw.close();
	}
}
