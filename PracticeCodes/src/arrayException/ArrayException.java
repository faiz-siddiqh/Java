package arrayException;

import java.util.InputMismatchException;

/**
 * Example of Exceptions for Arrays
 */
import java.util.Scanner;

public class ArrayException {

	public String getPriceDetails() {
		int no, output;
		String message = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		no = sc.nextInt();
		int arr[] = new int[no];
		int i = 0;
		System.out.println("Enter the price details");
		try {
			while (i < no) {
				arr[i] = sc.nextInt();
				i++;
			}
			System.out.println("Enter the index of the array element you want to access");
			output = sc.nextInt();
			message = "The array element is " + arr[output];

		} catch (InputMismatchException e) {
			return message = "Input was not in the correct format";
		} catch (ArrayIndexOutOfBoundsException e) {
			return message = "Array index is out of range";
		}
		return message;
	}

	public static void main(String[] args) {
		ArrayException a = new ArrayException();
		System.out.println(a.getPriceDetails());

	}

}
