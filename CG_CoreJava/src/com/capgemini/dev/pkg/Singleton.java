package com.capgemini.dev.pkg;

public class Singleton {

	static Singleton s1;
	private Singleton()
	{
		System.out.println("Object Created");
	}
	
	//Factory method
	public static  Singleton createAccount()
	{
		if(s1==null)
		{
		s1 = new Singleton();
		}
	     return s1;
	}	
}
