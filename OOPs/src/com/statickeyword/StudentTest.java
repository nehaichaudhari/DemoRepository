package com.statickeyword;

class Student {
	private int id;
	String name;
	float marks;
	static String scName = "ABC"; // first loaded

	// static block
	static {
		System.out.println("Static Block 1:");
		System.out.println(scName);
		scName = "XYZ";
		System.out.println(scName);
	}

	static {
		System.out.println("Static block2 :");
		System.out.println(scName);
		scName = "Lancers";
		System.out.println(scName);
	}

	Student() {
		scName = "St Mary";
	}

	Student(int id, String name, float marks) {
		this();
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + marks;
	}
}

public class StudentTest {

	public static void main(String[] args) {

		//System.out.println(id);//craete object to access id

		// if no value is given String:null
		System.out.println(Student.scName);

		Student s1 = new Student();
		System.out.println(s1.scName);

		Student s2 = new Student();
		System.out.println(s2.scName);

		s2.scName = "St Joseph";

		System.out.println(s1.scName);
		System.out.println(s2.scName);

	}

}