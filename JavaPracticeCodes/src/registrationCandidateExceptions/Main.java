package registrationCandidateExceptions;

import java.util.Scanner;

public class Main {

	public static Candidate getCandidateDetails() throws InvalidSalaryException {
		Scanner sc = new Scanner(System.in);
		Candidate candidate = new Candidate();
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		candidate.setName(sc.next());
		System.out.println("Gender");
		candidate.setGender(sc.next());
		System.out.println("Expected Salary");
		candidate.setExpectedSalary(sc.nextDouble());
		if (candidate.getExpectedSalary() < 10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		}

		return candidate;
	}

	public static void main(String[] args) {
		try {
			getCandidateDetails();
			System.out.println("Registration Successful");
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}

	}
}
