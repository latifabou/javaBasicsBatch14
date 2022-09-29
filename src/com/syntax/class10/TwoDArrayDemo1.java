package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {

		String[][] countries = { 
				{ "USA", "Canada" }, 
				{ "Perou", "Brazil", "Columbia", "Ecuador" },
				{ "Ethopia", "Egypt", "Keyna" }, 
				{ "Germany", "Turkiye", "Moldova", "Ukraine" },
				{ "kazashtan", "Afghanistan", "Korea" }

		};

		System.out.println(countries.length);// 5
	
	int eOf1array=countries[0].length;
	System.out.println("# of elements from 1 array is:"+eOf1array);
	int eOf2array=countries[1].length;
	System.out.println("# of elements from 2 array is:"+eOf2array);
	 
	
	
	
	
	}

}
