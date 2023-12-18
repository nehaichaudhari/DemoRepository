package com.containment;

public class Date1 {
	private int mm;
	private int dd;
	private int yy;
	
	Date1(){
		
	}
	
	Date1(int mm, int dd,int yy){
		this.mm=mm;
		this.dd=dd;
		this.yy=yy;
	}
	
	public void setMm(int mm) {
		this.mm=mm;
	}
	
	public int getMm() {
		return mm;
	}
	
	public void setDd(int dd) {
		this.dd=dd;
	}
	
	public int getDd() {
		return dd;
	}
	
	public void setYy(int yy) {
		this.yy=yy;
	}
	
	public int getYy() {
		return yy;
	}
	
	public String toString() {
		return "\nDate details:"+"\nmonth is: "+mm+"\ndate is: "+dd+"\nyear is: "+yy;
	}

}
