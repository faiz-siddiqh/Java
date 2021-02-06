package hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

class JavaBigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
       

        
        Comparator <String> c=(S1,S2)->{
        	BigDecimal b1=new BigDecimal(S1);
        	System.out.println("b1"+b1);
        	BigDecimal b2=new BigDecimal(S2);
        	System.out.println("b1"+b2);
        	System.out.println("b2 compare"+ b2.compareTo(b1));
        	return b2.compareTo(b1);
        };
        
      Arrays.sort(s, c);
       
        //Output
        for(int i=0;i<n;i++)
        {
        	System.out.println("inside output");
            System.out.println(s[i]);
        }
    	
    	
    	
    }
}