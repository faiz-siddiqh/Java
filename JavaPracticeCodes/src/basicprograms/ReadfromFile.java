package basicprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class ReadfromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub\
		try {
			File Myobj = new File("collectons exercize.txt");
			Scanner myReader = new Scanner(Myobj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
		
       

}
}
