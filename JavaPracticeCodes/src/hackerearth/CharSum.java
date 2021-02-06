package hackerearth;

import java.util.*;
public class CharSum {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
//        String str=sc.nextLine();
        String str="aba";
        int count=0;
        String atoz="abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
         
                for(int j=0;j<atoz.length();j++){
                    if(atoz.charAt(j)==a){
                        count=count+j+1;//+1 bec0z we are starting from 0
                       
                         break;
                    }
                }
        }
        System.out.println(count);


    }
}