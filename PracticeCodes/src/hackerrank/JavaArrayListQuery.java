package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author fasid
 *
 */
public class JavaArrayListQuery {
	private static int noOfInput, noOfQuery;
	
	
	public static String[] toArray(String input) {
		String[] arr = input.split(" ");
		return arr;
	}

	public static void main(String[] args) {

		ArrayList<String[]> al = new ArrayList<String[]>();
		Scanner sc = new Scanner(System.in);
		noOfInput = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < noOfInput; i++) {
			String[] arr = toArray(sc.nextLine());
			al.add(i, arr);
		}

		noOfQuery = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < noOfQuery; i++) {
			String[] index = toArray(sc.nextLine());
			System.out.println(index[0] + " " + index[1]);
			returnElement(al, index[0], index[1]);
		}

	}

	private static void returnElement(ArrayList<String[]> al, String string, String string2) {
		try {
			String str[] = al.get(Integer.parseInt(string) - 1);
			System.out.println(str[Integer.parseInt(string2)]);

		} catch (Exception e) {
			System.out.println("Error!");
		}

	}

}
