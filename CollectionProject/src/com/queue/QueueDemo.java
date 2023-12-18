package com.queue;

class MyQueue {
	int front, rear;
	int size;
	int []arr;
	
	public MyQueue() {
		
	}

	public MyQueue(int size) {
		front=0;
		rear=0;
		this.size=size;
		arr= new int[this.size];
	}
	
	public void insert(int data) {
		if(rear<size) {
			arr[rear]=data;
			rear++;
			System.out.println("Element inserted");
		}
		else {
			System.out.println("Queue is full");
		}
	}
	public void delete() {
		int temp;
		if(rear>front) {
			System.out.println("Element deleted: "+arr[front]);
			for(temp=front;temp<rear-1;temp++) {
				arr[temp]=arr[temp+1];
			}
			arr[--rear]=0;
		}
		else {
			System.out.println();
		}
	}
	void display() {
		if(rear>front) {
			for(int i=front;i<rear;i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Queue is empty");
		}
	}
}
public class QueueDemo{
	public static void main(String[] args) {
		MyQueue q = new MyQueue(5);
		q.delete();
		
		q.insert(78);
		q.insert(15);
		q.insert(33);
		q.insert(89);
		q.insert(23);
		
		q.display();
		
		q.insert(20);
		q.delete();
	}
	
}