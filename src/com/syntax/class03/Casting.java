package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*Type casting==>type= data type;
		 *  casting= converting one data type to another. 
		 */
		byte box1=127;//smallest box 8 bits
		short box2=3333;// double the size of box1 in terms of bits(16bits)
		int box3=454545;//large box most commonly used (32bits)
		long box4=45454545;//extra large box (64bits)
		float box5=41455645;
		double box6=454545445;
		
		int number=(int)15.2;// we can't store the decimal number in box of type of integer
		System.out.println(number);
		int smallerBox=(int)box2;
		System.out.println(smallerBox);
		short biggerBox=box1;
		long box7=box1;// we can do this because box7 is larger than box1
		float box8=(float)box6;// as box6 is larger(double), we need type casting to assign the value
		char a=(char)67;
		System.out.println(a);
		int box9=(int)box4;
		System.out.println(box9);
		
		/*What is type casting?
		 * Type casting is converting one data type to another data type
		 * Why should i learn about type casting?
		 * So that we can use the code that is written by someone else to make our life easier.
		 * or when we will be working on team we will be able to merge the code
		 * What is the syntax of type casting?
		 * When we are converting something smaller to larger, it happens automatically,
		 * we don't need to do anything, we just assign the variable
		 * example: int box=1234
		 * long box1=box; // this how it works and it's called implicit; automatic or widening
		 * however, when converting a large data type to a smaller one 
		 * Example: long box=1245454;
		 * int box2=(int)box;// it's called explicit,manual conversion or narrowing.
		 */
	
		
		
		
		
		
		
		
		
		

	}

}
