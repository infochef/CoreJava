package com.capgemini.thread.dev;

public class TestThreadThree {

	public static void main(String[] args) {
		
		ThreadThree t3 = new ThreadThree();
		Thread t1 = new Thread(t3);
		t1.start();
		
		
	}
}
