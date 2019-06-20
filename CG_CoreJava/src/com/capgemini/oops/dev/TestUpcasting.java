                                                          package com.capgemini.oops.dev;

public class TestUpcasting {

	public static void main(String[] args) {
		
		//UpCasting
		//Tree t = new Apple();
		
		/*t.givesFruit();
		t.grow();
		System.out.println(t.a1);
		System.out.println(t.d1);*/
		
		Tree t = new Tree();
		
		if(t instanceof Apple)
		{
		Apple a1 = (Apple)t;
		}
		else
		{
			System.out.println("t ref is not upcatsed");
		}
		
		
		
		//DownCasting
	    /*Apple a = (Apple)t;
	    a.color();
	    a.taste();
	    System.out.println(a.i2);
	    System.out.println(a.d2);
	    
	    a.givesFruit();
	    a.grow();
	    System.out.println(a.a1);
		System.out.println(a.d1);
	    
	    
	    */
	    
	    
		
		
		
		
		
	}
	
}
