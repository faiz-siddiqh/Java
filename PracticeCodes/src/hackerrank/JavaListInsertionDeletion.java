package hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaListInsertionDeletion {
	private static int initialNumberOfElements,noOfQueries;
	private static String str;
	
	public static String[] toArray(String input) {
		String[] arr = input.split(" ");
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> al= new ArrayList<Integer>();
		
		initialNumberOfElements=Integer.parseInt(sc.nextLine());
		String [] InputArray=toArray(sc.nextLine());
		for(int i=0;i<InputArray.length;i++) {
			al.add(Integer.parseInt(InputArray[i]));
		}
		
		noOfQueries=Integer.parseInt(sc.nextLine());
		for(int i=0;i<noOfQueries;i++) {
			str=sc.nextLine();
			if(str.equalsIgnoreCase("Insert")) {
				String [] arr=toArray(sc.nextLine());
				pushElement(al,arr[0],arr[1]);
			}else if(str.equalsIgnoreCase("Delete")) {
				al.remove(Integer.parseInt(sc.nextLine()));
			}
		}
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}

	private static void pushElement(List<Integer> al, String string, String string2) {
		 al.add(Integer.parseInt(string), Integer.parseInt(string2));
	}

}
