package javaFirstGroupProject;

public class CodingTask06 {

	public static void main(String[] args) {
		/* Write a program to swap 2 numbers without a temporary variable?
		 */

	int a=10, b=20;
	System.out.println("before swaping values are: a="+a+", b= "+b);
	//use -& + without using a temporary variable
	/*a=a+b;//10+20=30;
	b=a-b;//30-20=10;
	a=a-b;//30-10=20;
	*///use * & / 
	/*a=a*b;//10*20=200;
	b=a/b;//b=200/20=10;
	a=a/b;//a=200/10=20;
	*/
	//Single statement
	b=a+b-(a=b);//30-20=10;
	System.out.println("After swaping values are: a="+a+", b= "+b);
	
	}

}
