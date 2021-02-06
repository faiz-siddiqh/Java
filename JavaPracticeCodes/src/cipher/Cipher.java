package cipher;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fasid
 * Date :22/07/2020
 *
 */
class Cipher {
	public static String str = "abcdefghijklmnopqrstuvwxyz";

	public static String encrypt(String plaint, int key) {

		String ciphert = "";
		plaint = plaint.replaceAll("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]", "");
		Pattern p = Pattern.compile("[a-zA-z ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(plaint);
		boolean b = m.find();
		if (!b) {
			return "No hidden message";
		} else {
			for (int i = 0; i < plaint.length(); i++) {
				if (Character.isUpperCase(plaint.charAt(i))) {
					String Uppercase = Character.toString(plaint.charAt(i));
					Uppercase = Uppercase.toLowerCase();
					char uppercase = Uppercase.charAt(0);
					int charposs = str.indexOf(uppercase);
					int keyval = (charposs + key) % 26;
					char replaceval = Character.toUpperCase(str.charAt(keyval));
					ciphert = ciphert + replaceval;
					continue;
				} else if (Character.isWhitespace(plaint.charAt(i))) {
					ciphert = ciphert + " ";
					continue;
				} else if (Character.isDigit(plaint.charAt(i))) {
					continue;
				}
				int charpos = str.indexOf(plaint.charAt(i));
				int keyval = (charpos + key) % 26;
				char replaceval = str.charAt(keyval);
				ciphert = ciphert + replaceval;
//    		   if(Character.isUpperCase(plaint.charAt(i))) {
//    			  Character.toUpperCase(replaceval);
//    			  ciphert= ciphert+replaceval;
//    		   }

			}
		}
		return ciphert;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the encrypted text:");
		String msg = br.readLine();
		int key = 19;
		System.out.println("Decrypted text:");
		System.out.println(encrypt(msg, key));

	}
}