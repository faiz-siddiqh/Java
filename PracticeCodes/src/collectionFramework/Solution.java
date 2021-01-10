package collectionFramework;

import java.util.*;
import java.io.*;



public class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap map=new HashMap();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
        
			int phone=in.nextInt();
            map.put(name, phone);
			in.nextLine();
		}
		for(int i=0;i<100000;i++)
		{
			if(in.hasNext()) {
            	String s=in.nextLine();
          
                if(map.containsKey(s)) {
                	System.out.println(s+"="+map.get(s));
                }else {
                	System.out.println("Not found");
                }
			}else {
				System.exit(0);
			}
		}
	}
}