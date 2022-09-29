package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] a = { 50, 200, 80, 470 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i]; 
			}
		}
System.out.println("the largest element is :"+max);
	}

}
