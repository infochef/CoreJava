package com.capgemini.oops.dev;

public class Marvel {

	Marvel()
	{
		System.out.println("This is Zero Arg Const");
	}
	Marvel(int a)
	{
		System.out.println("This is Single arg const");
	}
	Marvel(int a,String b)
	{
		System.out.println("This is Double arg const");
	}
	Marvel(String a)
	{
		System.out.println("This is Single String arg const");
	}
	Marvel(String a,int b)
	{
		System.out.println("This is double arg const but diff order");
	}	
}
