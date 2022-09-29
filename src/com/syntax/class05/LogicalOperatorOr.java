package com.syntax.class05;

public class LogicalOperatorOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "saturday";
		if (day.equals("saturday") || day.equals("sunday")) {
		System.out.println("I have Java class at Syntax");
		}
		System.out.println(" ------Second example--------");
		if (day.equals("saturday") && day.equals("sunday")) {
		System.out.println("I have Java class at Syntax");
		}
		System.out.println(" ------3rd example---------------  ");
		double money = 90000;
		String title="Automation Tester";
		if(title.equals("Automation Tester") || money ==120000) {
		System.out.println("Happy");
		}
	}

}
