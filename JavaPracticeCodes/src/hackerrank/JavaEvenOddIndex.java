package hackerrank;

import java.util.Scanner;

public class JavaEvenOddIndex {
	private static int no;
	private static String Input;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		no=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<no;i++) {
			Input=sc.nextLine();
			StringBuffer output1=new StringBuffer();
			StringBuffer output2=new StringBuffer();
			for(int j=0;j<Input.length();j++) {
				if(j%2==0) {
				output1.append(Input.charAt(j));
				}else {
				output2.append(Input.charAt(j));	
				}
			}
			System.out.println(output1 +" "+output2);
			
		}
		
		
	}

}
