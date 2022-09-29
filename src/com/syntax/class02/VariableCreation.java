package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		
		// 1 way to create a variable
		byte b=10; // create a variable and assign a value
		
		// 2 way to create a variable
		int i;// create a variable
		i=100; //assign a value
		// we need to create a variable only once
		// and then use as many times we want or we need during the program.
		
		// 3 way 
		int num1, num2, num3;// create a variable= declare a variable
		num1= 100;// assign a variable or initialize it
		num2=200;
		num3=300;
		//int num1=100; error ..duplicate variable
		System.out.println(num2);//200
		
		// can i change a value of variable?
		num2=2000;// reassign the value 
		System.out.println(num2);//2000
		

		// one variable can hold only one value at one time
		
		
	}

}
