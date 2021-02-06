package basicprograms;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueChar {
	static int No_of_char=256;
	static boolean flag=false;
	
	static boolean printDistinct(String str) {
		int[]count=new int[No_of_char] ;
		int i;
		for(i=0;i<str.length();i++)
		 {
			if(str.charAt(i)!=' ')
				count[(int)str.charAt(i)]++;
		 }
			int n=i;
			for(i=0;i<n;i++)
			 if(count[(int)str.charAt(i)]==1) {
					System.out.println("Unique characters:");
				break;
				}
			
		    for(i=0;i<n;i++) {
		    
			 if(count[(int)str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				flag=true;
			 }
			 
		    }
	return flag;	
	}
	
//	else {
//		System.out.println("No unique characters");
//		return;
//		
	//java is an object oriented programming language
	public static void main(String[] args) {
	
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence:");
    String str=sc.nextLine();
    String regex="^[a-zA-Z ]*$";
//    if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') 
//            || (str.charAt(0)>= 'A' && str.charAt(0) <= 'Z') 
//            || str.charAt(0) == '_')){
//    	System.out.println("Invalid sentence");
//    	return;
//    }
//    
//    for(int i=1;i<str.length();i++) {
//    	 if (((str.charAt(i) >= '0' && str.charAt(i) <= '9') 
//    	            || str.charAt(i) == '_')) {
//    		 System.out.println("Invalid sentence");
//    	 return;
//    	 }
//    } 
    
    Pattern p=Pattern.compile(regex);
    Matcher m=p.matcher(str);
    
    if(!m.matches()) {
    	System.out.println("Invalid Sentence");
    	return;
    }
    
    printDistinct(str);
   if(flag ==true) {
	 return  ;
	 }
   if(flag==false) {
	   System.out.println("No unique characters");  
   } 
    
   
   
	}
	

}
