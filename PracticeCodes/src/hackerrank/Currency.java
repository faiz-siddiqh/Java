package hackerrank;
import java.util.*;
import java.text.NumberFormat;


class Currency {
	public static void Main(String []args) {
	
	double dbl=1234.34;
	
	NumberFormat formatter=NumberFormat.getCurrencyInstance();
Locale India= new Locale("en","IN");

String IN=NumberFormat.getCurrencyInstance(India).format(dbl);
String US=NumberFormat.getCurrencyInstance(Locale.US).format(dbl);
String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(dbl);
String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(dbl);
	
System.out.println("US"+ US);
	}


}