package com.capgemini.dev;

import java.util.Scanner;
class Addition
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two integer");
		int a=sc.nextInt();//4
		int b=sc.nextInt();//3
		int sum=a+b;
		System.out.println("sum is:"+sum);
		
	}
}
