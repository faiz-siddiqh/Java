package system.hospital;

public class BronzePlan extends HealthInsurancePlan {
	private double discount;

	public void setCoverage(HealthInsurancePlan insurancePlan) {
		insurancePlan.setCoverage(0.6);
	}

	public double getDiscount() {
		this.discount = 30.0;
		return discount;
	}

//	public double computeMonthlyPremium(double salary) {
//		double premium = salary * 0.05;
//		return premium;
//	}
//
//	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
//		double premium = salary * 0.05;
//		if (age > 55)
//			premium += 50;
//		if (!smoking)
//			premium += 70;
//		return premium;
//	}
	  public  double computeMonthlyPremium(double salary,int age,boolean smoking) {
			 double premium=salary*0.08+getOfferedBy().computeMonthlyPremium(this, age, smoking); 
			 
			  return premium;
		  }	
}
