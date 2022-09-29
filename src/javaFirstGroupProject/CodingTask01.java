package javaFirstGroupProject;

public class CodingTask01 {

	public static void main(String[] args) {
		/*Using Scanner create an array of integer values.
		  After the array is created, calculate the sum of all stored elements in that array.
       */
		int []a=new int[5];
		a[0]=50;
		a[1]=100;
		a[2]=25;
		a[3]=175;
		a[4]=320;
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of all stored elements in this array is: "+sum);
	}

}
