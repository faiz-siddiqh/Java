package hackerrank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    String output=" ";
    System.out.println("Enter your ID");
    String str=sc.nextLine();
    String regex="[G]{1}[B]{1}[L]{1}[/]{1}[0-9]{3}[/]{1}[0-9]{4}";
    
    Pattern p=Pattern.compile(regex);
    Matcher m=p.matcher(str);
    if(m.find()) {
    	output="Login success";
    }else {
    	output="Incorrect ID";
    }
    System.out.println(output);
	}

}
//GBL/020/0715