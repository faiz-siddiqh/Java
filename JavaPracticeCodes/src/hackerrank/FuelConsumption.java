package hackerrank;
import java.text.DecimalFormat;
import java.util.*;

public class FuelConsumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 String obj="I LIKE JAVA";
		    System.out.println(obj.length());
		    String c=sc.next();
		double fuelAmount=sc.nextInt();
		double distance=sc.nextInt();
//		double fuelAmount=20;
//		double distance=-150;
		double consumption,inGallons,fuelamount,Distance;
		int fuel,dist;
		
		//System.out.println("Enter the no of liters to fill the tank");
		if(fuelAmount<0) {
		//System.out.println(fuelAmount);
		fuel=(int)fuelAmount;
		if(fuel<=0)
		System.out.println( fuel +" is an Invalid Input.");
		}
		//System.out.println("Enter the distance covered");
		if(distance<0) {
			dist=(int)distance;
			if(dist<=0)
		System.out.println(dist +" is an Invalid Input.");
		}
		if(fuelAmount >0 && distance > 0 ) {
		 System.out.println("Liters/100KM")	;
		 consumption= (fuelAmount/distance)*100;
		 String Consumption=String.format("%.2f", consumption);
		 System.out.println(Consumption);
		 
		 System.out.println("Miles/gallons");
		 fuelamount=fuelAmount*0.2642;
		 Distance=distance*0.6214;
		 inGallons=Distance/fuelamount;
		//}
		 String str=String.format("%.2f", inGallons);
		 System.out.println(str);
		 
		 DecimalFormat df=new DecimalFormat();
	}
	}
}
