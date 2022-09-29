package com.syntax.class07;

import java.util.Scanner;

public class HW2Class6 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade(A,B,or c etc..)");
		String grade = input.nextLine();
		String explanation;
		switch (grade) {
		case "A":
			explanation = ("Excellent");
			break;
		case"B":
			explanation=("Good");
			break;
		case"C":
			explanation="Average";
			break;
		case"D":
			explanation="Bad";
			break;
			default:
				explanation="Unknown";
				break;
		}
				
		 System.out.println("You grade is "+grade+
	                "-"+explanation) ;
		

		}
	}


