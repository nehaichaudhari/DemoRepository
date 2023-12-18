package com.constructor;

class Movie {
	private int mid;
	private String mname;
	private float rating;

	// default cons
	Movie() {

	}

	//// para cons
	Movie(int mid, String mname, float rating) {
		this.mid = mid;
		this.mname = mname;
		this.rating = rating;
	}

	// getter setter
	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getMid() {
		return mid;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMname() {
		return mname;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getRating() {
		return rating;
	}

	public String toString() {
		return mid + " " + mname + " " + rating;
	}

}

public class MovieMain {

	static void checkRating(Movie m) {
		if (m.getRating() > 7) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		Movie m1 = new Movie(1, "RRR", 8.5f);
		Movie m2 = new Movie(2, "omg2", 6.5f);
		Movie m3 = new Movie(3, "gadar2", 5f);
		Movie m4 = new Movie(4, "dhamal", 7.5f);
		Movie m5 = new Movie(5, "golmal", 10f);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		
		System.out.println("\nAfter:");
		checkRating(m1);
		checkRating(m2);
		checkRating(m3);
		checkRating(m4);
		checkRating(m5);

	}
}
