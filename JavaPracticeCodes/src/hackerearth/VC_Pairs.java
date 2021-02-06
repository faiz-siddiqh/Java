package hackerearth;

import java.util.*;

public class VC_Pairs {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
		 * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
		 * STDOUT
		 * 
		 * //Scanner
		 * 
		 * String name = s.nextLine(); // Reading input from STDIN
		 * System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		 * 
		 */

		// Write your code here
		Scanner sc = new Scanner(System.in);
		int no = Integer.parseInt(sc.nextLine());

		while (no > 0) {
			
			int count = 0;
			int len = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();

			if (str.length() == 1) {
				System.out.println("0");
				no--;
				continue;
			}
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) != 'o'
						|| str.charAt(i) != 'u') {
					if (str.charAt(i + 1) == 'a' || str.charAt(i + 1) == 'e' || str.charAt(i + 1) == 'i'
							|| str.charAt(i + 1) == 'o' || str.charAt(i + 1) == 'u') {
						count++;
					}
				}
			}

			System.out.println(count);

			no--;
		}

	}
}