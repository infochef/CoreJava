package com.capgemini.oops.dev;

public class LoanAcc extends BankAccount{

	@Override
	public void deposit() {
		System.out.println("Deposit in loan account");
	}

	@Override
	public void withdraw() {
        System.out.println("Withdrawing from loan account");		
	}

	
}
