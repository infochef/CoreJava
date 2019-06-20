package com.capgemini.oops.dev;

public class Composition {

	public static void main(String[] args) {
		
		Bank b1 = new Bank("ICICI", 57584l,"BTR");
		b1.c1.showDetailsOfCust();
		b1.showDeatils();
				
		
		
	}
}
