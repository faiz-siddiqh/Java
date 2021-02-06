package basicprograms;

/**
 * Program to Find Fibonacci Sequence
 * 
 * @author Faiz-Siddiqh
 *
 */
public class Fibbonacci {
	static int n1 = 0, n2 = 1, n3, i;

	static void printFibbonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibbonacci(count - 1);
		}

	}

	public static void main(String... args) {
//  int n1=0,n2=1,n3,i,count=10;
//  System.out.print(n1+" "+n2);
//  
//  for(i=2;i<count;++i) {
//	  n3=n1+n2;
//	  System.out.print(" "+n3);
//	  n1=n2;
//	  n2=n3;
//	  }

		int count = 10;
		System.out.print(n1 + " " + n2);
		printFibbonacci(count - 2);

	}

}
