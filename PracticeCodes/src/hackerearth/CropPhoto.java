package hackerearth;

import java.util.*;
public class CropPhoto {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        //Scanner
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        int no=sc.nextInt();

        while(no>0){
            //String str=sc.nextLine();
            //String []arr=str.split(" ");
            //int W=Integer.parseInt(arr[0]);
            //int H=Integer.parseInt(arr[1]);
            int W=sc.nextInt();
            int H=sc.nextInt();
            if(W<L || H<L){
                System.out.println("UPLOAD ANOTHER");
            }else if(W==L && H==L) {
            	System.out.println("ACCEPTED");
            }           
            else if(W==H){
                System.out.println("ACCEPTED");
               
            }else if((W>L ||H>L)){
                System.out.println("CROP IT");
            }

         no--;
        }


    }
}