package com.capgemini.lib;

public class Account {

	double balance = 5000;
	public synchronized void withdraw(int amount)
	{
		
		if(amount>balance)
		{
			System.out.println("wait for deposit");
			try {
			    wait(5000);
			    balance = balance-amount;
			    }
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			balance = balance-amount;
		}
		System.out.println("Transaction Completed ");
		System.out.println("Balance : "+balance);
	}
	public synchronized void deposit(int amt)
	{
		System.out.println("Deposition amt");
		System.out.println("Balance Updated");
		balance = balance+amt;
		System.out.println("balance : "+balance);
		notify();
	}
}
