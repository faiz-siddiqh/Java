package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
		Comparator<Student> c=(S1,S2)->{
			Double d1=S1.getCgpa();
			Double d2=S2.getCgpa();
			
			Integer I1=(Integer)S1.getId();
			Integer I2=(Integer)S2.getId();
			
			
			String name1=S1.getFname();
			String name2=S2.getFname();
			if(d1.equals(d2)) {
				return name1.compareTo(name2);
			}			
			else if(name1.equals(name2) && d1.equals(d2)) {
				return I1.compareTo(I2);
				
			}
			
			
			return -d1.compareTo(d2);
		};
		
		List<Student>studentList2=studentList.stream().sorted(c).collect(Collectors.toList());
      
      	for(Student st: studentList2){
			System.out.println(st.getFname());
		}
	}
}



