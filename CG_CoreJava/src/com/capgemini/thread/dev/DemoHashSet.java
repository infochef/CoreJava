package com.capgemini.thread.dev;

import java.util.HashSet;

public class DemoHashSet {
	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		Moblie m1=new Moblie(123,"Apple",50000);
		Moblie m2=new Moblie(123,"Apple",50000);
		hs.add(m1);
		hs.add(m2);
		for(Object ob : hs)
		{
			System.out.println(ob);
		}
		
	}

}
