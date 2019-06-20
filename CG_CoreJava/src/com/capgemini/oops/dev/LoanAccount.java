package com.capgemini.oops.dev;

public class LoanAccount implements Account1{

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from loan Account");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit in loan account");
	}

}
