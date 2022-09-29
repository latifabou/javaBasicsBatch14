package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
System.out.println("Did you solve any repil assignments"
		+ " please entre true or false ");
		boolean solvedAnyRepils=scanner.nextBoolean();
		if(solvedAnyRepils) {
			System.out.println("How many Repils you solved");
			int noOfRepilsSolved=scanner.nextInt();
			if(noOfRepilsSolved>=17) {
				System.out.println("you are doing great");
			}else if(noOfRepilsSolved>10) {
				System.out.println("you are doing ok please complete as "
						+"as soon as possible");
			}else 
				System.out.println("you should solve some more repils");
			}
			
		else {
				System.out.println("They are very important to learn "
						+ "Java please solve them");
			}
		}
		
	}


