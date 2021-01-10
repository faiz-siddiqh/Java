package basicprograms;

import static java.lang.System.out;
public class JavaStringOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="helloworldbing";
		String B="world";
		out.println(S.length()+B.length());
		
		compareAString(S,B);
		//out.print(compareAString(S,B));
		String s1=S.substring(0, 1).toUpperCase()+S.substring(1);
		String s2=B.substring(0, 1).toUpperCase()+B.substring(1);
		out.println(s1);
		out.println(s2);
		int start=0;
		int end=6;
		String C=S.substring(start, end-1);
		out.println(C);
	
	}
static String compareAString(String S, String B){
	
	//out.print(A);
	
	int c =S.compareTo(B);
	String HU=Integer.toString(c);
	if (c<0) {
		System.out.println("Yes");	
	}
	else
	{
		out.println("No");
	}
	return HU;
}
}
