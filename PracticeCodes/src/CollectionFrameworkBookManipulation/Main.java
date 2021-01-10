package CollectionFrameworkBookManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static  int choice;
	static Library lib =new Library();
	public static void main(String[] args) {
		uiinterface();
		 
		 
//		System.out.println("1.Add Book\r\n" + 
//				"2.Display all book details\r\n" + 
//				"3.Search Book by author \r\n" + 
//				"4.Count number of books - by book name\r\n" + 
//				"5.Exit");
//		
//		System.out.println("Enter your choice");
//		choice=Integer.parseInt(sc.nextLine());
//		if(choice == 1) {
//			 Book book =new Book();
//			System.out.println("Enter the isbn no:");
//			int isbnno=Integer.parseInt(sc.nextLine());
//			book.setIsbnno(isbnno);
//			System.out.println("Enter the book name:");
//			book.setBookName(sc.nextLine());
//			System.out.println("Enter the author name:");
//			book.setAuthor(sc.nextLine());
//			lib.addBook(book);
//			
//			
//			
//			
//		}else if(choice == 2) {
//			lib.viewAllBooks();
//		}else if(choice == 3) {
//			System.out.println("Enter the author name");
//			String authorName=sc.nextLine();
//			if(lib.viewBooksByAuthor(authorName).isEmpty()) {
//				System.out.println("The list is empty");
//			}else {
//				System.out.println(lib.viewBooksByAuthor(authorName));
//			}
//			
//		}else if(choice == 4) {
//			System.out.println("Enter the book name");
//			String bname=sc.nextLine();
//			lib.countnoofbook(bname);
//		}else if(choice == 5) {
//			return;
//		}
	}
	
	static void uiinterface() {
		System.out.println("1.Add Book\r\n" + 
				"2.Display all book details\r\n" + 
				"3.Search Book by author \r\n" + 
				"4.Count number of books - by book name\r\n" + 
				"5.Exit");
		
		System.out.println("Enter your choice");
		choice=Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			 Book book =new Book();
			System.out.println("Enter the isbn no:");
			int isbnno=Integer.parseInt(sc.nextLine());
			book.setIsbnno(isbnno);
			System.out.println("Enter the book name:");
			book.setBookName(sc.nextLine());
			System.out.println("Enter the author name:");
			book.setAuthor(sc.nextLine());
			System.out.println(lib.isEmpty());
			lib.addBook(book);
			System.out.println(lib.isEmpty());
			uiinterface();
			
			
			
		}else if(choice == 2) {
			ArrayList<Book>result=lib.viewAllBooks();
			if(result.isEmpty()) {
				System.out.println("The list is empty");
				
			}
			uiinterface();
		}else if(choice == 3) {
			System.out.println("Enter the author name");
			String authorName=sc.nextLine();
//			if(lib.viewBooksByAuthor(authorName).isEmpty()) {
//				System.out.println("The list is empty");
//			}else {
//				System.out.println(lib.viewBooksByAuthor(authorName));
//			}
			ArrayList<Book> list=lib.viewBooksByAuthor(authorName);
			if(!list.isEmpty()) {
				Iterator itr=list.iterator();
				while(itr.hasNext()) {
					Book book=(Book) itr.next();
					System.out.println("ISBN no:"+book.getIsbnno());
					System.out.println("Book name:"+book.getBookName());
					System.out.println("Author name:"+book.getAuthor());
					
				}
			}else {
				System.out.println("None of the book published by the author "+authorName);
			}
			uiinterface();
			
		}else if(choice == 4) {
			System.out.println("Enter the book name");
			String bname=sc.nextLine();
			System.out.println("Coubt is "+lib.countnoofbook(bname));
			uiinterface();
		}else if(choice == 5) {
			return;
		}
	}
//	public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        Library lib=new Library();
//        int i,choice;
//        for(i=0;i<50;i++){
//            System.out.println("1.Add Book");
//            System.out.println("2.Display all book details");
//            System.out.println("3.Search Book by author");
//            System.out.println("4.Count number of books - by book name");
//            System.out.println("5.Exit");
//            System.out.println("Enter your choice:");
//            choice=s.nextInt();s.nextLine();
//            if(choice==1){
//                Book b=new Book();
//                System.out.println("Enter the isbn no:");
//                b.setIsbnno(s.nextInt());s.nextLine();
//                System.out.println("Enter the book name:");
//                b.setBookName(s.nextLine());
//                System.out.println("Enter the author name:");
//                b.setAuthor(s.nextLine());
//                lib.addBook(b);
//            }
//            if(choice==2){
//                ArrayList<Book> result=lib.viewAllBooks();
//                if(result.isEmpty())
//                {
//                    System.out.println("The list is empty");
//                    continue;
//                }
//                Iterator iter=result.iterator();
//                while(iter.hasNext())
//                {
//                    Book b=(Book)iter.next();
//                    System.out.println("Isbn No: "+b.getIsbnno());
//                    System.out.println("Book name:"+b.getBookName());
//                    System.out.println("Author name: "+b.getAuthor());
//                }
//            }
//            if(choice==3){
//                System.out.println("Enter the author name:");
//                
//                String name=s.nextLine();
//                ArrayList<Book> result=lib.viewBooksByAuthor(name);
//                if(result.isEmpty()){
//                    System.out.println("None of the book published by the author "+name);
//                    continue;
//                }
//                Iterator iter=result.iterator();
//                while(iter.hasNext()){
//                    
//                    Book b=(Book)iter.next();
//                    System.out.println("Isbn no: "+b.getIsbnno());
//                    System.out.println("Book name: "+b.getBookName());
//                    System.out.println("Author name: "+b.getAuthor());
//                }
//            }
//            if(choice==4){
//                System.out.println("Enter the book name");
//                String name=s.nextLine();
//                System.out.println("Count is "+lib.countnoofbook(name));
//            }
//            if(choice==5)
//            System.exit(0);
//        }
//    }
}
