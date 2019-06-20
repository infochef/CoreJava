package com.capgemini.wrapper.dev;

public class DimensionalArray {

	public static void main(String[] args) {

		int[][]ar = {{12,13,14},{45,3,4,2,2},{3,2,1,1,}};
		
		ar[0][0] = 16;
		ar[0][1] = 15;
		ar[0][2] = 14;
		ar[1][0] = 13;
		ar[1][1] = 12;
		ar[1][2] = 11;
		
		
		System.out.println(ar[1][2]);
	}
	
}
