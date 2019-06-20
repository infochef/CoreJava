package com.capgemini.dev.pkg;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Run r = ()->
		{
			System.out.println("im click method");
		};
		
		r.click();
		
		System.out.println("Main method ended");
		
		
		
		
	}
}
