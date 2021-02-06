package hackerearth;

import java.util.Scanner;

public class MinMax {
	
	/**
	 * @author Faiz-Siddiqh
	 *
	 */

	/*
	 * Given A Series Of N Positive Integers a1,a2,a3........an. , Find The Minimum
	 * And Maximum Values That Can Be Calculated By Summing Exactly N-1 Of The N
	 * Integers. Then Print The Respective Minimum And Maximum Values As A Single
	 * Line Of Two Space-Separated Long Integers.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int maxSum = 0;
		int maxLoop = 1;
		String numbers = sc.nextLine();
		String[] numbersArray = numbers.split(" ");
		int max = Integer.parseInt(numbersArray[0]);
		int min = Integer.parseInt(numbersArray[0]);
		for (String str : numbersArray) {
			if (Integer.parseInt(str) > max) {
				max = Integer.parseInt(str);
			}
			if (Integer.parseInt(str) < min) {
				min = Integer.parseInt(str);
			}

		}
//		System.out.println(min);
//		System.out.println(max);

		for (String str : numbersArray) {
			Integer one = Integer.parseInt(str);
			if (one.equals(max)) {
				if (maxLoop == 1) {
					maxLoop++;
					continue;
				} else {
					sum = sum + one;
				}
			} else if (!one.equals(max)) {
				sum = one + sum;
			}

		}
		maxLoop = 1;

		for (String str : numbersArray) {
			Integer one = Integer.parseInt(str);
			if (one.equals(min)) {
				if (maxLoop == 1) {
					maxLoop++;
					continue;
				} else {
					maxSum = maxSum + one;
					maxLoop++;
				}
			} else if (!one.equals(min)) {
				maxSum = one + maxSum;
			}

		}
		System.out.print(sum + " " + maxSum);

	}

}
