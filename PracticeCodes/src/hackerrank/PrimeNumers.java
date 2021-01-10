package hackerrank;

import java.util.*;
public class PrimeNumers {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int low = sc.nextInt();
        int high =sc.nextInt();
         if(low>high){
           System.out.print("Provide valid input ");
           return;
        }else if((low<0)||(high<0) ){
          System.out.print("Provide valid input ");
          return;
        }else if(low==high){
            System.out.print("Provide valid input ");
            return;
        }
        
        
        
          if((low!=0)){
        while (low <=high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
    else{
          System.out.print("Provide valid input");   
        }
        
    
}
}