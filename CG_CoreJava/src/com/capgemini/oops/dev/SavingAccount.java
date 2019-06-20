package com.capgemini.oops.dev;

public class SavingAccount implements Account1{

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from saving Account");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit in saving account");
	}

}
