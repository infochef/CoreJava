package com.capgemini.dev;

import java.util.Scanner;

public class CalculatingMachine {

	
	public static int addition(int x,int y)
	{
		int z = x+y;
		return z;
	}
	public static int subtraction(int x,int y)
	{
		int z;
		if(x>y) {
		z = x-y;
		}
		else
		{
			z = y-x;
		}
		return z;
		
	}
	public static int multiplication(int x,int y)
	{
		int z;
		z = x*y;
		return z; 
	}
	public static double division(int x,int y)
	{
		int z = x/y;
		return z;
	}
	public static double modulas(int x,int y)
	{
		double z = x%y;
		return z;
	}

	public static void main(String[] args) {

		System.out.println("Main Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		int result1 = addition(x, y);
		int result2 = subtraction(x, y);
		int result3 = multiplication(x, y);
		double result4 = division(x, y);
		double result5 = modulas(x, y);
		
		System.out.println("Additon = "+result1);
		System.out.println("subtraction = "+result2);
		System.out.println("multiplication = "+result3);
		System.out.println("division = "+result4);
		System.out.println("modulas = "+result5);
		
		System.out.println("Main ended");
		
		

	}

}
