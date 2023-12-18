package com.queue;
import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueDemo2 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add("devops");
		pq.add("java");
		pq.add("angular");
		pq.add("springboot");
		
		System.out.println(pq);
		
		System.out.println(pq.poll());//1st
		System.out.println(pq);
		System.out.println(pq.peek());//1st
		
		System.out.println(pq);
		System.out.println(pq.offer("c++"));
		System.out.println(pq);
	}

}
