package com.syntax.class07;

import java.util.Scanner;

public class HWClass6 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case..
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		double a = input.nextDouble();
		System.out.println("Please enter operator(+,-,*,/)");
		char operator = input.next().charAt(0);
		System.out.println("Please enter second number");
		double b = input.nextDouble();
		double result = 0;
		if (operator == '+') {
			System.out.println("the Result is " + (a + b));
		}
		else if (operator == '-')
		{
			System.out.println("the Result is " + (a - b));
		}
		else if (operator == '*')
		{
			System.out.println("the Result is " + (a * b));
		}
		else if (operator == '/')
		{
			System.out.println("the Result is " + (a / b));
		}
		else {
			System.out.println("invalid operator");
		}
		// using switch case
		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("invalid operator");
			break;
		}
		System.out.println("the Result is " + result);
	}
}
