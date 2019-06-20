package com.capgemini.lib;

public class TestBuffer {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("dinga");
		
		s1 = s1.append("dingi");
		System.out.println(s1);
		
		s1 = s1.insert(0,78);
		System.out.println(s1);
		
		s1 = s1.delete(2,7);
		System.out.println(s1);
		
		s1 = s1.replace(1,5,"xyza");
		System.out.println(s1);
		
	}
}
