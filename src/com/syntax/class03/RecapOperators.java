package com.syntax.class03;

public class RecapOperators {

	public static void main(String[] args) {
		/*
		 * Addition=>+
		 * subtraction=>-
		 * Multiplication=>*
		 * Division=>/
		 * Modulus=>%
		 */

		int number1=9;
		int number2=2;
		System.out.println("Division="+number1/number2);//=4 not 4.5 (dividing number1 by number2).
	    System.out.println("Remainder="+number1%number2);
		double number3=9;
		double number4=2;
		System.out.println(number3/number4);// =4.5 (dividing number3 by number4).
	
		float number5=1.0f;
		float number6=3.0f;
		System.out.println(number5/number6);//  (dividing number5 by number6).
	
		double number7=1;
		double number8=3;
		System.out.println(number7/number8);// (dividing number7 by number8).
	
	}

}
