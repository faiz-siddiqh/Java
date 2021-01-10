package CollectionsFrameWorkPhoneBookmanipulation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc=new Scanner(System.in);
	private static PhoneBook pb=new PhoneBook();
	public static void main(String[] args) {
		
		for(int i=0;i<50;i++) {
		System.out.println("Menu\r\n" + 
				"1.Add Contact\r\n" +
				"2.Display all contacts\r\n" + 
				"3.Search contact by phone \r\n" +
				"4.Remove contact\r\n" +  
				"5.Exit");
		
		System.out.print("Enter the choice:");
		int choice=Integer.parseInt(sc.nextLine());
		//System.out.print(choice);
		if(choice == 1) {
			System.out.println("Add a Contact:");
			System.out.print("Enter the First Name:");
			String firstName=sc.nextLine(); 
			//System.out.print(firstName);
			System.out.print("Enter the Last Name:");
			String lastName=sc.nextLine();
			//System.out.print(lastName);
			System.out.print("Enter the Phone No.:");
			long phoneNumber=Integer.parseInt(sc.nextLine());
			//System.out.print(phoneNumber);
			System.out.print("Enter the Email:");
			String emailId=sc.nextLine();
			//System.out.print(emailId);
			
			Contact c=new Contact( firstName,  lastName,  phoneNumber,
					 emailId);
			pb.addContact(c);
			
		}else if(choice ==2) {
			List<Contact> result=pb.viewAllContacts();
			if(result.isEmpty())
              {
                  System.out.println("The list is empty");
                  continue;
              }
			System.out.println("The contacts in the List are:");
              Iterator iter=result.iterator();
              while(iter.hasNext())
              {
                  Contact b=(Contact)iter.next();
                  
                  System.out.println("First Name: "+b.getFirstName());
                  System.out.println("Last Name: "+b.getLastName());
                  System.out.println("Phone No.: "+b.getPhoneNumber());
                  System.out.println("Email: "+b.getEmailId());
              }
          }else if(choice ==3) {
			System.out.print("Enter the Phone number to search contact:");
			long phone=Integer.parseInt(sc.nextLine());
			System.out.println("The contact is:");
			Contact b=pb.viewContactGivenPhone(phone);
			if(b != null) {
                  System.out.println("First Name: "+b.getFirstName());
                  System.out.println("Last Name: "+b.getLastName());
                  System.out.println("Phone No.: "+b.getPhoneNumber());
                  System.out.println("Email: "+b.getEmailId());
			}else {
				System.out.println("None of the contact has the phone number");
			}
              			
		}else if(choice ==4) {
			System.out.print("Enter the Phone number to remove:");
			long ph=Integer.parseInt(sc.nextLine());
			System.out.print("Do you want to remove the contact (Y/N):");
			String input=sc.nextLine();
			if(input.charAt(0)=='Y') {
				if(pb.removeContact(ph)) {
				System.out.println("The contact is successfully deleted.");
				}else {
					System.out.println("The contact is not deleted.");
				}
			}else {
				continue;
			}
		}else if(choice ==5) {
			return;
		}
	}}
}
