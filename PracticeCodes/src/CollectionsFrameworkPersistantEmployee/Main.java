package CollectionsFrameworkPersistantEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(Integer.parseInt(sc.nextLine()),sc.nextLine(),Float.parseFloat(sc.nextLine()));
		EmployeeUtility ut=new EmployeeUtility();
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(emp);
		String fileName="C:\\Users\\fasid\\eclipse-workspace\\PracticeCodes\\src\\CollectionsFrameworkPersistantEmployee\\New Text Document";
		ut.addEmployee(fileName, al);
		Employee empp=ut.viewEmployeeById(fileName, Integer.parseInt(sc.nextLine()));
//		System.out.println(empp.getName());
		
	}
}
