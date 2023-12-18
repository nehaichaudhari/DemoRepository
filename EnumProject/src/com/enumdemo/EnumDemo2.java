package com.enumdemo;

enum Season {SUMMER, WINTER, MONSOON};

public class EnumDemo2 {
	public static void main(String[] args) {
		Season s = Season.WINTER;
		switch (s) {
		case SUMMER:
			System.out.println("wear cotton clothes");
			break;
		case WINTER:
			System.out.println("wear wollen clothes");
			break;
		case MONSOON:
			System.out.println("carry umbrella");
			break;
		default:
			System.out.println("Error");
		}
	}
}
