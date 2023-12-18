package com.treemap;

public class Order {
	private int id;
	private String pname;
	private float price;

	public Order() {

	}

	public Order(int id, String pname, float price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
}
