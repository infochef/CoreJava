/*
 *this method is used to store employee details
 */
package com.capgemini.thread.dev;
 

public class Employee
{
	public int id;
	public String name;
	public double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
		

	}



