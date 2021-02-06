package basicprograms;
import java.util.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class PanCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the PAN no:");
   Input=sc.nextLine();
    //Input="ABSASD add";
    int no=Input.length();
    if(no!=10) {
    	System.out.println("Invalid PAN no");
    	return;	
    }
     String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
    Pattern p=Pattern.compile(regex);
    
    Matcher m=p.matcher(Input);
    if(m.matches()) {
    	System.out.print("Valid PAN no");
    }else {
    	System.out.println("Invalid PAN no");
    }
    
	}

}
