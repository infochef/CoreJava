package com.capgemini.oops.dev;

public class Program6 {

	public static void main(String[] args) {
		Program5 p1 = new Program5();
		Program5 p2 = p1;
		p1.id = 56;
		p1.age = 90;
		System.out.println(p2.id);
		System.out.println(p2.age);
		System.err.println(p1.id);
		System.err.println(p1.age);
	}
}
