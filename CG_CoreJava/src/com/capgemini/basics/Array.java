package com.capgemini.basics;
import java.util.*;

public class Array {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of primes ");
		int x = scan.nextInt();
		int[] prime = new int[x];
		int div=2,hold=2;
		int c=0;
		while (prime[x-1]==0)
		{
			for(int a=2; div>a;a++)
			{
				if(div>a && div%a==0)
					a=div;
				else if(div==(a-1))
					hold=div;
			}
			if(div==2||hold!=prime[c-1])
			{
				prime[c]=hold;
				c++;
			}
			div++;
		}
		for(int f =0; f<x;f++)
			System.out.print(" "+prime[f]+" ");
	}
}

