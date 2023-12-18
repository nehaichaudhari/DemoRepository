package com.enumdemo;
//before enum
class ConstantDirec{
	static final String NORTH="NORTH";
	static final String SOUTH="SOUTH";
	static final String EAST="EAST";
	static final String WEST="WEST";
	
}
public class EnumDemo1 {
	public enum Direction{NORTH, SOUTH, EAST, WEST};
	public static void main(String[] args) {
		Direction d1 = Direction.NORTH;
		System.out.println(d1);
		
		Direction d2 = Direction.NORTH;
		if(d1.equals(d2))
			System.out.println("equal");
		
		if(d1==d2)
			System.out.println("equal");
		System.out.println("------------------------");
		
		//methods-value, valueOf,Ordinal
		//also we can iterate the enum
		for(Direction d : Direction.values()) {
			System.out.println(d);
		}
		System.out.println("------------------------");
		System.out.println(Direction.valueOf("NORTH"));
		System.out.println(Direction.SOUTH.ordinal());//return index and index start from 0
		
	}

}
