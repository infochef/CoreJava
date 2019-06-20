package com.capgemini.oops.dev;

public class MainClass {
public static void main(String[] args) {
	
	BankAccount bank;
	
	bank = new LoanAcc();
	bank.deposit();
	bank.withdraw();
	
	bank = new SavingAcc();
	bank.withdraw();
	bank.deposit();
	
	
	
}
}
