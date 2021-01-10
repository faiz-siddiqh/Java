package CollectionsFrameWorkPhoneBookmanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PhoneBook {

	private static List<Contact> phoneBook = new ArrayList<Contact>();

	public static List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public static void setPhoneBook(List<Contact> phoneBook) {
		PhoneBook.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts() {
		return phoneBook;
	}
	public Contact viewContactGivenPhone(long phoneNumber) {
		Iterator itr=phoneBook.iterator();
		while(itr.hasNext()) {
			Contact contact=(Contact) itr.next();
			if(contact.getPhoneNumber()==phoneNumber) {
			return contact;
			}
		}
		return null;
	}
	public boolean removeContact(long phoneNumber) {
		Iterator itr=phoneBook.iterator();
		while(itr.hasNext()) {
			Contact contact=(Contact) itr.next();
			if(contact.getPhoneNumber()==phoneNumber) {
				itr.remove();
				return true;
			}		
	}
		return false;
}
}
