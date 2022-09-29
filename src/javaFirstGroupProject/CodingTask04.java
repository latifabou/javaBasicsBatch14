package javaFirstGroupProject;

public class CodingTask04 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 * 
		 */
		int[][] a = { { 3, 6, 10 }, { 7, 11, 20 }, { 25, 30, 47 }, { 9, 14, 22 } };
		System.out.print("Even numbers are: ");
		for (int i = 0; i < a.length; i++) {
			{
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] % 2 == 0) {
						System.out.print(a[i][j]+" ");

					}

				}

			}

		}
	}
}