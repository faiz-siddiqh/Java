package collectionExercise;
import java.util.ArrayList;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.io.IOException;
public class ArrayListExample {


	public static void main(String[] args) 
	{		
		ArrayList<String> alldata =new ArrayList<String>();	
		// TODO Auto-generated method stub
//		ArrayList<ArrayList<String> > ab = new ArrayList<ArrayList<String> >(); 
		try 
		{
			File sr=new File ("file.txt");
			Scanner myReader=new Scanner(sr);
			//Loop through each line in input file and add to array list
			while(myReader.hasNextLine()) 
			{
				String data= myReader.nextLine();
				alldata.add(data);
//				ab.add(new ArrayList<String>(Arrays.asList(list))); 
			}
			myReader.close();		
			//Get the name 
			String strInputTxt= JOptionPane.showInputDialog("Please Enter Player Name:").toLowerCase();
			
			//From Array List print the information	
			String strGame = "NoUser";
			String strFnlOp = "";
			for (String strLine : alldata)
			{
				String[] strBrkLine = strLine.split(" ");
				//Messi is a player of 32 years old from Argentina and he plays football.
				if (strBrkLine[0].equalsIgnoreCase(strInputTxt))
				{		
					if (strInputTxt.equalsIgnoreCase("messi"))
					{
						strGame = "football";
					}
					else if (strInputTxt.equalsIgnoreCase("sachin"))
					{
						strGame = "Cricket";
					}
					else if (strInputTxt.equalsIgnoreCase("Sindhu"))
					{
						strGame = "Badminton";
					}
					else if (strInputTxt.equalsIgnoreCase("Federer"))
					{
						strGame = "Tennis";
					}
					else if (strInputTxt.equalsIgnoreCase("Virat"))
					{
						strGame = "Cricket";
					}
					else if (strInputTxt.equalsIgnoreCase("Ronaldo"))
					{
						strGame = "football";
					}					
					strFnlOp = strBrkLine[0] + " is a player of " + strBrkLine[1] + " years old from " + 
							strBrkLine[2] + " and he plays " + strGame + ".";
				}			
			}
			if (strGame.equalsIgnoreCase("NoUser"))
			{
				strFnlOp = "This user does not exist in our database.";
			}
			
			System.out.println(strFnlOp);
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("an error has occured");
			e.getStackTrace();
		}
	}
}
