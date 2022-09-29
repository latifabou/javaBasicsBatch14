package javaFirstGroupProject;

public class CodingTask10 {

	public static void main(String[] args) {
		/* Write a java program to find the second largest number in the array?
 
		 */

	int[]arr= {2,5,10,25,30};
	int t;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
			
		}
		System.out.print("Elements of array in ascending order: ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	System.out.println();
System.out.println("Second Largest number is: "+arr[arr.length-2]);
	
	}
}
