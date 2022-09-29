package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		int sum = 0;

		int[] i = { 10, 20, 30, 40, 50, 60 };
		for (int j : i) {
			sum = sum + j;

		}
		System.out.println("Sum of all elements in this array is :" + sum);
	}

}
