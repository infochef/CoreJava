package com.capgemini.lib;


public class Demo {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		String s3 = obj3.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int i1 = obj1.hashCode();
		int i2 = obj2.hashCode();
		int i3 = obj3.hashCode();
		
		boolean b1 = obj1.equals(obj2);
		System.out.println(b1);
		
		boolean b2 = obj1.equals(obj3);
		System.out.println(b2);
	
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
	}
	
}
