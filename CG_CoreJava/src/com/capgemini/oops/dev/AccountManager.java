package com.capgemini.oops.dev;

public class AccountManager {

	Account1 a1;
	public Account1 selectAccount(char a)
	{
		if(a=='s')
		{
			a1 = new SavingAccount();
			return a1;
		}
		a1 = new LoanAccount();
		return a1;
	}
}
