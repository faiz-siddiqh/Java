package system.hospital;

public  interface InsuranceBrand {
	
	public abstract double computeMonthlyPremium(HealthInsurancePlan insurancePlan,int age,boolean smoking);
	
}