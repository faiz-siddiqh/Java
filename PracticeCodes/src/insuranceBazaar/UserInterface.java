package insuranceBazaar;


import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInterface {
	public static void main(String[] args) {

		int number;
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		Bazaar bazaar = new Bazaar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Policy names you want to store");
		number = Integer.parseInt(sc.nextLine());
		bazaar.setPolicyMap(t);
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the Policy ID");
			int policyid = Integer.parseInt(sc.nextLine()); 
			System.out.println("Enter the Policy Name");
			String policyname = sc.nextLine();
			
			bazaar.addPolicyDetails(policyid, policyname);
		}
		for (Entry<Integer, String> entry : t.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		System.out.println("Enter the policy type to be searched");
		String policyName=sc.next();
		List <Integer>list=bazaar.searchBasedOnPolicy(policyName);
		 	Iterator<Integer> itr=list.iterator();
		 	while(itr.hasNext()) {
		 		System.out.println(itr.next());
		 	}
		
	}
}
