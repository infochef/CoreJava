package com.capgemini.oops.dev;

public class Program1 {

	static int i = 90;
	static double d = 45;
	
	public static void run()
	{
		System.out.println("This is run() of Program1");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		System.out.println("Value of i = "+i);
		System.out.println("Value of d = "+d);
		run();
		System.out.println("Main Method ended");
	}

}
