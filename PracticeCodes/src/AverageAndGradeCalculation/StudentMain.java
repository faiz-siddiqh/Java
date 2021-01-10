package AverageAndGradeCalculation;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Faiz-Siddiqh
 *Calculate the Average and Grade of Student
 */

public class StudentMain {
	static int noofsubjects;
	static boolean isValid;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.#");

		Student s = getStudentDetails();
		s.calculateAvg();
		s.findGrade();
		System.out.println("Id:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Average:" + df.format(s.getAverage()));
		System.out.println("Grade:" + s.getGrade());

	}

	public static Student getStudentDetails() {
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.next();
		while (isValid) {
			System.out.println("Enter the no of subjects:");
			noofsubjects = sc.nextInt();
			if (noofsubjects <= 0) {
				System.out.println("Invalid number of subject");
				continue;
			}
			isValid = true;
		}
		int i = 0;
		int[] marks = new int[noofsubjects];
		while (i < noofsubjects) {
			System.out.println("Enter mark for subject " + (i + 1) + ":");
			marks[i] = sc.nextInt();
			if (marks[i] > 100 || marks[i] < 0) {
				System.out.println("Invalid Mark");
				continue;
			}
			i++;
		}

		Student student = new Student(id, name, marks);
		return student;
	}

}
