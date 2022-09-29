package com.syntax.class08;

import java.util.Scanner;

public class TaskGuessNumber {
	public static void main(String[] args) {
	
		/*. create a secret number and let user guess the secret number once 
	user
	 * guessed your secret number --> program says you won!
	 */
		
	/*Scanner input=new Scanner(System.in);
	int i=15;
	System.out.println("Please guess which number is this");
	int userNum=input.nextInt();
	do {
		if(userNum>i) {
			System.out.println("Please use a lower number");
			userNum=input.nextInt();
		}else if(userNum<i) {
			System.out.println("Please use a higher number");
			userNum=input.nextInt();
		}
	}while(userNum!=i);
	
	System.out.println("congratulations, you won");
	*/
	//Better Way:
	
		Scanner input=new Scanner(System.in);
	        int secret = 1234;
	        int guess;
	        do {
	            System.out.println("Please guess the secret number: ");
	            guess = input.nextInt();
	           
	        }while(guess != secret);
	        System.out.println("You won!");
	
	}

}
