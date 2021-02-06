package basicprograms;

public class Prime {

	static void isprime(int n) {
		int m = 0, i, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else
			for (i = 2; i < m; i++) {
				if (n % i == 0) {
					System.out.println(n + "  is not a prime number");
					flag = 1;
					break;
				}
			}
		if (flag == 0) {
			System.out.println(n + " is a prime number");
		}
	}

	public static void main(String[] args) {
		isprime(1);
		isprime(9);
		isprime(19);
	}
}
