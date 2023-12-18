package com.queue;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.add(12);
//		pq.add(67);
//		pq.add(199);
//		pq.add(34);
//		pq.add(32);
//		pq.add(67);
		
		pq.add(45);
		pq.add(23);
		pq.add(12);
		pq.add(10);
		//pq.add(null);
		pq.add(10);
		
		System.out.println(pq);
	}

}
