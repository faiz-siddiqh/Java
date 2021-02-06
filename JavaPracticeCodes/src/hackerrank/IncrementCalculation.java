package hackerrank;
import java.util.*;
import java.lang.NumberFormatException;

public class IncrementCalculation {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			double salaary = 0;
//        int n=sc.nextInt();
//        if(n<0) {
//        	n=Math.abs(n);
//        	System.out.println(n);
//        }

			System.out.println("Enter the salary");
			double salary = sc.nextDouble();
			if ((salary <= 0)) {
				System.out.println("Invalid Input");
				return;
			}

			System.out.println("Enter the Performance appraisal rating");
			String s = sc.next();
			if (s.contains("%")) {
				System.out.println("Invalid Invalid");
			}
			double rating = Double.parseDouble(s);
//   try
//   { 
//	  // double rating=Double.parseDouble(s);
//   }
//  catch(Exception ex) 
//   {
//      
//   }

			// double rating=Double.parseDouble(s);

			// double rating=Double.parseDouble(s);
			if ((rating <= 0) || (rating > 5)) {
				System.out.println("Invalid Input");
				return;
			}

			if ((rating >= 1) && (rating <= 3)) {
				salaary = (0.1 * salary) + salary;
			} else if ((rating > 3) && (rating <= 4)) {
				salaary = (0.25 * salary) + salary;
			} else if ((rating > 4) && (rating <= 5)) {
				salaary = (0.3 * salary) + salary;
			}
			int sal = (int) salaary;
			System.out.print(sal);
		} catch (NumberFormatException nfe) {
			// nfe.printStackTrace();
		}

	}
}