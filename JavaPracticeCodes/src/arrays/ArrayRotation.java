package arrays;

/**
 * 
 * @author Faiz-Siddiqh Write a program to rotate an array ,given the number of
 *         rotations/shifts .
 *
 */
class RotateArray {

	public void rotateArray(int[] arr, int rotateBy, int arraylength) {

		for (int i = 0; i < rotateBy; i++) {
			leftRotate(arr, rotateBy, arraylength);
		}

	}

	private void leftRotate(int[] arr, int rotateBy, int arraylength) {
		int i, temp;
		temp = arr[0];

		for (i = 0; i < arraylength - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	private void rightRotate(int[] arr, int rotateBy, int arrayLength) {

		int i, temp;
		temp = arr[arrayLength - 1];

		for (i = arrayLength - 1; i > 0; i--) {

			arr[i] = arr[i - 1];
		}

		arr[i] = temp;

	}

	void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

}

public class ArrayRotation {
	public static void main(String[] args) {
		System.out.println("Enter the Array");
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arraylength = arr.length;
		int rotateBy = 3;
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotateArray(arr, rotateBy, arraylength);
		rotateArray.printArray(arr);
	}
}
