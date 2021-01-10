package studentcollege;

import java.util.Scanner;

public class StudentMain {
	private static String Input;
	private static int studentId;
	private static String studentName, studentAddress, collegeName;
	private static boolean correct;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student's Id:");
		studentId = sc.nextInt();
		System.out.println("Enter Student's Name:");
		studentName = sc.next();
		System.out.println("Enter Student's address:");
		studentAddress = sc.next();
		while (!correct) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			Input = sc.next();
			if (Input.equalsIgnoreCase("Yes")) {
				Student s = new Student(studentId, studentName, studentAddress);
				break;
			}
			if (Input.equalsIgnoreCase("No")) {
				System.out.println("Enter the collge name:");
				collegeName = sc.next();
				Student s = new Student(studentId, studentName, studentAddress, collegeName);
				break;
			}
			System.out.println("Wrong Input");
		}

	}
}
