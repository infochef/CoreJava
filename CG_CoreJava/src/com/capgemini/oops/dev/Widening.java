package com.capgemini.oops.dev;

public class Widening {

	public static void main(String[] args) {
		
		double d = 40.90;
		int i = 67;
		char c = 'a';
		
		int c1 = c;
		int d1 = (int)d;
		byte b = (byte)i;
		char r = (char)i;
		
		System.out.println(r);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(b);
	}
	
	
}
