package com.capgemini.exception.dev;

public class TestThrow {

	public static void checkNumber(int i) 
	{
		if(i<=0)
		{
			RuntimeException e = new RuntimeException("Number is less then 1");
			throw e;
		}
		else
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		checkNumber(-2);
		
	}
	
	
	
}
