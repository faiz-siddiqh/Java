package arrays;

import java.util.Scanner;

/**
 * 
 * @author Faiz-Siddiqh Implement a program to copy an array: 1)without using
 *         pre-existing library methods 2)using existing methods
 */
public class ArrayCopy {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int no = sc.nextInt();
//		int arr[] = new int[no];
//
//		for (int i = 0; i < no; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int arr1[] = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr1[i] = arr[i];
//		}
//
//		for (int k : arr1) {
//			// System.out.println("Displaying elements of original array " );
//			System.out.print(k + " ");
//		}
		
		printPattern(3);

	}

	public static void printPattern(int n) {
		int print = 1;
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(print + " ");
			}

			System.out.println();
		}

	}
}

/**
 * This can also be done using array.clone method
 */

//for(int j=0;j<arr1.length;j++) {
//	 arr1=arr.clone();// System.out.println("Displaying elements of original array " );
//	   System.out.print( arr1[j] +" " );
//	 }
