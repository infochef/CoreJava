package com.capgemini.wrapper.dev;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {
		
		LinkedList queue = new LinkedList();
		queue.add("dinga");
		queue.add("alex");
		queue.add("martin");
		queue.add("pinki");
		queue.add("urvashi");
		
		Iterator it = queue.iterator();
		
		  
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		it.remove();
		}
		
		System.out.println(queue.size());
		
		
		/*
		System.out.println(queue.size());

		for(int i=0;i<queue.size();i++)
		{
			System.out.println(queue.get(i));
		}
		while(queue.isEmpty()!=true)
		{
		System.out.println(queue.poll());
		}
		
		System.out.println(queue.size());

		
*/		
		
		
	}
}
