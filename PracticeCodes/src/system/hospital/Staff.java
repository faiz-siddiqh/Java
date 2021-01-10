package system.hospital;

public class Staff extends User {
	private long stafftId;
	private int yearsOfExperience;
	private String description;
	private double salary;

	public long getStafftId() {
		return stafftId;
	}

	public void setStafftId(long stafftId) {
		this.stafftId = stafftId;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}