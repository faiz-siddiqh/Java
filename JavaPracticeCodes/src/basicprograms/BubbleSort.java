package basicprograms;

/**
 * 
 * @author Faiz-Siddiqh Program to find Sort an Array using BubbleSort
 * 
 * Find a better written program in DataStructures and Algorithms project
 */

public class BubbleSort {

	public static void bubblesort1(int arr[]) {
		int temp = 0, n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (n - i); j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 25, 16, 13, 56, 12, 34 }, n = arr.length;

		System.out.println("Array before sorting ");

		for (int i : arr) {
			System.out.print(i + " ");

		}
		System.out.println();
		bubblesort1(arr);
		System.out.println("Array after sorting ");

		for (int num : arr) {
			System.out.print(num + " ");

		}
	}

}