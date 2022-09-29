package javaFirstGroupProject;

public class CodingTask09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		// Maximum number in the array

		int[] arr = { 10, 400, -35, 2000, 80, 6800 };
		int maxNum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}

		}

		System.out.println("Maximum number is: " + maxNum);

		// Minimum number in the array

		int minNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];
			}

		}

		System.out.println("Minmum number is: " + minNum);
	}

}
