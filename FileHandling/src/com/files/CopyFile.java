package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	public void copyContents(File s, File d) {
		try {
			if (s.exists()) {
				d.createNewFile();
				FileInputStream fin = new FileInputStream(s);
				FileOutputStream fout = new FileOutputStream(d);

				int i = 0;
				while ((i = fin.read()) != -1) {
					fout.write(i);
				}
				System.out.println("File copied...");
				fin.close();
				fout.close();
			} else {
				System.out.println("Source file does not exists...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CopyFile c1 = new CopyFile();
		File sf = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\bufferio.txt");
		File df = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\copybuff.txt");
		c1.copyContents(sf, df);
	}

}
