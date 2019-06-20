package com.capgemini.thread.dev;

public class TestThread {

	public static void main(String[] args){
		
		ThreadOne t1 = new ThreadOne();
		t1.start();
		
		System.out.println("Hello");
		
		ThreadTwo t2 = new ThreadTwo();
		t2.start();
		
		
		
	}
}
