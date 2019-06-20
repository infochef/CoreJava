package com.capgemini.lib;

public class StringCl {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = new String("j2ee");
		String s3 = "java";
		
		int i1 = s1.hashCode();
		int i2 = s2.hashCode();
		int i3 = s3.hashCode();
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		String ss1 = s1.toString();
		String ss2 = s2.toString();
		String ss3 = s3.toString();
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);
		
		System.out.println(b1);
		System.out.println(b2);
		
				
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}
}
