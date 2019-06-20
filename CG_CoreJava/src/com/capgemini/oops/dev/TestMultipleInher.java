package com.capgemini.oops.dev;

public class TestMultipleInher {

	public static void main(String[] args) {
		
		Person1 p1 = new TestPerson();
		p1.eat();
		p1.sleep();
		p1.run();
		p1.walk();
		
		Person2 p2 = new TestPerson();
		p2.booze();
		p2.chat();
		p2.dance();
		p2.talk();
		
		
		
		
	}
	
}
