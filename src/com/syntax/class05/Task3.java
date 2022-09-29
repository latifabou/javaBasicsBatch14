package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
/*You are a loan specialist and you need to ask user what is the amount of loan
 *  is needed. If loan is less or equal to 200,000 
 *  then you would lend the money otherwise you would reject the client.
 */
      Scanner scan=new Scanner(System.in);
     System.out.println("What is the amount of loan that you need?"); 
     int money=scan.nextInt();
     
		if(money<=200000) {
			System.out.println("Congratulations,your application was approved");
		}
		
		else {System.out.println("We are sorry to inform that"
				+ " your application was rejected");}
	}

}
