package javaFirstGroupProject;

public class CodingTask07 {
	public static void main(String[] args) {
	/*Write a java program to check whether a given number is prime or not?
	 */
	
		int num=28;
		int count=0;
		if (num>1) {
			for(int i=1;i<=num;i++) 
				
			if(num%i==0)
			{
				count++;
			}
			if(count==2) {
				System.out.println(num+ " is prime");
			}
			else {
				System.out.println(num+ " is not prime");
			}
				
			
			
		}else {
			System.out.println(num+" is not prime");
		}
		
	
		
		
		
		
}
}