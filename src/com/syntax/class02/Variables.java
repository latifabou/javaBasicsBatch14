package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// Before changes
		String name="Abdellah ";
		String lastname="Bouzid";
		char grade='B';
		String city="Falls Church ";
		String state="VA";
		String phone="703 534 3212";
		
		System.out.println("My name is "+name+lastname);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+city+state);
		System.out.println("And my phone number is "+phone);
			
				
				// After changes
		grade='A';
		city="Alexandria ";
	    state="TX";
	    phone="703 555 1230";
	    System.out.print("My name is "+name+lastname);
	    System.out.println(". My new grade is "+grade+" And I moved to "+city+state);
	    System.out.println("My new phone number is "+phone);
	    
	    // Rules for identifiers=names(variables,methods, class and others names)
	    // 1-We can't use key words as identifiers;
	    //String new="Hello"; error
	    // 2-We can not have space in identifiers
	    //String last name="Smith"; error
	    //3-Identifiers cannot start with a number
	    //int 1number=123; error
	    //int number1=123; //Number can be anywhere after the name.
	    //4- Identifiers can not contain any character except $ or _
	    double $price$=9.98;
	    float _price1_=1.99F;
	    // Naming conventions (Preferences)
	    //-->class should start with upercase and follow camel casing
	    //-->variables should start with a lower cases and follow camel casing
	    String Weather="hot";// not preferred
	    String myWeather="cold";//preferred
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
