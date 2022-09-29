package com.syntax.class04;

public class NestedIfConditions1 {

	public static void main(String[] args) {
		/*It's called outer if conditions:
		 * if it is true then only inner conditions will be checked;
		 * if it is false nothing from inner if conditions will be executed.
		 * it's like the main door: if it's closed, we can't enter the building.
		  
		 */
   int time=5;
   String day="Monday";//outer if conditions
   if(day.equals("Monday")) {//as String is non-primitive, we can't use=sign
	   //we have to use.equals method.
	   if(time>7) {//inner if conditions
		   System.out.println("let's go to office");
	   }if(time<6) {//inner if conditions
		   System.out.println("let's sleep more");
	   }
   }
		
	}

}
