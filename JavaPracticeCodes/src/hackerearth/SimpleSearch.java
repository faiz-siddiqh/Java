package hackerearth;

import java.util.Scanner;
public class SimpleSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no=Integer.parseInt(sc.nextLine());
		String [] input=sc.nextLine().split(" ");
		int noToBeSearched=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<input.length;i++) {
			Integer number=Integer.parseInt(input[i]);
			if(number.equals(noToBeSearched)){
				System.out.println(i);
				return;
			}
			
		}
		
	}

}
