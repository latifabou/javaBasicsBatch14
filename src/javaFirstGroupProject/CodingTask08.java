package javaFirstGroupProject;

public class CodingTask08 {

	public static void main(String[] args) {
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
       /* series of numbers in which number(Fibonacci number) is the sum of two precedents numbers.
        * 
        * 0 1 1 2 3 5 8 13 21 34
        * sum=n1+n2.
        * 	0	1	1    2	3	 5	 8	 13	 21	 34
1	       n1	n2	sum							
2		        n1	n2	sum						
3			        n1	n2	sum					
4				        n1	n2	sum				
5				        	n1	n2	sum			
6						        n1	n2	sum		
7							        n1	n2	sum	
8								        n1	n2	sum

        */

		int n1=0, n2=1,  sum=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
		
	
	}
	
}
