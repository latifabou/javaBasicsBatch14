package com.syntax.class07;

public class Task3 {

	public static void main(String[] args) {
		// Print only odd numbers from 100 to 1. (2 different ways)
		// first way
		System.out.print("First way:");
		int i = 100;
		while (i >= 1) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i--;

		}
		System.out.println();
		// Second way
		System.out.print("Second way:");
		int i1 = 99;
		while (i1>= 1) {
			
				System.out.print(i1 + " ");
				i1-=2;
			}
			

		
		
		
		
	}

}
