package advancedJavaLamdaExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtility {
	static String name;
	static String product;
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		product = sc.nextLine();
		Validate v = validateEmployeeName();

		String message = (v.validateName(name)) ? "Employee name is valid" : "Employee name is invalid";
		System.out.println(message);

		Validate u = validateProductName();
		String message1 = (u.validateName(product)) ? "Product name is valid" : "Product name is invalid";
		System.out.println(message1);
	}

	public static Validate validateEmployeeName() {
		return (name) -> {

			boolean f = (name.matches("[a-zA-Z ]+")) && (name.length() >= 5 && name.length() <= 20) ? true : false;
			return f;
		};

	}

	public static Validate validateProductName() {
		String regex = "[0-9]+";

		return (name) -> {

			Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher hasSpecial = special.matcher(product);

			boolean f = (Character.isLetter((product.charAt(0))) && product.length() == 6
					&& product.substring(1, 5).matches(regex) && !hasSpecial.find()) ? true : false;
			return f;
		};

	}
}
