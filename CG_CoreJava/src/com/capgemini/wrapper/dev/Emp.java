package com.capgemini.wrapper.dev;

public class Emp {

	int id;
	String name;
	double sal;
	
	
	Emp(int id,String name,double sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString()
	{
		return id+", "+name+", "+sal;
	}
	
	
	
	
}
