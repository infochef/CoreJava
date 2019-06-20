package com.capgemini.dev.pkg;

public class TestSingleton {

	static Singleton s2;
	
	public static void main(String[] args) {
	
		
		Singleton s1 = Singleton.createAccount();
		Singleton s2 = Singleton.createAccount();
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
}
