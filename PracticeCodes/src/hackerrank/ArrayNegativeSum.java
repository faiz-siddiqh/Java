package hackerrank;

import java.util.Arrays;
import java.util.Scanner;



/**
 * @author fasid 
 *
 */
public class ArrayNegativeSum {

	private static int n, count;

	public static <T> int[] subArray(int[] arr, int beg, int end) {
		return Arrays.copyOfRange(arr, beg, end + 1);
	}

	public static void recursive(int[] arr) {
		int sum = 0;
		
		//calculating sum of elements in the array
		for (int n : arr) {
			sum += n;
		}
		if (sum < 0) {
			count++;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
         
		//Checking if the array itself has any negative number
		for (int n : arr) {
			if (n < 0) {
				count++;
			}
		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				//getting sub arrays from the main array from Arrays.copyOfRange Method
				int[] sub = subArray(arr, i, j);
			
//			for(int r:sub)
//			System.out.println(r);

				//checking if the sub array has a negative number
				recursive(sub);
			}
		}
		
		//printing the number of subarrays having negative sums
		System.out.println(count);

	}

}
