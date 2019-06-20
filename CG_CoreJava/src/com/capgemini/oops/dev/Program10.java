package com.capgemini.oops.dev;

public class Program10 {

	public static void main(String[] args) {
		
		Account a1 = new Account(101, "Dinga", 6700.00);
		
		Account a2 = new Account(102, "Dingi", 3000);
		
		Account a3 = new Account(103, "Pinka", 670);
		
		Account a4 = new Account(104, "Pinky", 5000);
		
		a1.showDetails();
		System.out.println("******************");
		a2.showDetails();
		System.out.println("*****************");
		a3.showDetails();
		System.out.println("*****************");
		a4.showDetails();
		
		
		
		
	}
	
}
