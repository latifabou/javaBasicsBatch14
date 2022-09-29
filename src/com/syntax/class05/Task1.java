package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("do you have a diploma");
		boolean answer = scan.nextBoolean();
		if (answer == true) {
			System.out.println("congratulations");
			System.out.println("Please enter you gpa score");
			double gpaScore = scan.nextDouble();
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied hard");
			}
		}

		else {
			System.out.println("Please try to get a degree");
		}

	}
}
