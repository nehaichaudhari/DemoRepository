package com.methods;

public class ThreadDaemon implements Runnable{
	

	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+" is daemon thread");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" is user thread");
			
		}


	}
	
	public static void main(String[] args) {
		
		ThreadDaemon r1 = new ThreadDaemon();
		ThreadDaemon r2= new ThreadDaemon();
		
		Thread t;
		t= new Thread(r1,"First");
		t.start();
		
		t=new Thread(r2,"Service");
		t.setDaemon(true);
		t.start();
		//t.setDaemon(true);
		
	}


}
