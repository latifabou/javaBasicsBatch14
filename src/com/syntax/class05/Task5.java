package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature in
		 * the city is ”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = scan.nextLine();
		System.out.println(
				"Which scale temperature do you use in your city?" + "Please enter f for fahrenheit or c for celsius");
		char temperature = scan.next().charAt(0);
		if (temperature == 'f') {
			System.out.println("Please enter f value");
			double value1 = scan.nextDouble();
			double value2 = (value1 - 32) * 5 / 9;
			int value3 = (int) value2;
			System.out.println("The temperature in " + city + " is " + value3 + " celsius");
		} else {
			System.out.println("Please enter c value");
			double value4 = scan.nextDouble();
			double value5 = (value4 * 1.8) + 32;
			int value6 = (int) value5;
			System.out.println("The temperature in " + city + " is " + value6 + " Fahrenheit");
		}

	}

}
