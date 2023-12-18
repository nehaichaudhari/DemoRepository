package com.arrays.containment;

public class TheaterMovieMain {
	public static void main(String[] args) {
		Movie m = new Movie(101, "RRR", 9.2f);
		Theater t[] = new Theater[2];
		
		t[0]=new Theater(1, "PVR", m);
		t[1]=new Theater(2, "OMG", m);
		
		for(Theater tr :t) {
			System.out.println(tr);
		}
	}

}
