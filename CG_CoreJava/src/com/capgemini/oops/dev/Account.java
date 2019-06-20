package com.capgemini.oops.dev;

public class Account {

	int id;
	String name;
	double sal;
	
    Account(int a,String b,double c)
	{
		id = a;
		name = b;
		sal = c;	
	}
	public void showDetails()
	{
		System.out.println("Id ="+id);
		System.out.println("Name ="+name);
		System.out.println("Salary ="+sal);
	}

}
