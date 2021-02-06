package hackerrank;
import java.util.Scanner;

public class Placement {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean invalid = false;
		System.out.println("Enter the no of students placed in CSE:");
		int cse = Integer.parseInt(in.nextLine());
		invalid = (cse < 0);
		System.out.println("Enter the no of students placed in ECE:");
		int ece = Integer.parseInt(in.nextLine());
		invalid = (invalid || ece < 0);
		System.out.println("Enter the no of students placed in MECH:");
		int mech = in.nextInt();
		invalid = (invalid || mech < 0);

		if (invalid) {
			System.out.println("Input is Invalid");
			return;
		}
		int highest = cse;
		if (cse > mech && cse > ece) {
			highest = cse;
		} else if (mech > ece && mech > cse) {
			highest = mech;
		} else {
			highest = ece;
		}
		if (highest == 0 || (cse == ece && ece == mech)) {
			System.out.println("None of the department has got the highest Placement");
			return;
		}
		System.out.println("Highest placement");
		if (cse == highest)
			System.out.println("CSE");
		if (ece == highest)
			System.out.println("ECE");
		if (mech == highest)
			System.out.println("MECH");

	}
}