package com.syntax.class08;

public class HW3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		//First way
		System.out.println("======First way=====");
		for (int a = 20; a >= 1; a--) {
			if (a % 2 == 0) {
				System.out.print(a+ " ");
			}
		}

	//Second way
		System.out.println();
		System.out.println("======Second way=======");
		for(int b=20;b>=1;b-=2) {
			System.out.print(b+" ");
		}
		
	}

}
