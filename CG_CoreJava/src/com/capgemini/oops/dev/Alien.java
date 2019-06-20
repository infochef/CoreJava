package com.capgemini.oops.dev;

public class Alien {
	
	int a_id;
	String a_name;
	String a_color;
	
	Alien(int a_id, String a_name, String a_color)
	{
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_color = a_color;
	}
	
	public void showDetailsOfAlien()
	{
		System.out.println("id of Alien : "+a_id);
		System.out.println("Name of Alien : "+a_name);
		System.out.println("Color of Alien : "+a_color);
	}

}
