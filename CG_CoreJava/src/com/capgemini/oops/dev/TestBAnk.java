package com.capgemini.oops.dev;

public class TestBAnk {

	public static void main(String[] args) {
		
		BankDetails bd = new BankDetails();
        
		bd.setAcc_num(10001);
		bd.setBal(10000);
		
	int acnum = bd.getAcc_num();
	double bal = bd.getBal();
	
	System.out.println("Account number = "+acnum);
	System.out.println("Balance  = "+bal);
		
		
	}
}
