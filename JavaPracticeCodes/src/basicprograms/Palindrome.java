package basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		int n = -1, temp, r, sum = 0;
		// n=454;
		temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (sum * 10) + r;
		}
		if (temp == sum)
			System.out.println("  is palindrome");
		else

			System.out.print("  is not palindrome");

	}

}