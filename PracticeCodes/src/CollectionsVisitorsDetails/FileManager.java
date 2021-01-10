package CollectionsVisitorsDetails;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import necessary packages
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
    static public File createFile()
    {
    	File f = new File("visitors.txt");
    	try
    	{
    	 f.createNewFile();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	return f;
    }
    static public void writeFile(File f, String record)
	{
    	try
    	{
	    FileWriter fw = new FileWriter(f,true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(record);
	    bw.flush();
	    bw.close();
	    fw.close();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
	} 
	static public String[] readFile(File f)
	{
		String [] records=null;
		try
		{
	    FileReader fr = new FileReader(f);
	    BufferedReader br = new BufferedReader(fr);
	    String str = br.readLine();
	    records = str.split(";");
	    br.close();
	    fr.close();
		}
		catch(IOException e)
    	{
    		e.printStackTrace();
    	}
	    return records;
	}
 }