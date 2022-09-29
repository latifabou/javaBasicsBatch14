package javaFirstGroupProject;

import java.util.Scanner;

public class CodingTask02 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("How many countries have you visited");

		int num = input.nextInt();
		String[] countries = new String[num];
		String[] capital = new String[num];
		for (int i = 0; i < num; i++) {

			System.out.println("Please entre country'name:" + (i + 1));
			countries[i] = input.next();
			System.out.println("Please entre capital'country name:" + (i + 1));
			capital[i] = input.next();
		}
		
		System.out.println("Countries that you visited are: ");
		for (int i = 0; i < num; i++) {
			System.out.print(countries[i] + " " + "capital: " + capital[i]);
			System.out.println();
		}

	}

}
