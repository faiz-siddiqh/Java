package hackerearth;

import java.util.*;
 public class Duration {
    public static void main(String args[] ) throws Exception {
    
         Scanner s = new Scanner(System.in);
         int testcases=Integer.parseInt(s.nextLine());
         

         while(testcases>0){
               
                String[]arr=s.nextLine().split(" ");
               
                int h1=(Integer.parseInt(arr[0])*60)+Integer.parseInt(arr[1]);
                int h2=(Integer.parseInt(arr[2])*60)+Integer.parseInt(arr[3]);
              int count=Math.abs(h2-h1) ; 
                
                int hour=count/60;
                int min=count%60;

                System.out.println(hour+" "+min);



             testcases--;
         }

    }
}
