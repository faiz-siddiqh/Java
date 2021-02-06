package studentcollege;

public class Student {
	private int studentId;
	private String studentName, studentAddress, collegeName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		setCollegeName("NIT");
		System.out.println("Student id:" + getStudentId());
		System.out.println("Student name:" + getStudentName());
		System.out.println("Address:" + getStudentAddress());
		System.out.println("College name:" + getCollegeName());

	}

	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
		System.out.println("Student id:" + getStudentId());
		System.out.println("Student name:" + getStudentName());
		System.out.println("Address:" + getStudentAddress());
		System.out.println("College name:" + getCollegeName());
	}

}
