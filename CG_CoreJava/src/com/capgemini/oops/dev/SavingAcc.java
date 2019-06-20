package com.capgemini.oops.dev;

public class SavingAcc extends BankAccount{

	@Override
	public void deposit() {
		System.out.println("Deposit in saving Account");
	}

	@Override
	public void withdraw() {
         System.out.println("Withdrawing from saving Account");		
	}

	
}
