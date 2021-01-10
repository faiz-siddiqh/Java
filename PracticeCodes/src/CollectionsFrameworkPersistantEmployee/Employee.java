package CollectionsFrameworkPersistantEmployee;

public class Employee implements java.io.Serializable {
	
	private int employeeId;
	private String name;
	private float  appraisalRating;
	
	public Employee(int empid, String name,float  appraisalRating) {
		
		this.employeeId = empid;
		this.name = name;
		this.appraisalRating=appraisalRating;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAppraisalRating() {
		return appraisalRating;
	}

	public void setAppraisalRating(float appraisalRating) {
		this.appraisalRating = appraisalRating;
	}
}

