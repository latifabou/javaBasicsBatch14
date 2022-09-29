package javaFirstGroupProject;

public class CodingTask05 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */
		int[][] a = { { 10, 5, 12 }, { 7, 13, 24 }, { 35, 8, 21 }, { 20, 16, 45 } };
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 0) {
					sumOfEven = sumOfEven + a[i][j];

				} else {

					sumOfOdd = sumOfOdd + a[i][j];

				}

			}

		}
		System.out.println("Sum of Even numbers is: " + sumOfEven);
		System.out.println("Sum Of Odd numbers is: " + sumOfOdd);

	}

}
