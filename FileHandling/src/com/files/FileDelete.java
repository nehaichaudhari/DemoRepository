package com.files;

import java.io.File;

public class FileDelete {
	public void deleteFile(File f) {
		try {
			if (f.exists()) {
				if (f.delete()) {
					System.out.println(f.getName() + " is deleted");
				}else {
					System.out.println("error...");
				}
			} else {
				System.out.println("File not found..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FileDelete obj = new FileDelete();
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\fileio.txt");
		obj.deleteFile(f1);
	}

}
