package com.syntax.class08;

public class TaskContinueKeyWord {

	public static void main(String[] args) {
		//Print numbers from 1 t0 50 except those that are divided by 3.
		
		for(int i=1; i<=50;i++) {
			if(i % 3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}	
	

	
