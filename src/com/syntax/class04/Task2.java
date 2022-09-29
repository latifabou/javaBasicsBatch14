package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		/*Create a Java program and name it Temperature Check. 
		 * Create variable to store temperature. 
		 * Your program should check if temperature is below 32 then it should 
		 * print “Water will freeze with temperature ”,
		 *  otherwise “Water will NOT freeze with temperature ”.
		
		 */
		
		// Temperature Check
		System.out.println("---Printing example1---");
		//example1
		double temp=31;
		if(temp<32) {
			System.out.println("Water will freeze with temperature");
		}else {
			System.out.println("Water will NOT freeze with temperature");
		}
		
		System.out.println("---Printing example2---");
		//example1
		int temp1=33;
		if(temp1<32) {
			System.out.println("Water will freeze with temperature");
		}else {
			System.out.println("Water will NOT freeze with temperature");
		}
	}

}
