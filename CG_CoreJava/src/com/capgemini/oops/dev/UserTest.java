package com.capgemini.oops.dev;

public class UserTest implements User{

	@Override
	public void run() {
		System.out.println("Run method");
	}

	@Override
	public void click() {
		System.out.println("Click method");
	}

}
