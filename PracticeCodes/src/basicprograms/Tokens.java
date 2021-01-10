package basicprograms;
import java.io.*;
import java.util.*;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Scanner sc=new Scanner(System.in);
//	sc.hasNextLine();
//	String a=sc.nextLine();
	Scanner sc=new Scanner(System.in);
	String rating=sc.next();
	
	
     String a="He is a very very good boy, isn't he?";
     
    StringTokenizer c=new StringTokenizer(rating," '[A-Z-z% !,?._@]+,");
    //System.out.println(c.countTokens());
//    while(c.hasMoreTokens()) {
//    	System.out.println(c.nextToken());
//    }
     {
    	System.out.println("Invalid Input");
    }
	}

}
