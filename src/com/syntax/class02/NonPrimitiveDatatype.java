package com.syntax.class02;

public class NonPrimitiveDatatype {

	public static void main(String[] args) {
		// String is just one one example of non primitive of data type

		String name= "Nick";
		String address="5503 3rd st";
		String phone= "571 232 5400";
		int age=25;
		// Anything you put inside"" becomes a String
		
		// Syso +  ctrl +space to print fast
		
		System.out.println(name);
		//"My name is "+ name;
		System.out.println("My name is "+ name);
		// Nick is 25
		
		System.out.println(name+" is "+age);
		
		String fruit="apple";
		double price=1.99;
		// the price of the apple is 1.99
		
		System.out.println("the price of the "+ fruit+ " is " +price);
		
		 fruit="mango";
		price=5.99;
		// the price of the mango is 5.99
				
		System.out.println("the price of the "+ fruit+ " is " +price);
		
		/* To attach any value(byte,short,int,long,float,double,char,String)
		 * to a String, use +
		 * + next to the String acts as concatenation
		 */
		
	}

}
