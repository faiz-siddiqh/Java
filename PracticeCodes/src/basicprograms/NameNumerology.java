package basicprograms;

import java.util.Scanner;

import java.util.*;
public class NameNumerology
{
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
        char numer[][]={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
                    {'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'}};
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)<'A' || name.charAt(i)>'Z')
            {
                System.out.println("Invalid name");
                System.exit(0);
            }
            
        }
        int sum=0; char ch;
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            for(int j=0;j<26;j++)
            {
                if(ch==numer[0][j])
                {
                    sum=sum+(numer[1][j]-48);
                    break;
                }
            }
        }
        System.out.println("Your numerology no is:"+sum);
    }
}

