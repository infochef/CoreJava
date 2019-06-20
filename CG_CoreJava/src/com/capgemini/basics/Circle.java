package com.capgemini.basics;

import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		
		int radius;
		float cir;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		radius = sc.nextInt();
		cir=(float)(2*3.14*radius);
		
		System.out.println("Circumference of the circle"+cir);
	}
}