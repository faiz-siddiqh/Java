package system.hospital;

public class GoldPlan extends HealthInsurancePlan {
	private double discount;

	public void setCoverage(HealthInsurancePlan insurancePlan) {
		insurancePlan.setCoverage(0.8);
	}

	public double getDiscount() {
		this.discount = 40.0;
		return discount;
	}

	  public  double computeMonthlyPremium(double salary,int age,boolean smoking) {
			 double premium=salary*0.08+getOfferedBy().computeMonthlyPremium(this, age, smoking); 
			 
			  return premium;
		  }	
}
