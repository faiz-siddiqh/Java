package collectionFramework.Addressbook;

import java.util.Scanner;
//import collectionFramework.Addressbook.AddressBook.Address;

public class TestApplication {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	AddressBook ab=new AddressBook();
//	ab.setPermAddress(getPermanentAddress());
//	ab.setTempAddress(getTemporaryAddress());
	AddressBook.Address a=new AddressBook.Address();
	System.out.println("Enter the permanent address");
	System.out.println("Enter the house name");
	a.setName(sc.nextLine());
	System.out.println("Enter the street");
	a.setStreet(sc.nextLine());
	System.out.println("Enter the city");
	a.setCity(sc.nextLine());
	System.out.println("Enter the state");
	a.setState(sc.nextLine());
	ab.setPermAddress(a);
	AddressBook.Address b=new AddressBook.Address();
	System.out.println("Enter the temporary address");
	System.out.println("Enter the house name");
	b.setName(sc.nextLine());
	System.out.println("Enter the street");
	b.setStreet(sc.nextLine());
	System.out.println("Enter the city");
	b.setCity(sc.nextLine());
	System.out.println("Enter the state");
	b.setState(sc.nextLine());
	ab.setTempAddress(b);
		System.out.println("Enter the phone number");
		ab.setPhoneNumber(sc.nextLong());
		
		//Printing output
		System.out.println("Permanent address");
		System.out.println("House name:"+ab.getPermAddress().getName());
		System.out.println("Street:"+ab.getPermAddress().getStreet());
		System.out.println("City:"+ab.getPermAddress().getCity());
		System.out.println("State:"+ab.getPermAddress().getState());
		
		System.out.println("Temporary address");
		System.out.println("House name:"+ab.getTempAddress().getName());
		System.out.println("Street:"+ab.getTempAddress().getStreet());
		System.out.println("City:"+ab.getTempAddress().getCity());
		System.out.println("State:"+ab.getTempAddress().getState());
		
		System.out.println("Phone number");
		System.out.println(ab.getPhoneNumber());
	}
//public static Address getPermanentAddress() {
//AddressBook.Address a=new AddressBook.Address();
//System.out.println("Enter the permanent address");
//System.out.println("Enter the house name");
//a.setName(sc.next());
//System.out.println("Enter the street");
//a.setStreet(sc.next());
//System.out.println("Enter the city");
//a.setCity(sc.next());
//System.out.println("Enter the state");
//a.setState(sc.next());
//
//return a ;
//}
//public static Address getTemporaryAddress() {
//AddressBook.Address a=new AddressBook.Address();
//System.out.println("Enter the temporary address");
//System.out.println("Enter the house name");
//a.setName(sc.next());
//System.out.println("Enter the street");
//a.setStreet(sc.next());
//System.out.println("Enter the city");
//a.setCity(sc.next());
//System.out.println("Enter the state");
//a.setState(sc.next());
//
//return a ;
//}

//public static Address getPermanentAddress() {
//	AddressBook.Address a=new AddressBook.Address();
//	System.out.println("Enter the permanent address");
//	System.out.println("Enter the house name");
//	a.setName(sc.next());
//	System.out.println("Enter the street");
//	a.setStreet(sc.next());
//	System.out.println("Enter the city");
//	a.setCity(sc.next());
//	System.out.println("Enter the state");
//	a.setState(sc.next());
//	
//	return a ;
//}
//public static Address getTemporaryAddress() {
//	AddressBook.Address a=new AddressBook.Address();
//	System.out.println("Enter the temporary address");
//	System.out.println("Enter the house name");
//	a.setName(sc.next());
//	System.out.println("Enter the street");
//	a.setStreet(sc.next());
//	System.out.println("Enter the city");
//	a.setCity(sc.next());
//	System.out.println("Enter the state");
//	a.setState(sc.next());
//	
//	return a ;
//}
}
