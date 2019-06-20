package com.capgemini.dev.pkg;

public interface Demo {

	public static void click()
	{
		System.out.println("Click  method");
	}
	public default void check()
	{
		System.out.println("Check method");
	}
}
