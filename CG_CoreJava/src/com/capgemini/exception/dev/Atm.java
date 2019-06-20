package com.capgemini.exception.dev;

public class Atm {

	public static void deposit(double d, int pin)
	{
		
		if(pin==0123)
		{
		double bal = d;
		System.out.println("balance = "+d);
		}
		else
		{
			RuntimeException e1 = new RuntimeException("Pin is Incorrect");
			throw e1;
		}
		
	}
	
	public static void main(String[] args) {
		
		deposit(70000,012);
		
		
	}
}
