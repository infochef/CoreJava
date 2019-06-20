package com.capgemini.wrapper.dev;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TreeSetLamda {

	public static void main(String[] args) {
		
		/*Comparator cmp =(Object obj1,Object obj2)->
		{
			int i3;
			int i1 =(int)obj1;
			int i2 =(int)obj2;
			i3 = i1-i2;
			return i3;
		};*/
		PriorityQueue ts = new PriorityQueue();
		ts.add("Alex");
		ts.add("malya");
		ts.add("smith");
		ts.add("dinga");
		ts.add("pinki");
		ts.add("urvashi");
		ts.add("indu");
		
		while(ts.isEmpty()!=true)
		{
			System.out.println(ts.poll());
		}
		
		
		
		
		
		
		
	}
	
	
}
