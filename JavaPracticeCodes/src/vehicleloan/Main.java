package vehicleloan;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Vehicle vehicle=new Vehicle("1001", " abc", "4 wheeler",10000000);
       vehicle.issueLoan();
//       vehicle.takeInsurance();
       System.out.println(  vehicle.takeInsurance());
    }
}
//"1001", " abc", "4 wheeler",100