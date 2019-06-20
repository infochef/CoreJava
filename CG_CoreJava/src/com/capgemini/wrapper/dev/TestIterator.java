package com.capgemini.wrapper.dev;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestIterator {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		q.add("smith");
		q.add("dinga");
		q.add("pinki");
		q.add("alex");
		q.add("manga");
		
		Iterator it = q.iterator();
		
		System.out.println(q.size());
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(q.size());
		
		
		
		
		
	}
	
}
