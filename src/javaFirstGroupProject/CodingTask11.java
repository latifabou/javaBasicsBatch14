package javaFirstGroupProject;

public class CodingTask11 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from an Array of Strings.
		String[] arr = { "Adam", "James", "Nick", "james", "Jack" };
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found duplicate element: " + arr[i]);
					found = true;
				}

			}
		}
		if (found == false) {
			System.out.println("Duplicate not found");
		}
	}
}