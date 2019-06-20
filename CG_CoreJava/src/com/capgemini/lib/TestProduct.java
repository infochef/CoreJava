package com.capgemini.lib;

public class TestProduct {

	public static void main(String[] args) {
		
	Product p = new Product(101, "Mobile", 10000);
	
	String s = p.toString();
	
	int i = p.hashCode();

	
	
	System.out.println();
	
	System.out.println("Name of product = "+s);
	System.out.println("Price of Product = "+i);
		
		
	}
}
