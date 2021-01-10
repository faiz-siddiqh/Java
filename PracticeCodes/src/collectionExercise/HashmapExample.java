package collectionExercise;
import java.util.*;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class HashmapExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			br =new BufferedReader(new FileReader("file.txt"));
			Map hmDta = new  HashMap();
			//Read from text and add into hashmap
			String line;
			while ((line = br.readLine())!= null) {
				
//				String [] list=line.split(" |:");
				String strPlyrNme = line.substring(0, line.indexOf(" ")).strip().toLowerCase();
				String strPlyrDtls = line.substring(line.indexOf(" ")).strip();				
				hmDta.put(strPlyrNme, strPlyrDtls);
			}
			//Read Player Name
			String strInputTxt= JOptionPane.showInputDialog("Please Enter Player Name:").toLowerCase();			
			String strFnlOp = "";
		    //If Player name is present in hashmap output the expected text
			if (hmDta.containsKey(strInputTxt))
			{				
				Iterator itr = hmDta.entrySet().iterator();
			      while(itr.hasNext()) {
			         Map.Entry mentry = (Map.Entry)itr.next();
			         if (mentry.getKey().equals(strInputTxt))
			         {
			        	 String[] strBrkLine = mentry.getValue().toString().split(" ");
			        	 String strGame = "";
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
			        	 strFnlOp = mentry.getKey().toString() + " is a player of " + strBrkLine[0] + " years old from " + 
									strBrkLine[1] + " and he plays " + strGame + ".";			        	 
			         }
			      }	
			}
			else
			{
				strFnlOp = "This user does not exist in our database.";
			}
			System.out.println(strFnlOp);
		   }
		catch(IOException e) {
			e.getStackTrace();
		}finally {
			{
				try {
					br.close();
				}catch(IOException e) {
					e.getStackTrace();
					
				}
			}
		}
	}
}