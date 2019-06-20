package com.capgemini.oops.dev;

public class Avenger {
	
	long year;
	String name;
	String super_power;
	
	Avenger()
	{
		this(1000l,"Thor","Thunder");
		System.out.println("This is calling Constructor");
	}
	Avenger(long year,String name,String super_power)
	{
		this("IronMan",2000l,"Engg");
		this.name = name;
		this.year = year;
		this.super_power = super_power;
		System.out.println("Name of Avenger = "+this.name);
		System.out.println("Year of Avenger = "+this.year);
		System.out.println("Super power of Avenger = "+this.super_power);
	}
	
	Avenger(String name,long year, String super_power)
	{
		System.out.println("Name of Avenger = "+this.name);
		System.out.println("Year of Avenger = "+this.year);
		System.out.println("Super power of Avenger = "+this.super_power);
	}
}
