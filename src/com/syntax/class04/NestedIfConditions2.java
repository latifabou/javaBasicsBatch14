package com.syntax.class04;

public class NestedIfConditions2 {

	public static void main(String[] args) {
		//Example1
		double moneyInMyAccount=100000;
		String season="Spring";
		if(season.equals("Spring")) 
			if(moneyInMyAccount>30000) {
				System.out.println("let's go on vacations");
			}else {
				System.out.println("let's save more money");
			}
		System.out.println("=======Printing Example2======");
		//Example2
		double moneyInMyAccount1=20000;
		String season1="Spring";
		if(season1.equals("Spring")) 
			if(moneyInMyAccount1>30000) {
				System.out.println("let's go on vacations");
			}else {
				System.out.println("let's save more money");
			}
		System.out.println("=======Printing Example3======");
		//Example3// nothing will happen because the main door is closed.
		double moneyInMyAccount2=20000;
		String season2="Spring";
		if(season2.equals("Winter")) 
			if(moneyInMyAccount2>30000) {
				System.out.println("let's go on vacations");
			}else {
				System.out.println("let's save more money");
			}
	}

}
