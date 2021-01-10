package collectionFramework;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class DisplayOnConsole {

	
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new FileReader("Hi faiz")); 
//		while (in.readLine() != null) {
//		      System.out.println(in.);          
//		}         
//		in.close();
//	}
	public static void main(String[] args) throws IOException {
		
	
	InputStream input = new BufferedInputStream(new FileInputStream("C:/logs.txt"));
	byte[] buffer = new byte[8192];

	try {
	    for (int length = 0; (length = input.read(buffer)) != -1;) {
	        System.out.write(buffer, 0, length);
	    }
	} finally {
	    input.close();
	}
}
}
