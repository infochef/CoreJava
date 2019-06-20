package com.capgemini.thread.dev;

public class ThreadLamda {

	public static void main(String[] args)  {
		
		Runnable ref1 = ()->
		                {
		                	Thread t1 = Thread.currentThread();
		                	System.out.println(t1.getName());
		                	System.out.println(t1.getId());
		                	System.out.println(t1.getPriority());
		                	for(int i=0;i<5;i++)                                                                                                                                                                                                                                                                                                                                                                                                     
		                	{
		                		try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
		                		System.out.println("First task");
		                	}
		                };
		
		Runnable ref2 = ()->
		                {
		                	
		                	Thread t1 = Thread.currentThread();
		                	try {
								t1.join(6000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                	System.out.println(t1.getName());
		                	System.out.println(t1.getId());
		                	System.out.println(t1.getPriority());
		                	for(int i=0;i<5;i++)
		                	{
		                		System.out.println("Second task");
		                	}
		                };
		
		
		Thread t1 = new Thread(ref1);
		t1.start();
		
		Thread t3 = Thread.currentThread();
		System.out.println(t3.getName());
		System.out.println(t3.getId());
		System.out.println(t3.getPriority());
		
		
		Thread t2 = new Thread(ref2);
		t2.start();
		
		
		
	}
	
}
