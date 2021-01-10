package basicprograms;

import java.util.Scanner;

/**
 * 
 * @author Faiz-Siddiqh
 *Program to find Factorial of a Number
 */

public class Factorial {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int number = sc.nextInt(), fact = 1, i;

		fact = factorial(number);
		System.out.print("the factorial of " + number + "  is" + fact);
//    for(i=1;i<n;i++) {
//    	fact=fact*i;
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
