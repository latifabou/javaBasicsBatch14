package com.syntax.class07;

public class DoWhileDemo {

	public static void main(String[] args) {

		int num = 1;
		while (num <= 3) {
			System.out.println("I am while loop");
			num++;
		}
		System.out.println(" -------------------  ");
		int num1 = 1;
		do {
			System.out.println("I am do while loop");
			num1++;
		} while (num1 <= 3);
		System.out.println("=======change of condition========");
		// change of condition
		int num2 = 1;
		while (num2 >= 3) {
			System.out.println("I am while loop");
			num2++;
		}
		int num3 = 1;
		do {
			System.out.println("I am do while loop");
			num3++;
		} while (num3 >= 3);

	}

}
