package com.syntax.class08;

public class HW4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
//First way
		System.out.println("======First way=======");
		for(int a=19;a<=50;a+=2) {
			System.out.print(a+" ");
	
}
	System.out.println();
		//Second way	
	System.out.println("======Secend way====");
	for(int b=19;b<=50;b++) {
		if(b%2!=0) {
			System.out.print(b+" ");
			
		}
	}
		
		
		
	}

}
