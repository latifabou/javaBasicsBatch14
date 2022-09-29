package com.syntax.class05;

public class Task2ForClass5 {

	public static void main(String[] args) {
/*write a program that will print whether it is weekend or weekday.
 * If any day from 1-5->output "it is a weekday", anyday from 6-7-->output
 * "it is weekday",any other day-->output"invalid day".
 */
	int day=4;
	if (day>=1 && day<=5) 
	{System.out.println("it is a weekday");}
	else if(day==6 ||day==7)		
	{System.out.println("it is a weekend");}
	else
	{System.out.println("invalid day");}
	}
}