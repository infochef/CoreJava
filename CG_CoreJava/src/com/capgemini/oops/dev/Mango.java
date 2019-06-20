package com.capgemini.oops.dev;

public class Mango extends Fruit {
	//subclass constructor
	Mango(int a)
	{
		super(a);//calls the constructor of fruit class
		System.out.println("This is subclass const");
	}
	public void tasteOfMango()
	{
		System.out.println("Yummy");
	}
}
