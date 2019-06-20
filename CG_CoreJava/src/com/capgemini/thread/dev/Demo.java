package com.capgemini.thread.dev;

public class Demo extends Thread{
	
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+", ");
		}
	}
	public static void main(String[] args)
	{
		
		
		Demo d = new Demo();
		d.start();
		
	}
	
	
	
	
}
