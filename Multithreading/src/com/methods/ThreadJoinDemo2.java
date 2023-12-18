package com.methods;

public class ThreadJoinDemo2  extends Thread{
	
	public static void main(String[] args) {
		
		Thread t1= new Thread()
				{
			      public void run()
			      {
			    	  //t3.join();
			    	  
			    	  for(int i=1;i<=5;i++)
			  		{
			  			System.out.println(Thread.currentThread().getName()+" :"+i);
			  			try {
			  				Thread.sleep(500);
			  			} catch (InterruptedException e) {
			  				System.out.println(e);
			  			}
			  			
			  			
			  		}
			  		System.out.println(Thread.currentThread().getName()+" has finished..........");
			      }
			
				};
				
		Thread t2= new Thread()
				{
			     
			      public void run()
			      	      
			      {
			    	  try {
						t1.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	  for(int i=11;i<=15;i++)
			  		{
			  			System.out.println(Thread.currentThread().getName()+" :"+i);
			  			try {
			  				Thread.sleep(500);
			  			} catch (InterruptedException e) {
			  				System.out.println(e);
			  			}
			  			
			  			
			  		}
			  		System.out.println(Thread.currentThread().getName()+" has finished..........");
			      }
			
				};	
				
		Thread t3= new Thread()
				{
			      public void run()
			      {
			    	  try {
						t1.join();
						 t2.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	 
			    	  for(int i=21;i<=25;i++)
			  		{
			  			System.out.println(Thread.currentThread().getName()+" :"+i);
			  			try {
			  				Thread.sleep(500);
			  			} catch (InterruptedException e) {
			  				System.out.println(e);
			  			}
			  			
			  			
			  		}
			  		System.out.println(Thread.currentThread().getName()+" has finished..........");
			      }
			
				};			
				
		t1.start();
		t2.start();
		t3.start();
	}

}
