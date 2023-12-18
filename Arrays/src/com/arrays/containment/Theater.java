package com.arrays.containment;

public class Theater {
	private int id;
	private String tname;
	private Movie m;
	
	public Theater() {
		
	}

	public Theater(int id, String tname, Movie m) {
		super();
		this.id = id;
		this.tname = tname;
		this.m = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Movie getM() {
		return m;
	}

	public void setM(Movie m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", tname=" + tname + ", m=" + m + "]";
	}
}
