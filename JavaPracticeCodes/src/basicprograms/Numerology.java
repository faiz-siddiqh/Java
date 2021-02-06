package basicprograms;

import java.util.*;
public class Numerology
{
    public static void main (String[] args) {
        int sum=0,digit=0,reverse=0,odd=0,even=0,n,nsum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num<=0 ||num>1000000000)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int dup=num;
        System.out.print("The Numbers are :");
        while(dup>0)
        {
            reverse=reverse*10+(dup%10);
            dup/=10;
        }
        while(reverse>0)
        {
            digit=reverse%10;
            System.out.print(" "+digit);
            reverse/=10;
            sum+=digit;
            if((digit%2)==0)
            even++;
            else
            odd++;
        }
        System.out.println("\nSum of digits : "+sum);
        do{
            if(sum<10)
            break;
            nsum=(sum/10)+(sum%10);
            sum=nsum;
        }while(sum>9);
        System.out.println("Numerology number: "+nsum);
        System.out.println("Number of odd numbers: "+odd);
        System.out.println("Number of even numbers: "+even);
    }
}