package com.capgemini.oops.dev;

public class TestHOverRiding {
	public static void main(String[] args) {
		
		Samsung s = new Samsung();
		s.showHomePage();
		
		MI mi = new MI();
		mi.showHomePage();
		
		Moto moto = new Moto();
		moto.showHomePage();
	}
}
