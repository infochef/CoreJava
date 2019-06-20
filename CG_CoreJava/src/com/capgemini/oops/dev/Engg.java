package com.capgemini.oops.dev;

public class Engg {

	
	public void boozing()
	{
		System.out.println("One bottle");
	}
    int boozing(int a)
	{
		System.out.println("bottle = "+a);
		return a;
	}
	public void boozing(String s)
	{
		System.out.println("Brand ="+s);
	}
	public void boozing(int a,String s)
	{
		System.out.println( a+" number of bottle of "+s);
	}
	public void boozing(String s, int a)
	{
		System.out.println(a+" number of bottle of "+s);
	}

	public static void main(String[]args)
	{
		Engg e = new Engg();
		e.boozing();
		e.boozing(20);
		e.boozing("Black And White");
		e.boozing(10, "Teachers");
		e.boozing("Jack Daniels", 25);
	}
}
