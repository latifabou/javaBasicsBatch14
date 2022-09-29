package com.syntax.class09;

public class HW5 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order

	char[]letteres=new char[5];
	letteres[0]='A';
	letteres[1]='B';
	letteres[2]='C';
	letteres[3]='D';
	letteres[4]='E';
	
	for(int i=letteres.length-1;i>=0;i--) {
		System.out.println(letteres[i]);
	}
	
	
	
	}

}
