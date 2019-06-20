package com.capgemini.oops.dev;

public class ConsOverLoading {

	public static void main(String[] args) {
		
		Marvel m1 = new Marvel();
		
		Marvel m2 = new Marvel(78);
		
		Marvel m3 = new Marvel("IronMan");
		
		Marvel m4 = new Marvel(101,"Xman");
		
		Marvel m5 = new Marvel("AntMan",102);
		
	}
	
}
