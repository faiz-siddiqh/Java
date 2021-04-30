package arrays;

public class ArrayRoatationByJugglerAlgorithm {

	public int[] rotate(int[] arr, int d, int n) {
		int i, j, k, gcd, temp;
		d = d % n;
		gcd = gcd(d, n);
		for (i = 0; i < gcd; i++) {

			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;

				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;

			}
			arr[j] = temp;
		}

		return arr;
	}

	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {

			return gcd(b, a % b);
		}

	}

	public void printArray(int[] arr) {

		for (int each : arr) {
			System.out.println(each);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		ArrayRoatationByJugglerAlgorithm ar = new ArrayRoatationByJugglerAlgorithm();
		arr = ar.rotate(arr, 3, arr.length);
		ar.printArray(arr);

	}

}
