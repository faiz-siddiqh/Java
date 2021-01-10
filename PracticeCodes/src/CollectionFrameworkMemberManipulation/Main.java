package CollectionFrameworkMemberManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Library lib=new Library();
		int i, choice;
		for (i = 0; i < 50; i++) {
		System.out.println("1.Add Member");
		System.out.println("2.View All Members");
		System.out.println("3.Search Member by address");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		choice = Integer.parseInt(s.nextLine());
		
		if (choice == 1) {
			System.out.println("Enter the id:");
			int id=Integer.parseInt(s.nextLine());
			System.out.println("Enter the name:");
			String name=s.nextLine();
			System.out.println("Enter the address");
			String add=s.nextLine();
			Member member=new Member( id, name, add);
			lib.addMember(member);
		}
		if (choice == 2) {
			List<Member> listOfMember=lib.viewAllMembers();
			if(lib.isEmpty())
            {
                System.out.println("The list is empty");
                continue;
            }
			Iterator itr=listOfMember.iterator();
			while(itr.hasNext()) {
				Member m=(Member)itr.next();
				System.out.println("Id:"+m.getMemberId());
				System.out.println("Name:"+m.getMemberName());
				System.out.println("Address:"+m.getAddress());
			}
		}
		if (choice == 3) {
        System.out.println("Enter the address:");
        String add=s.nextLine();        
        List<Member> result=lib.viewMembersByAddress(add);
      if(result.isEmpty()){
          System.out.println("None of the member is from "+add);
          continue;
      }
      Iterator iter=result.iterator();
      while(iter.hasNext()){
          
          Member m=(Member)iter.next();
          System.out.println("Id:"+m.getMemberId());
			System.out.println("Name:"+m.getMemberName());
			System.out.println("Address:"+m.getAddress());
      }
		}

		if (choice == 4) {
			System.exit(0);
			// break;
		}
		
	}}
}
