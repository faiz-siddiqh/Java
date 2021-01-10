package hackerearth;

import java.io.*;
import java.util.*;

public class basicIO_Divisible {
	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//         int N = Integer.parseInt(br.readLine().trim());
//         String[] arr_A = br.readLine().split(" ");
//         int[] A = new int[N];
//         for(int i_A=0; i_A<arr_A.length; i_A++)
//         {
//         	A[i_A] = Integer.parseInt(arr_A[i_A]);
//         }
		int[] A = { 15478, 8452, 8232, 874, 985, 4512, 2345 };
		String out_ = solve(A);
		System.out.println(out_);

//         wr.close();
//         br.close();
	}

	static String solve(int[] A) {
		// Write your code here

		int mid = 0 + (A.length - 1) / 2;

		String first = getElements(A, mid, 0, true);
		String second = getElements(A, A.length, mid + 1, false);
		String final_ = first + second;

		int output = Integer.parseInt(final_);
		if (output % 11 == 0) {
			return "OUI";
		}

		return "NON";
	}

	public static String getElements(int[] arr, int length, int start, boolean f) {
		String num = "";
		if (f == true) {

			for (int i = start; i <= length; i++) {
				String a = Integer.toString(arr[i]);
				num += String.valueOf(a.charAt(0));
			}
		} else {
			for (int i = start; i < length; i++) {
				String a = Integer.toString(arr[i]);
				num += String.valueOf(a.charAt(a.length() - 1));
			}
		}

		System.out.println(num);
		return num;
	}

}
