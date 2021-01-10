package cipher;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CipherKey {
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

			}
		}
		return ciphert;
	}

	public static String decrypt(String ciphert, int key) {
		ciphert = ciphert.toLowerCase();
		String plaint = "";
		for (int i = 0; i < ciphert.length(); i++) {
			int charpos = str.indexOf(ciphert.charAt(i));
			int keyval = (charpos - key) % 26;
			if (keyval < 0) {
				keyval = str.length() + keyval;
			}
			char replaceval = str.charAt(keyval);
			plaint = plaint + replaceval;
		}
		return plaint;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the encrypted text:");
		String msg = br.readLine();
		String key = br.readLine();
		int k = Integer.parseInt(key);
		System.out.println("Encrypted Text");
		System.out.println(encrypt(msg, k));
		System.out.println("The decrypted text");
		System.out.println(decrypt(encrypt(msg, k), k));

	}
}