package com.syntax.class08;

import java.util.Scanner;

public class TaskShopping2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double sum=0;
		double money=0;
		System.out.println("Please entere item wanted");
       String item=input.nextLine();
       System.out.println("How much does it cost");
       double price=input.nextDouble();
      
       
       while(money!=price) {
    	   System.out.println("Please enter the money");
        money=input.nextDouble();
        sum+=money;
        if(money<price) {
        	double leftToPay=price-sum;
        	System.out.println("Left to pay: "+leftToPay);
    	        if(leftToPay==0) {break;}
        }else if(money>price)
    	   {
    	   double change=money-price;
    	   System.out.println("here is your change "+change);
    	   break;}
     
	    }
System.out.println("Thank you for shopping");
		
	}
}