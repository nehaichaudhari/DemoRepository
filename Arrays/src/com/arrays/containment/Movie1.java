package com.arrays.containment;

public class Movie1 {
	private int id;
	private String mname;
	private float rating;
	Movie1(){
		
	}
	public Movie1(int id, String mname, float rating) {
		super();
		this.id = id;
		this.mname = mname;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", mname=" + mname + ", rating=" + rating + "]";
	}

}
