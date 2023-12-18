package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
	public void writeData(File f) {
		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			fw.write("My name is Neha\n");
			fw.write("I am learning full stack..");
			System.out.println("Added....");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void readDate(File f) {
		try {
			if (f.exists()) {
				FileReader fe = new FileReader(f);
				int i = 0;
				while ((i = fe.read()) != -1) {
					System.out.print((char) i);
				}
				fe.close();
			} else {
				System.out.println("File does not exist");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CharacterStream c1 = new CharacterStream();
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\chario.txt");
		c1.readDate(f1);
		c1.writeData(f1);
	}

}
