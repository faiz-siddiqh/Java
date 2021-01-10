package hackerearth;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Seven_Segment_Display {
	
	
	public static void main(String[] args)throws Exception {
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int testcases=sc.nextInt();
		int testcases=Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(0, 6);
		hm.put(1, 2);
		hm.put(2, 5);
		hm.put(3, 5);
		hm.put(4, 4);
		hm.put(5, 5);
		hm.put(6, 6);
		hm.put(7, 3);
		hm.put(8, 7);
		hm.put(9, 6);
		
		while(testcases>0) {
			//int input=sc.nextInt();
			int input=Integer.parseInt(br.readLine());
			String str=String.valueOf(input);
			
			int sum=0;
			for(int i=0;i<str.length();i++) {
				sum+=hm.get(Integer.parseInt(String.valueOf(str.charAt(i))));
				
			}
			String output="";
			if(sum%2==0) {
				int a=sum/2;
				while(a>0){
					output+="1";
					a--;
				}
				System.out.println(Integer.parseInt(output));
				testcases--;
				continue;
			}else if(sum%2==1){
				output+="7";
				sum=sum-3;
				int a =sum/2;
				while(a>0) {
					output+="1";
					a--;
				}
				System.out.println(Integer.parseInt(output));
				testcases--;
				continue;				
			}
			
			
			
			
			testcases--;
		}
		
		
		
	}

}
