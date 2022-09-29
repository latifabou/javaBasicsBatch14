package com.syntax.class05;

import java.util.Scanner;

public class Task3ForClass5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number from 1 to 1000");
		int number=input.nextInt();
		if(number>=1 && number<=10)
		{System.out.println("Number is small");}
		else if(number>=11 && number<=100)
		{System.out.println("Number is medium");}
		else if(number>=101 && number<=1000)
		{System.out.println("Nmuber is large");
		}
	}

}
