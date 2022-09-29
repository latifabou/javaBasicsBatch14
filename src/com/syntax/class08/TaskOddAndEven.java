package com.syntax.class08;

public class TaskOddAndEven {

	public static void main(String[] args) {
		// From range 1 to 50 find the sum of all even numbers and of all odd numbers
//The sum of odd numbers
		int sumEvenNum = 0;
		int sumOddNum = 0;
		for (int i = 1; i <= 50; i += 2) {
			sumOddNum += i;
		}

		System.out.println("Some of odd numbers= " + sumOddNum);
	//The sum of even numbers
		for (int i = 2; i <= 50; i += 2) {
			sumEvenNum += i;
		}
	
		System.out.println("Some of even numbers= " + sumEvenNum);
	
	}

}
