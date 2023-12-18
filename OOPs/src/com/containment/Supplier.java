package com.containment;

public class Supplier {
	private int sid;
	private String sname;
	private Item item;
	
	Supplier() {
		
	}
	
	Supplier(int sid, String sname, Item item){
		this.sid=sid;
		this.sname=sname;
		this.item=item;
	}
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public String toString() {
		return "\nSupplier details: "+"\nsupplier id is:"+sid+"\nsupplier name: "+sname+"\nitem details: "+item;
	}

}
