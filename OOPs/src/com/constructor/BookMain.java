package com.constructor;

class Book {
	private int id;
	private String bname;
	private String aname;
	private String date;
	private float price;
	private char category;

	Book(int id, String bname, String aname, String date, float price, char category) {
		this.id = id;
		this.bname = bname;
		this.aname = aname;
		this.date = date;
		this.price = price;
		this.category = category;
	}

	// setter getter
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBname() {
		return bname = bname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAname() {
		return aname = aname;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date = date;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public char getCategory() {
		return category = category;
	}

	public String toString() {
		return id + "  " + bname + "  " + aname + "  " + date + "  " +price+"  "+category;
	}
}

public class BookMain {
	static void checkDiscount(Book b) {
		if (b.getCategory() == 's') {
			float dis = b.getPrice();
			dis = (float) (dis - (0.3) * dis);
			b.setPrice(dis);
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book(1, " secret ", " john ", " 12/10/1986 ", 650, 's');
		Book b2 = new Book(2, " Gitanjali ", " Rabindranath Tagore ", " 27/8/1995 ", 1000, 'p');
		Book b3 = new Book(3, " Gita Rahasya ", " Bal Gangadhar Tilak ", " 12/5/1980 ", 800, 's');

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		

		checkDiscount(b1);
		checkDiscount(b2);
		checkDiscount(b3);
		
		System.out.println("After");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
