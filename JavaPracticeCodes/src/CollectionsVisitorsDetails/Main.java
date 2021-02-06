package CollectionsVisitorsDetails;

import java.io.File;
import java.util.Scanner;

 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FileManager fileManager = new FileManager();
		File f = fileManager.createFile();
		String choice;
		int flag = 0;
		do
		{
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Phone Number");
			long phone = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Email");
			String email = sc.nextLine();
			String record  = name+","+phone+","+email;
			if(flag==1)
			{
				record = ";"+record;
			}
			fileManager.writeFile(f, record);
			
			flag = 1;
			
			System.out.println("Do you want to enter another record(yes/no)");
			choice = sc.nextLine();
			
			
		}while(choice.equalsIgnoreCase("yes"));
		
		String[] fileRecord = fileManager.readFile(f);
		for(String record : fileRecord)
		{
			System.out.println(record);
		}
			
	}
    
}