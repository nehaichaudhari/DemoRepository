package com.ninteenoct;

import java.util.ArrayList;

public class MethodsArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.isEmpty());
		al.add("java");
		al.add("angular");
		al.add("python");
		al.add("java");
		al.add("spring");
		al.add(null);
		al.add(null);
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		//difference set and add
		al.add(2, "html");
		System.out.println(al);//add and shift other elements
		
		al.set(5, "devops");
		System.out.println(al);//replace on specific index
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("c");
		al2.add("c++");
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("c++");
		al3.add("c");
		al3.add("java");
		al3.add("react");
		
		System.out.println(al3);
		
		al.addAll(al2);// add whole collection at end, al2 is a arraylist 2
		System.out.println(al);
		
		al.addAll(2, al2);
		System.out.println(al);//add collection from the specific index
		
		System.out.println(al.contains("java"));
		System.out.println(al.contains("react"));
		
		System.out.println(al.containsAll(al3));//all elements of al3 must be present in al
		System.out.println(al.size());
		
		//remove
		System.out.println("remove: "+al.remove(4));//it return element
		System.out.println(al);
		System.out.println(al.remove("html"));//return boolean
		System.out.println(al.remove("java"));
		System.out.println(al);
		System.out.println("list 2: "+al2);
		al.removeAll(al2);//remove all elements which matches al2
		al.add("c");
		System.out.println(al);
		
		System.out.println("list 3: "+al3);
		al.retainAll(al3);//keeps only those elements which matches al3 and removes rest
		System.out.println(al);
	}

}
