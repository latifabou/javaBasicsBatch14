package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concatenation helps us combine a String with any primitive
		 * data type together
		 */
    String firstName="Abdellah";
    String lastName="Bouzid";
    String fullName=firstName+" "+lastName;
    System.out.println(fullName);
    int houseNo=15;
    int apartmentNo=5;
    String streetName="that street";
    String city="Newyork";
    String country="USA";
	String fullAddress=houseNo+" "+apartmentNo+" "+streetName+" "+city+" "+country;
	System.out.println(fullAddress);
	String incompleteAddress=houseNo+city;
	String step1="if we subtract 5 from 10 we get ="+5;// result in a String
	System.out.println(step1);
	//String step2=step1-5;// It's not defined, java does'nt understand what to do when asked to 
	//subtract s String from a number. It complains.
	System.out.println("if we subtract 5 from 10 we get ="+(10-5));
	
		
	}

}
