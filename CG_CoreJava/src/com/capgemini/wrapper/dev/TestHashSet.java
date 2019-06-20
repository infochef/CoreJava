package com.capgemini.wrapper.dev;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestHashSet {
public static void main(String[] args) {
	
	    LinkedHashSet hs = new LinkedHashSet();
	    Object obj1 = new Object();
	    hs.add("dinga");
	    hs.add(123);
	    hs.add(true);
	    hs.add('a');
	    hs.add(obj1);
	    hs.add("dinga");
	    
	    for(Object obj:hs)
	    {
	    	System.out.println(obj);
	    }
	    
	    
	    
	    
	
	
	
}
	
}
