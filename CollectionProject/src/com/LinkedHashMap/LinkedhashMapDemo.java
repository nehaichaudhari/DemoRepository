package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMapDemo {

	public static void main(String[] args) {
	
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>();
		
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
		

	}

}
