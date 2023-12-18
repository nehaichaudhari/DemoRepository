package com.statickeyword;

public class Patient {
	private int id;
	private String pname;
	static String dname = "dr.sunita";
	static String clinicName = "health care";
	static int countOfPatient=0;
	
	{
		countOfPatient++;
	}

	Patient(int id, String pname) {
		this.id = id;
		this.pname = pname;
	}

	public String toString() {
		return "\nid is: " + id + "\nname is: " + pname + "\ndoctor name is: " + dname + "\nclinic name is: "
				+ clinicName;
	}

	public static void main(String[] args) {
		
		Patient p1 = new Patient(1, "radha");
		System.out.println(p1);

		Patient p2 = new Patient(2, "seeta");
		System.out.println(p2);
		System.out.println("count of patient is: "+countOfPatient);
	}

}
