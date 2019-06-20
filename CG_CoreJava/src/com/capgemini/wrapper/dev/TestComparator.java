package com.capgemini.wrapper.dev;

import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		TreeSet ts = new TreeSet(d);
		ts.add("Alex");
		ts.add("malya");
		ts.add("smith");
		ts.add("dinga");
		ts.add("pinki");
		ts.add("urvashi");
		ts.add("indu");
		
		
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
		

		
		
		
	}
}
