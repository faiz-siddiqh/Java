package arrays;

import java.util.*;
import java.lang.IndexOutOfBoundsException;


/**
 * 
 * @author Faiz-Siddiqh
 * Find the cummulative Sum of elements in a Given Array
 */
public class CumulativeArray {
	private static int sum;

	public static void main(String[] args) {

		try {
			sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements");
			int no = sc.nextInt();
			if (no <= 0) {
				System.out.print("Invalid Range");
				return;
			}
			System.out.println("Enter the elements");

			int[] arr = new int[no];

			for (int i = 0; i < no; i++) {
				int element = sc.nextInt();
				System.out.println(element + " ");
				sum = +element;
				arr[i] = sum;
			}

			for (int cumulativeSum : arr) {
				System.out.println(cumulativeSum + " ");
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

}
