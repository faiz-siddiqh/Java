package hackerearth;




/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
public class TwoStrings {
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

         int no=Integer.parseInt(sc.nextLine());

         while(no>0){
             String str=sc.nextLine();

             String []arr=str.split(" ");
            int result=identical(arr);
            if(result==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            no--;
         }
    }

    public static int identical(String []arr){
            String inp1=arr[0];
            String inp2=arr[1];

            if(inp1.length()!=inp2.length())
            return -1;
            char[]arr2=inp1.toCharArray();
            Arrays.sort(arr2);
            String out2=new String(arr2);
            char[]arr1=inp2.toCharArray();
            Arrays.sort(arr1);
            String out1=new String(arr1);
            System.out.println(out1);

            if(out2.equals(out1)){
                return 1;
            }


        return -1;
    }
}
