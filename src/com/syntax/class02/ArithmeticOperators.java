package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// +,-,*,/,%
		
		int a=900;
		int b=100;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
        System.out.println(a/b);
        int c=10;
        int d=3;
        
        int sum=c+d;
        int sub=c-d;
        int div=c/d;// 10/3=3
        int remainder=c%d;// 10%3=1
        System.out.println("Sum is "+sum);
        System.out.println("Sub is "+sub);
        System.out.println("Remainder is "+remainder);// 10%3=1
        System.out.println("Division of integers is "+div);// 10/3=3
        
        double num1=10;
        double num2=3;
        System.out.println("Division of double is "+num1/num2);
        System.out.println(num1%num2);
        
System.out.println("--------------------------------------");
        int e=10;
        int f=5;
        System.out.println("Division="+e/f);
        System.out.println("Remainder="+e%f);
        System.out.println("---------using float data type-----------------------------");
        float number1=10F;
        float number2=3F;
        System.out.println(number1/number2);
        System.out.println(number1%number2);
        
        // remainder-%- mod operator
        System.out.println("---------remainder examples-----------------------------");
        System.out.println(6%4);
        System.out.println(6%3);
        System.out.println(16%5);
        System.out.println("what is the output-----");
        System.out.println(10+10/10);
        System.out.println((10+10)+10);
	
	}
	

}
