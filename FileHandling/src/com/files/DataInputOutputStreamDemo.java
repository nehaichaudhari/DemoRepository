package com.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//allows to directly add primitive data type directly
public class DataInputOutputStreamDemo {
	public void writeDate(File f) {
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));
			dout.writeInt(23);
			dout.writeUTF("Neha Chaudhari");
			dout.writeFloat(83.92f);
			System.out.println("Student added....");
			dout.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void readData(File f) {
		try {
			if(f.exists()) {
				DataInputStream din = new DataInputStream(new FileInputStream(f));
				System.out.println("Roll no: "+din.readInt());
				System.out.println("Name: "+din.readUTF());
				System.out.println("Marks: "+din.readFloat());
				
				din.close();
			}else {
				System.out.println("file does not exist...");
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\hp\\Desktop\\TQNotes\\MyFiles\\dataio.txt");
		DataInputOutputStreamDemo d1 = new DataInputOutputStreamDemo();
		d1.writeDate(f1);
		d1.readData(f1);
	}

}
