package system.hospital;

public class User {
	private long id;
	// add rest of the variables
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private boolean insured;
	private HealthInsurancePlan insurancePlan;
	private int age;
	private boolean smoking;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isInsured() {
		return this.insured;

	}

	public void setInsured(boolean Insured) {
		this.insured = insured;

	}

	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
}