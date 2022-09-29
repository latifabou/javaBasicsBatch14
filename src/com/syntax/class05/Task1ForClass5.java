package com.syntax.class05;

import java.util.Scanner;

public class Task1ForClass5 {

	public static void main(String[] args) {

/*Prompt the user to enter person heights in inches.Person should be classified
 * as one of the following:
 * +short:(under 60inch)
 * +medium:(between60-72inch)
 * +tall:(over 72inch)
 */
	Scanner input=new Scanner(System.in);
	System.out.println("please enter your height in inches");
	int height=input.nextInt();
	if(height<60)
	{System.out.println("your height is short");}
	else if(height>=60 && height<=72) 
	{System.out.println("your height is meduim ");}
	else if(height>72)
	{System.out.println("your height is tall");}
		
	
		
		
		
	}

}
