package basicprograms;
import java.util.*;
import java.util.regex.PatternSyntaxException;
import java.io.*;

public class InitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the String:");
	String line=sc.nextLine();
	boolean capitalFlag=false;
	char ch,ch1;String finalOutput;
	StringBuffer sa=new StringBuffer();
	ArrayList<String> ar=new ArrayList<String>();
	ar.add(line);
	for (String strLine : ar)
	{
		String[] strBrkLine = strLine.split(" ");
		for(int i=0;i<strBrkLine.length;i++) 
		{
		ch=strBrkLine[i].charAt(0);	
		ch1=strBrkLine[i+1].charAt(0);
		
		if((Character.isUpperCase(ch))&&(Character.isUpperCase(ch1)))
		{
			capitalFlag=true;
			System.out.println("First character of each word is already in uppercase");
			return;
		}else {
			for( i=0;i<strBrkLine.length;i++) 
			{
			strBrkLine[i]=	strBrkLine[i].substring(0, 1).toUpperCase()+strBrkLine[i].substring(1)+" ";
			sa.append(strBrkLine[i]);
		    }
			finalOutput=sa.toString();
			System.out.println(finalOutput);
		     }
	   }
	
	}    
  }
}
