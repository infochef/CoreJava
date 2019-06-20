package com.capgemini.exception.dev;
public class TestFinally {

	
	public void click() throws Exception//it will throws the excptn to calling method
	{
		Thread t = new Thread();
		t.wait();
	}
	
	
	public void run() throws Exception //it will throws the excptn to calling method
	{
		click();
	}
	
	public static void main(String[] args)  
	{
		TestFinally t = new TestFinally();
		try
		{
		t.run();
		}
		catch(Exception e)
		{
			System.out.println("oops Exception Occured");
		}
			}
}
