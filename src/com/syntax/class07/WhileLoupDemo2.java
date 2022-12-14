package com.syntax.class07;

public class WhileLoupDemo2 {

	public static void main(String[] args) {
		// print all numbers from 1 to 10
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println(" ----------------  ");
		// print all numbers from 10 to 25
		int a = 10;
		while (a <= 25) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println(" ----------------  ");
		// print all numbers from 10 to 1
		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println(" ----------------  ");
		// print all numbers from 50 to 20
		// print all even numbers from 1 to 20
		int c = 2;
		while (c <= 20) {
			System.out.print(c + " ");
			c += 2;
		}
		System.out.println("Another way");
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		/*int i = 1;   Just because i changed the location of my increment,
		 * Result:infinite loop running without output,with value of 1.
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				i++;
			}
			*/
		
		/*int i = 2;   Just because i changed the location of my increment,
		 * Result:printing only value 2, then infinite loop running without output,with value of 3.
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				i++;
			}
			*/
		
	}

}
