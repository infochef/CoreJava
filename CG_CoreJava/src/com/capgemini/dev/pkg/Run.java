package com.capgemini.dev.pkg;

public interface Run {

	public void click();
	
	public static void check()
	{
		System.out.println("hi");
	}
	
	public default void run()
	{
		System.out.println("hello");
	}
	
}
