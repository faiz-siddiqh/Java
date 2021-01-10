package hackerearth;

public class SolutionClass {

	public static void main(String[] args)throws java.lang.Exception {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String x=sc.nextLine();
		int result=Replace(x);
	}

	 static int Replace(String x)throws java.lang.Exception {
		
		 x=x.replaceAll(" = X", "");
		 x.replaceFirst("+", "");
		 System.out.println(x);
		 
		 
		 return 0;
	}

}
