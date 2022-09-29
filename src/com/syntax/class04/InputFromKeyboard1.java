package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard1 {

	public static void main(String[] args) {
    /*Scanner is class that helps us take the input from the keyboard
     * It contains many different smaller modules called methods
     * that can help us take:Strings, booleans basically all types
     * of data types from the keyboards.
     */
	Scanner input=new Scanner(System.in);
	/*A message will be displayed to the user on the console
	 * to enter his/her name.
	 */
	System.out.println("Please enter your name");
	//Activate the java program to take the input from the keyboard and store
	String name=input.next();
	//Prints whatever name user enters on the keyboard on the console
	System.out.println("Hello"+" "+name+" "+"don't be cofused");
		

	}

}
