package com.inheritance;

class Vehicle {
	protected int vid;
	protected String type;

	Vehicle() {
		super();
	}

	Vehicle(int vid, String type) {
		super();
		this.vid = vid;
		this.type = type;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getVid(int vid) {
		return vid;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType(String type) {
		return type;
	}

	public String toString() {
		return "\nVehicle details: " + "\nVehicle id is: " + vid + "\nname is: " + type;
	}

}

class Car extends Vehicle {
	private int cid;
	private String cname;
	private int chessyNo;

	Car() {
		super();
	}

	Car(int vid, String type, int cid, String cname, int chessyNo) {
		super(vid, type);
		this.cid = cid;
		this.cname = cname;
		this.chessyNo = chessyNo;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCid(int cid) {
		return cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname(String cname) {
		return cname;
	}

	public void setChessyNo(int chessyNo) {
		this.chessyNo = chessyNo;
	}

	public int getChessyNo(int chessyNo) {
		return cid;
	}

	public String toString() {
		return "\nCar details: " + "\ncar id is: " + cid + "\nname is: " + cname + "\nchessy no: " + chessyNo
				+ "\nVehicle details:" + "\nvehicle id: " + vid + "\nvehicle type is: " + type;
	}
}

public class CarVehicleMain {
	public static void main(String[] args) {
		Car c1 = new Car(1, "4 wheeler", 102, "thar", 125456);
		System.out.println(c1);
	}

}