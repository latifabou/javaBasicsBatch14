package javaFirstGroupProject;

public class Sample {

	public static void main(String[] args) {
		/*Create a 2D array of integer values. Print the sum of all numbers.
		 */
	
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
	for(int i=0;i<arr.length;i++) {
		int sumC=0;
		int sumR=0;
		for(int j=0;j<arr[i].length;j++) {
		sum=sum+arr[i][j];
		sumR=sumR+arr[i][j];
		sumC=sumC+arr[j][i];
	
	}
	
		System.out.println("Row num:"+(i+1)+" sum:"+sumR);
		System.out.println("column "+(i+1)+" sum:"+sumC);
	
	}
	System.out.println("Some of all numbers:"+sum);
	
		
	}

}
