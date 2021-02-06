package AverageAndGradeCalculation;

/**
 * 
 * @author Faiz-Siddiqh 
 * 
 *Student class having getters and setters, method to
 *         calculate Average marks and Find Grade
 */
public class Student {
	private int id;
	private String name;
	private int[] marks;
	private float average;
	private char grade;
	private float total = 0;

	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		setMarks(marks);
	}

	public void calculateAvg() {
		for (int i = 0; i < getMarks().length; i++) {
			total = total + getMarks()[i];
		}
		average = total / getMarks().length;
		setAverage(average);
	}

	public void findGrade() {
		for (int i = 0; i < getMarks().length; i++) {
			if (getMarks()[i] < 50) {
				setGrade('F');
				return;
			}
		}
		if (getAverage() >= 80 && getAverage() <= 100) {
			setGrade('O');
		} else {
			setGrade('A');
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {

		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
