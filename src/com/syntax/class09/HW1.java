package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		
		/*  Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		// classic for loop
		String[] cars = new String[6];
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2] = "Audi";
		cars[3] = "BMW";
		cars[4] = "Nissan";
		cars[5] = "Ford";

	for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);}
	
		System.out.println("=================================");
		
	// for each loop
	String []cars1= { "Toyota","Honda","Audi","BMW","Nissan","Ford"};
	for(String cars2:cars1) {
		System.out.println(cars2);
	}
	
	
	
	
	
	
}
	}
