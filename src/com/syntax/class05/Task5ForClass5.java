package com.syntax.class05;

import java.util.Scanner;

public class Task5ForClass5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month = input.nextLine();
		if ((month.equals("March")) || (month.equals("April")) || (month.equals("May"))) {
			System.out.println("you were born on Spring");
		} else if ((month.equals("June")) || (month.equals("July")) || (month.equals("August"))) {
			System.out.println("you were born on Summer");
		} else if ((month.equals("September")) || (month.equals("October")) || (month.equals("November"))) {
			System.out.println("you were born on Fall");
		} else if ((month.equals("December")) || (month.equals("January")) || (month.equals("February"))) {
			System.out.println("you were born on Winter");
		}else
			System.out.println("Invalid month");
	}
	

}
