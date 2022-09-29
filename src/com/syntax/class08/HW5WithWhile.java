package com.syntax.class08;

import java.util.Scanner;

public class HW5WithWhile {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
	
		Scanner input = new Scanner(System.in);
		String name;
		int time = 1;

		while (time <= 3) {
			System.out.println("what's your name?");
			name = input.nextLine();
			time++;
			System.out.println("Good afternoon " + name);
			System.out.println("---------------------------");
		}
		
		System.out.println("======With For===========");
		
	
	}
	}
