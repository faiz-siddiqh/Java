package basicprograms;

import java.util.*;

class Course {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "", s1;
		String arr[];
		System.out.println("Enter no of course:");
		int no = sc.nextInt();
		if (no <= 0) {
			System.out.println("Invalid Range");
		}
		System.out.println("Enter course names:");
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 1; i <= no; i++) {
			s = sc.next();
			ar.add(s);
		}
		System.out.println("Enter the course to be searched:");
		s1 = sc.next();
		for (int i = 0; i < ar.size(); i++) {
			if (s1.equalsIgnoreCase(ar.get(i))) {
				System.out.println(s1 + " course is available");
				return;
			}
		}
		System.out.println(s1 + " course is not available");

//        if(s.equalsIgnoreCase(s1)){
//            System.out.println(s1+" course is available");  
//        }else{
//             System.out.println(s1+" course is not available");  
//        }

	}

}