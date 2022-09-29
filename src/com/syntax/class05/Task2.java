package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("What's the mortgage rate");
		double mortgageRate = scan.nextDouble();
		if (mortgageRate < 4.5) {
			System.out.println("User will consider buying");
			System.out.println("What's the price of the house");
			int priceOfTheHouse = scan.nextInt();
			if (priceOfTheHouse > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}

		}

		else {
			System.out.println("User will not buy a house");
		}
	}

}
