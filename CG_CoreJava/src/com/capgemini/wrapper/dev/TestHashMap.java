package com.capgemini.wrapper.dev;
import java.util.ArrayList;
import java.util.HashMap;
public class TestHashMap {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		HashMap  hs = new HashMap();
		Object obj = new Object();
		hs.put(1,"dinga");
		hs.put(null,"dingi");
		hs.put("suprit","pinki");
		hs.put(obj,"pinka");
		hs.put(1,"manga");
		
		System.out.println(hs.get(1));
		System.out.println(hs.get(obj));
		System.out.println(hs.get(null));
		System.out.println(hs.get(4));
		System.out.println(hs.get("suprit"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
