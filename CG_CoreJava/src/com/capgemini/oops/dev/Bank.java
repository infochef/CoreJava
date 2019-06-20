package com.capgemini.oops.dev;

public class Bank {
	
	String name;
	long no_of_emp;
	String add;
	Cust c1;
	
	Bank(String name,long no_of_emp,String add)
	{
		this.name = name;
		this.no_of_emp = no_of_emp;
		this.add = add;
		c1 = new Cust();
	}
	public void showDeatils()
	{
		System.out.println("Name of bank : "+name);
		System.out.println("Number of emp : "+no_of_emp);
		System.out.println("Address of Bank : "+add);
	}
}
