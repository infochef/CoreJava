package com.capgemini.oops.dev;

 public class Cust {

	int cust_id = 101;
	String cust_name ="Dinga"; 
	long acc_no = 1010;
	
	
	protected void showDetailsOfCust()
	{
		System.out.println("Account number = "+acc_no);
		System.out.println("Customer name = "+cust_name);
		System.out.println("Customer Id = "+cust_id);
	}
	
	
}
