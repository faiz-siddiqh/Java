package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeastOffer{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String com[]=new String[n];
     int min=2147483647;
     for(int i=0;i<n;i++)
     {
         String text=sc.next();
         String[] arrOfStr=text.split(",");
         int discount=(Integer.parseInt(arrOfStr[1])*Integer.parseInt(arrOfStr[2]))/100;
         com[i]=arrOfStr[0]+","+Integer.toString(discount);
         if(min>discount)
            min=discount;
     }
     for(int i=0;i<n;i++)
     {
         String dc[]=com[i].split(",");
         if(Integer.parseInt(dc[1])==min)
            System.out.println(dc[0]);
     }
        
    }
}