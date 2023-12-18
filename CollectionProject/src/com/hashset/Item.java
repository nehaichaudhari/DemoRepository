package com.hashset;

public class Item implements Comparable<Item>{
	private int id;
	private String iname;
	private float price;

	public Item() {
		
	}

	public Item(int id, String iname, float price) {
		super();
		this.id = id;
		this.iname = iname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((iname == null) ? 0 : iname.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item item = (Item) obj;
		if (id != item.id)
			return false;
		if (iname == null) {
			if (item.iname != null)
				return false;
		} else if (!iname.equals(item.iname))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(item.price))
			return false;
		return true;
	}

	@Override
	public int compareTo(Item o) {
		return (int) (this.price-o.price);
	}

}
