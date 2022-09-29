package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please entre your name");
		String name=scanner.nextLine();//takes a string type input from the 
		//keyboard and stores it in name variable
		System.out.println("Please entre your age");
		int age=scanner.nextInt();//takes an int from the keyboard and 
		//stores it in age variable.
	 System.out.println("hi "+name+" "+"you are "+age+"years old");
		

	}

}
