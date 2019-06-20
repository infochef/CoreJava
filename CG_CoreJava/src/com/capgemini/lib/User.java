package com.capgemini.lib;
public class User {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		Runnable r1 = ()->
		{
			a1.withdraw(8000);
		};
		
		Runnable r2 = ()->
		{
			a1.deposit(5000);
		};
		
	    Thread t1 = new Thread(r1);
	  
	    t1.start();
	    
	    Thread t2 = new Thread(r2);
	  
	    t2.start();
		
	    System.gc();
	}
}
