package basicprograms;

import java.util.Scanner;

public class HCFLCM {

	public static void main(String[] args) {
		int a, b, n1, n2, temp;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		a = n1;
		b = n2;

		while (b != 0) {
			temp = b;
			b = a % b;
			// System.out.println(b);
			a = temp;
		}

		int HCF = a;

		int LCM = n1 * n2 / HCF;

		System.out.println(HCF + " " + LCM);

	}

}
