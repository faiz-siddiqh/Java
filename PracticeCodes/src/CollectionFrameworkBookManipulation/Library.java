package CollectionFrameworkBookManipulation;

import java.util.ArrayList;
import java.util.Iterator;


public class Library {
	static private ArrayList<Book> bookList = new  ArrayList<Book>();

	public static ArrayList<Book> getBookList() {
		return bookList;
	}

	public static void setBookList(ArrayList<Book> bookList) {
		Library.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	public ArrayList<Book> viewAllBooks() {
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author ){
		ArrayList <Book> booksbyauthor=new ArrayList();
		Iterator itr=getBookList().iterator();
		while(itr.hasNext()) {
			Book book=(Book) itr.next();
			if(book.getAuthor().equalsIgnoreCase(author)) {
				booksbyauthor.add(book);
			}
			
			
		}
		
		return booksbyauthor;
	}
	public int countnoofbook(String bname) {
		int count=0;
		Iterator itr=getBookList().iterator();
		while(itr.hasNext()) {
			Book book=(Book) itr.next();
			if(book.getBookName().equalsIgnoreCase(bname)) {
				count++;
			}
			
			
		}
		return count;
	}
}
