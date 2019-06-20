package com.capgemini.oops.dev;

public class TestAbstraction {

	public static void main(String[] args) {
		
		AccountManager am = new AccountManager();
		Account1 a1 = am.selectAccount('u');
		a1.deposit();
		a1.withdraw();
		
		
	}
}
