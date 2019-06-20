package com.capgemini.thread.dev;

public class Moblie {

public int imei;
public String brand;
public double price;

public  Moblie(int imei, String brand, double price)
{
	this.imei=imei;
	this.brand=brand;
	this.price=price;
}
@Override
public String toString()
{
	return imei+" "+brand+" "+price;
}
	public int hashcode()
	{
		System.out.println("calling hashcode");
		return imei;
	}
	@Override
public boolean equals(Object ob)
{
System.out.println("calling equals");
Moblie m = (Moblie)ob;
return this.imei == m.imei;
}
}

