package basicprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class Break {

	public static void main(String[] args) {
//	String place1 = null,game1 = null;
//	int age1 =0;
//	ArrayList<String> name = new ArrayList<String>(
//			Arrays.asList("Messi","Sachin","Sindhu","Federer","Virat","Ronaldo"));
//
//	String search;
//	Scanner sc= new Scanner(System.in);
//	String inputtxt= JOptionPane.showInputDialog("Please Enter Player Name:");
//	//System.out.println("Enter the player name:");
//	try {
//	
//	inputtxt = sc.nextLine();
//	if (name.contains(inputtxt))
//	{
//	switch (inputtxt)
//	{
//	case "Messi" :
//		age1=32;
//		place1 = "Argentina";
//		game1 = "football";
//		break;
//	case "Sachin" :
//		age1=40;
//		place1 = "India";
//		game1 = "cricket";
//		break;
//	case "Sindhu" :
//		age1=28;
//		place1 = "India";
//		game1 = "badmiton";
//		break;
//	case "Federer" :
//		age1=35;
//		place1 = "Swtzerland";
//		game1 = "tennis";
//		break;
//	case "Virat" :
//		age1=31;
//		place1 = "India";
//		game1 = "cricket";
//		break;
//	case "Ronaldo" :
//		age1=33;
//		place1 = "Portugal";
//		game1 = "football";
//		break;
//	}
//	 System.out.println(inputtxt+ " is a player of " + age1+ " years old from " +place1+ " and he plays " +game1);
//	}
//	else
//	{
//		System.out.println("Player " +inputtxt+ " name does not exist.");
//	}
//	}
//	catch (InputMismatchException e) {
//		e.getStackTrace();
//	}
//	
//	
//}
		
	       
	           Break ar=new Break();
	          System.out.println(ar.getPriceDetails());
	           
	           
	       }
	       
	        public String getPriceDetails(){
	           Scanner sc=new Scanner(System.in);
	           try{
	            System.out.println("Enter the number of elements in the array");
	            int number=sc.nextInt();
	          System.out.println("Enter the price details");
	           int [] arr=new int[number];
	           
	       
	                
	               for(int i=0;i<number;i++){
	                    arr[i]=sc.nextInt();
	                }
	                System.out.println("Enter the index of the array element you want to access");
	            int index=sc.nextInt();
	           return("The array element is "+arr[index]);
	                
	                
	            }catch(InputMismatchException e){
	                return ("Input was not in the correct format");
	            }catch(ArrayIndexOutOfBoundsException E){
	                return ("Array index is out of range");
	            }
	            
	            
	        }
}
	    
