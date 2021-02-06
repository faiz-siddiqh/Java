package hackerrank;

import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (num) -> {
			return (num % 2 != 0) ? true : false;
		};
	}

	public PerformOperation isPrime() {

		return (num) -> {
			IntPredicate isDivisible = index -> num % index == 0;
			return num > 1 && IntStream.range(2, num - 1).noneMatch(isDivisible);
		};

//		return (num) -> {
//			int m = num / 2, flag = 0;
//
//			if (num == 0 || num == 1)
//				flag = 1;
//			for (int i = 2; i < m; i++) {
//				if (num % i == 0) {
//					flag = 1;
//					break;
//				}
//			}
//			return (flag == 0) ? true : false;
//		};
	}

	public PerformOperation isPalindrome() {
		return (num) -> {
			int n = num;
			int reverse = 0;
			int rem = 0;

			while (n != 0) {
				rem = n % 10;
				reverse = (reverse * 10) + rem;
				n = n / 10;
			}
			return (reverse == num) ? true : false;

		};
	}

	// Write your code here

}

public class JavaLamdaExpression {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
