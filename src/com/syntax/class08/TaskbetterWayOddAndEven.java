package com.syntax.class08;

public class TaskbetterWayOddAndEven {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			
	}
		System.out.println("sum of even number from 1 to 50= "+ sumEven);
		System.out.println("sum of odd number from 1 to 50= "+ sumOdd);
	}
}
