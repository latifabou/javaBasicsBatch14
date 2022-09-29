package com.syntax.class07;

import java.awt.im.InputSubset;
import java.util.Scanner;

public class HW1Class6 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks. .
		 */
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your country");
	String country=input.nextLine();
	String language;
	
	
	switch(country) {
	case"USA":
		language=("English");
		break;
	case"Spain":
		language=("Spanish");
	    break;
	case"France":
		language=("French");
		break;
	case"Germany":
		language=("German");
		break;
	case"China":
		language=("Chinese");
		break;
		default:
		language=("unknown language");
		break;
	}
	 System.out.println("You are from "+country+
             " and you speak "+language) ;
	 
	 
	}

}




