package com.syntax.class05;

import java.util.Scanner;

public class Task4ForClass5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What time is it? Please use 24 hour format");
		int time=input.nextInt();
		if(time>=1 && time<=11) {System.out.println("It's morning there");}
		else if(time>=12 && time<=15) {System.out.println("It's afternoon there");}		
		else if(time>=16 && time<=20) {System.out.println("It's evening there");}
		else if(time>=21 && time<=24) {System.out.println("It's night there");}
	}

}
