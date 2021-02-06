package hackerrank;
import java.util.Scanner;

public class EmployeeSalary {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Employer newemployee = getEmployeeDetails();
		int pfPercentage = getPFPercentage();
		System.out.println("Id: " + newemployee.getEmployeeId());
		System.out.println("Name: " + newemployee.getEmployeeName());
		System.out.println("Salary: " + newemployee.getSalary());
		System.out.print("Net Salary: ");
		newemployee.calculateNetSalary(pfPercentage);
		System.out.print(newemployee.getNetSalary());

	}

	public static Employer getEmployeeDetails() {

		Employer employee = new Employer();

		System.out.println("Enter Id: ");
		employee.setEmployeeId(scanner.nextInt());
		System.out.println("Enter Name: ");
		employee.setEmployeeName(scanner.next());
		System.out.println("Enter salary: ");
		employee.setSalary(scanner.nextDouble());
		return employee;
	}

	public static int getPFPercentage() {
		System.out.println("Enter PF percentage:");
		int pfPercentage = scanner.nextInt();

		return pfPercentage;
	}

}

class Employer {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	// double pfpercentage;

	public void setEmployeeId(int EmplyoeeId) {
		this.employeeId = EmplyoeeId;
	}

	public void setEmployeeName(String EmployeeName) {
		this.employeeName = EmployeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void calculateNetSalary(int pfpercentage) {
		double d = pfpercentage;
		double pfAmount = salary * (d / 100);
		double netSalary = salary - pfAmount;
		this.setNetSalary(netSalary);
	}

	public double getNetSalary() {

		return netSalary;
	}

}
