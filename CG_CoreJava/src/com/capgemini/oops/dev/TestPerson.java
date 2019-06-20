package com.capgemini.oops.dev;

public class TestPerson implements Person1 , Person2{

	@Override
	public void talk() {
		System.out.println("talking");
	}

	@Override
	public void booze() {
		System.out.println("boozing");		
	}

	@Override
	public void dance() {
		System.out.println("dancing");
		
	}

	@Override
	public void chat() {
		System.out.println("chating");
		
	}

	@Override
	public void run() {
		System.out.println("running");
		
	}

	@Override
	public void eat() {
		System.out.println("eating");
		
	}

	@Override
	public void walk() {
		System.out.println("walking");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
