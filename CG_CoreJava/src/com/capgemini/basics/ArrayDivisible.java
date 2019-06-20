package com.capgemini.basics;

public class ArrayDivisible {

	public static void main(String args[]){  

		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%2!=0){  
				System.out.println(a[i]);  
			}  
		}  
		System.out.println("Divisible by 5:");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%5==0){  
				System.out.println(a[i]);  
			}  
		}  
	}}  


