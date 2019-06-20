package com.capgemini.wrapper.dev;
import java.util.ArrayList;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Object obj = new Object();
		//add the elements in arraylist
		list.add(1,"dinga");
		list.add(101);
		list.add("dinga");
		list.add(null);
		list.add(null);
		list.add(true);
		list.add(56.89);
		list.add('d');
		list.add(obj);

		//retrive the values
	  for(int i=0;i<list.size();i++)
	  {
		  System.out.println(list.get(i));
	  }
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
