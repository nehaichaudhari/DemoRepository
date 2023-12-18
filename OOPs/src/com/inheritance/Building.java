package com.inheritance;

class Flat {
	private int flatNo;
	private int flatMember;

	Flat() {

	}

	Flat(int flatNo, int flatMember) {
		this.flatNo = flatNo;
		this.flatMember = flatMember;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public int getFlatMember() {
		return flatMember;
	}

	public void setFlatMember(int flatMember) {
		this.flatMember = flatMember;
	}

	public String toString() {
		return "\nflat no is: " + flatNo + "\nflat member is: " + flatMember;
	}
}

public class Building {
	String bname;
	String lno;
	Flat f;

	Building() {

	}

	Building(String bname, String lno, Flat f) {
		this.bname = bname;
		this.lno = lno;
		this.f = f;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getLno() {
		return lno;
	}

	public void setLno(String lno) {
		this.lno = lno;
	}

	public Flat getF() {
		return f;
	}

	public void setF(Flat f) {
		this.f = f;
	}

	public String toString() {
		return "\nbuilding name: " + bname + "\nlicence no is: " + lno + "\nflat details: " + f;
	}

	// main method
	public static void main(String[] args) {
		RBuilding r1 = new RBuilding();
		r1.setBname("royal");
		r1.setLno("ABS120");
		r1.setF(new Flat());
		r1.getF().setFlatNo(102);
		r1.getF().setFlatMember(5);
		r1.setOwner("Mahajan");

		System.out.println(r1);
	}
}

class RBuilding extends Building {
	String owner;

	RBuilding() {

	}

	RBuilding(String bname, String lno, Flat f, String owner) {
		super(bname, lno, f);
		this.owner = owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public String toString() {
		return super.toString() + "\nowner name is: " + owner;
	}

}
