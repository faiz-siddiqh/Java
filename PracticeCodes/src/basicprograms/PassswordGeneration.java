package basicprograms;

import java.util.*;

public class PassswordGeneration {
	static int count;

	static boolean isValid(String str) {

		if (str.contains(" ")) {
			return false;
		}
		for (int i = 0; i <= 9; i++) {
			String str1 = Integer.toString(i);

			if (str.contains(str1)) {
				count = 1;
			}
		}
		if (count == 0) {
			return false;
		}

		if (!(str.contains("@") || (str.contains("#") || (str.contains("*"))))) {
			return false;
		}
		if (true) {
			int count = 0;

			// checking capital letters
			for (int i = 65; i <= 90; i++) {

				// type casting
				char c = (char) i;

				String str1 = Character.toString(c);
				if (str.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (true) {
			int count = 0;

			// checking small letters
			for (int i = 90; i <= 122; i++) {

				// type casting
				char c = (char) i;
				String str1 = Character.toString(c);

				if (str.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Generate your Security Code");
		String str = sc.nextLine();
		int n = str.length();

		if (n != 8) {
			System.out.println("Invalid Security Code, Try Again!");
			return;
		}
		if (isValid(str)) {
			System.out.println("Security Code Generated Successfully");
		} else {
			System.out.println("Invalid Security Code, Try Again!");
		}

	}

}
