package javaFirstGroupProject;

public class MaxAndMinForArray {

	public static void main(String[] args) {
		// Maximum Number from an array
		int []arr= {10,20,500,-35,2500,5000};
		int max=arr[0];//10
		System.out.println("Number of elements in this array is:"+arr.length);
		for(int i=1;i<arr.length;i++) {//5
			if(arr[i]>max) {//
				max=arr[i];//5000
			}
		}
		System.out.println(max);
		
		// Minimum Number from an array
		int min=arr[0];//10
		for(int i=1;i<arr.length;i++) {//1 2 3 4 5
			if(arr[i]<min) {//
				min=arr[i];
				
			}
		}
		System.out.println(min);
		
		
	}

}
