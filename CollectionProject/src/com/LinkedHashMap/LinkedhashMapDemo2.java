package com.LinkedHashMap;

import java.util.LinkedHashMap;

import java.util.Map;

public class LinkedhashMapDemo2 {

	public static void main(String[] args) {
	//access order
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>(16,0.75f,true);
		
		lhm.put("Radha", 89.0);
		lhm.put("Harshada", 67.0);
		lhm.put("Priya", 87.0);
		lhm.put("Priyanka", 90.0);
		lhm.put("Poonam", 78.0);
		lhm.put("Saumya", 65.0);

		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
		  System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println("-----------------------------------");
		System.out.println("Marks of Radha:"+lhm.get("Radha"));
		System.out.println("Marks of Harshada:"+lhm.get("Harshada"));
		System.out.println("-----------------------------------");
		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}

}
