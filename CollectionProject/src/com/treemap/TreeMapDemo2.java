package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		
		tmap.put(3,"Java" );
		tmap.put(1,"html" );
		tmap.put(8,"C" );
		tmap.put(4,"c++" );
		tmap.put(6,"Python" );
		tmap.put(4,"Angular" );
		//tmap.put(null,"Hi" );null pointer exception
		System.out.println(tmap);
		//sorted Map Methods
		
		System.out.println("First key:"+tmap.firstKey());
		System.out.println("Last key:"+tmap.lastKey());
		
		SortedMap<Integer,String> s1=tmap.subMap(3, 6);
		System.out.println(s1);
		
		SortedMap<Integer,String> s2=tmap.headMap(3);
		System.out.println(s2);
		
		SortedMap<Integer,String> s3=tmap.tailMap(3);
		System.out.println(s3);
		
		System.out.println("Lower key: "+tmap.lowerKey(5));//strictly less
		System.out.println("Floor key: "+tmap.floorKey(4));//less than or equal to
		System.out.println("higher Key: "+tmap.higherKey(4));//strictly higher
		System.out.println("ceiling Key: "+tmap.ceilingKey(4));//equal or greater
		SortedMap<Integer, String> s4 = tmap.subMap(3, false,6,true);//3(from) include : true //6(to):exclude
		System.out.println(s4);
		
		SortedMap<Integer,String> s5=tmap.headMap(3,true);//by default: entries before 3 & 3 is excluded
		System.out.println(s5);
		
		SortedMap<Integer,String> s6=tmap.tailMap(3,false);//by default: entries after 3 and 3 is included
		System.out.println(s6);
	}

}
