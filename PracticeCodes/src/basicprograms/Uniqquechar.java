package basicprograms;
import java.util.*;

public class Uniqquechar {

//	static void printDistinct(String Input) {
//		int[]count=new int[No_of_char] ;
//		int i;
//		for(i=0;i<str.length();i++)
//			if(str.charAt(i)!=' ')
//				count[(int)str.charAt(i)]++;
//			int n=i;
//		for(i=0;i<n;i++) {
//			if(count[(int)str.charAt(i)]!=1) {	
//			System.out.println("No unique characters");
//			}else {
//				System.out.println("Unique characters:");
//			}

//			for(i=0;i<Input.length();i++)
//				if(Input.charAt(i)!=' ')
//					count[(int)Input.charAt(i)]++;
//				int n=i;
//			for(i=0;i<n;i++)
//				if(count[(int)Input.charAt(i)]==1) {	
//					System.out.println(Input.charAt(i));
//			       //flag=true;
//				}
//	}
	// return flag;

	public static void main(String[] args) {
		int No_of_char = 1000;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str = sc.nextLine();

		if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
				|| str.charAt(0) == '_')) {
			System.out.println("Invalid sentence");
			return;
		}

		for (int i = 1; i < str.length(); i++) {
			if (((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '_')) {
				System.out.println("Invalid sentence");
				return;
			}
		}
		int[] count = new int[No_of_char];
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;
		}
		int n = i;
		for (i = 0; i < n; i++)
			if (count[(int) str.charAt(i)] == 1) {
				if (i == n - 1)
					System.out.println("Unique characters:");
			}

		for (i = 0; i < n; i++) {

			if (count[(int) str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));

			}
		}

		if (flag == true) {
			System.out.println("No unique characters");
		}

	}
}
// System.out.println("No unique characters");

//java is an object oriented programming language
