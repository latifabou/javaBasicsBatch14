package com.syntax.class03;

public class IfElse4 {

	public static void main(String[] args) {
		
		System.out.println("-------Printing Example1------");
		// Example N1
		int money=64999;
		if(money>=65000) {
			System.out.println("I can buy Tesla");
		}
		else {
			System.out.println("I need to save more");
		}
	
		System.out.println("-----Printing Example2----");
		// Example N2
				int money1=65000;
				if(money1==65000) {
					System.out.println("I can buy Tesla");
				}
				else {
					System.out.println("I need to save more");
				}
				System.out.println("----Printing Example3----");
		// Example N3
				int money2=66000;
				if(money2>=65000) {
					System.out.println("I can buy Tesla");
				}
				else {
					System.out.println("I need to save more");
				}
				if(money2==65000) {
					System.out.println("I can buy Tesla");// this one will fail
				}
				else {
					System.out.println("I need to save more");
				}
	
	}

}
