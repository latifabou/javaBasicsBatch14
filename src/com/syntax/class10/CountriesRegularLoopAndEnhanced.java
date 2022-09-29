package com.syntax.class10;

public class CountriesRegularLoopAndEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countries = { 
				{ "USA", "Canada" }, 
				{ "Perou", "Brazil", "Columbia", "Ecuador" },
				{ "Ethopia", "Morocco", "Keyna" }, 
				{ "Germany", "Turkiye", "Moldova", "Ukraine" },
				{ "kazashtan", "Afghanistan", "Korea" }
		};
	
				System.out.println("=========all values from 2d array using regular loop============");
			      for(int r =0; r<countries.length; r++) { // loops over rows
			          for(int c=0; c<countries[r].length; c++) {
			              System.out.print(countries[r][c]+" ");
			          }
			          System.out.println();
			      }
			          System.out.println("=========all values from 2d array using enhanced for loop============");
			         
			          for(String []country:countries) {
			        	  for(String c:country) {
			        		  if (c.equals("Morocco")) {
			                      System.out.println(c+ " is my home country");
			                  } else
			                  {
			                	  System.out.print(c+" "); 
			                  }
			                	  System.out.println();
			        		 
			        	  }
			        	  
			          }
			          
			          
	}

}
