package hackerrank;
import java.util.*;

public class SnacksDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
//   String s=sc.next();
//   if(s.contains("%")){
//	  System.out.println("Invalid Invalid") ;
//   }
//   double rating=Double.parseDouble(s);
   
   System.out.println("Enter the no of pizzas brought:");
   //int P=sc.nextInt();
   int P=0;
   System.out.println("Enter the no of puffs brought:");
   //int Q=sc.nextInt();
   int Q=0;
   System.out.println("Enter the no of cool drinks brought:");
   //int Z=sc.nextInt();
   int Z=1;
    //Sample output
   System.out.println("Bill Details");
   
   int Totalprice=(P*100)+(Q*20)+(Z*10);
   System.out.println(Totalprice);
   System.out.println("ENJOY THE SHOW!!!");
	}

}
