package ContactDetailsHosteller;

import java.util.Scanner;

public class Main {
	private static  String Input;
	public static Hosteller getHostellerDetails() {
		Scanner sc = new Scanner(System.in);
		Hosteller student = new Hosteller();
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		student.setStudentId(sc.nextInt());
		System.out.println("Student Name");
		student.setName(sc.next());
		System.out.println("Department Id");
		student.setDepartmentId(sc.nextInt());
		System.out.println("Gender");
		student.setGender(sc.next());
		System.out.println("Phone Number");
		student.setPhone(sc.next());
		System.out.println("Hostel Name");
		student.setHostelName(sc.next());
		System.out.println("Room Number");
		student.setRoomNumber(sc.nextInt());
		System.out.println("Modify Room Number(Y/N)");
		Input=sc.next();
		if(Input.equalsIgnoreCase("Y")) {
			System.out.println("New Room Number");
			student.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(Y/N)");
		Input=sc.next();
		if(Input.equalsIgnoreCase("Y")) {
			System.out.println("New Phone Number");
			student.setPhone(sc.next());
		}
		System.out.println("The Student Details");
		System.out.println(student.getDepartmentId()+" "+student.getName()+" "+student.getGender()+" "+student.getPhone()+" "+student.getHostelName()+" "+student.getRoomNumber());
		
		return student;
	}

	public static void main(String[] args) {
		getHostellerDetails();
		
		
	}
}
