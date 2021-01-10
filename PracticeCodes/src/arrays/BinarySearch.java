package arrays;

/**
 * 
 * @author Faiz-Siddiqh
 * Find the element in array using Binary Search
 */
public class BinarySearch {

	public int binarySearch(int[] arr, int l, int length, int elementToFind) {
		if (length >= l) {

			int mid = l + (length - 1) / 2;

			if (arr[mid] == elementToFind) {
				return mid;
			}

			if (arr[mid] > elementToFind)
				return binarySearch(arr, l, mid - 1, elementToFind);

			return binarySearch(arr, mid + 1, length, elementToFind);

		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 15, 16, 19, 20 };
		BinarySearch bs = new BinarySearch();
		int elementToFind = 21;
		int length = arr.length;
		int result = bs.binarySearch(arr, 0, length - 1, elementToFind);

		if (result == -1) {
			System.out.println("element not found");
		} else
			System.out.println("element is found at " + result);
	}

}
