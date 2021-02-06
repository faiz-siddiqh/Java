package system.hospital;

public   class BlueCrossBlueSheild implements InsuranceBrand{
	private long id;
	private String name;
	private double premium;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  double computeMonthlyPremium(HealthInsurancePlan insurancePlan,int age,boolean smoking) {
		if(insurancePlan instanceof PlatinumPlan) {
			if (age > 55) {
				premium += 200;
			}
			if (smoking==true) {
				premium += 100;
			}
		}
		if(insurancePlan instanceof GoldPlan) {
			if (age > 55) {
				premium += 150;
			}
			if (smoking==true) {
				premium += 90;
			}
		}
		if(insurancePlan instanceof SilverPlan) {
			if (age > 55) {
				premium += 100;
			}
			if (smoking==true) {
				premium += 80;
			}
		}
		if(insurancePlan instanceof BronzePlan) {
			if (age > 55) {
				premium += 50;
			}
			if (smoking==true) {
				premium += 70;
			}
		}
		
		return premium;
	}
}
