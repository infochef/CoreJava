package com.capgemini.lib;

public class Product {

	int product_id ;
	String product_name;
	double product_price;
	
	Product(int product_id,String product_name,double product_price)
	{
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	@Override
	public String toString()
	{
		return product_name;
	}
	
	@Override
	public int hashCode()
	{
		return (int)product_price;
	}
	
	@Override
	public boolean equals(Object obj)
	{
	
		return true;
	}
	
}
