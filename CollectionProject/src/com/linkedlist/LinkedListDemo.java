package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
		
		LinkedList<String> itcomp= new LinkedList<>();
		
		//System.out.println(itcomp.getFirst()); // throws NoSuchElementException
		System.out.println(itcomp.peek()); // null
		
		//System.out.println(itcomp.remove());// throws NoSuchElementException
		System.out.println(itcomp.poll()); // null
		
		
		// add method 
		
		itcomp.add("HCL");
		itcomp.add("TCS"); // add at the last
		itcomp.add(null);
		itcomp.add("TCS");
		
		System.out.println(itcomp);
		
		itcomp.addFirst("Infosys");
		
		System.out.println(itcomp);
		
		itcomp.add(1, "Dell");
		System.out.println(itcomp);
		
		// retreive 
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Element :"+itcomp.element());
		System.out.println("Element :"+itcomp.getFirst());
		System.out.println("Element :"+itcomp.peek());
		System.out.println("Element :"+itcomp.peekFirst());
		
		System.out.println(itcomp.get(2));
		
		System.out.println("From last :"+itcomp.getLast());
		System.out.println("From last :"+itcomp.peekLast());
		
		// deletion
		System.out.println("-----------------------------------------");
		
		System.out.println(itcomp.poll());
		   // pollFirst, remove, removeFirst
		System.out.println(itcomp);
		
		System.out.println(itcomp.remove(2));
		System.out.println(itcomp.remove("HCL"));
		System.out.println(itcomp);
		
		System.out.println(itcomp.removeLast());
		System.out.println(itcomp.removeLastOccurrence("HCL"));
		
		System.out.println("-------------------------------------------");
		// pollLast
		
		itcomp.addFirst("Campgemini");// return void
		System.out.println(itcomp.offerFirst("Genpact"));// return boolean
		
		System.out.println(itcomp);
	}

}
