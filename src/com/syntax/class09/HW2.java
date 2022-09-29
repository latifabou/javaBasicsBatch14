package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		/* Create an array of animals and store 5 elements into it. 
		Using 2 different loops print all elements from the array.
		*/
//classic for loop
		String []animals=new String[6];
		animals[0]="Cat";
		animals[1]="Dog";
		animals[2]="cow";
		animals[3]="Bear";
		animals[4]="Horse";
		animals[5]="Fox";
		
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println("===================");
		
		// for each loop
		
		String []animals1= {"Cat","Dog","cow","Bear","Horse","Fox"};
		
		for(String animal:animals1) {
			System.out.println(animal);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}