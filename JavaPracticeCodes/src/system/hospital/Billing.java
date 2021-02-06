package system.hospital;


public class Billing {
	static private double finalAmount;
   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = ((User) patient).getInsurancePlan();
        if(patientInsurancePlan == null) {
        	payments[0]=amount-20;
        	return payments;
        }
        finalAmount=amount-(amount*patientInsurancePlan.getCoverage());
        payments[0]=amount*patientInsurancePlan.getCoverage();
        payments[1]=finalAmount;
       
        
        // your logic        

        return payments;
    }
    public static void main(String []args) {
    	Patient patient=new Patient();
    	HealthInsurancePlan insurancePlan=new PlatinumPlan();
    	HealthInsurancePlan insurancePlan1=null;
    	HealthInsurancePlan insurancePlan2=new GoldPlan();
    	HealthInsurancePlan insurancePlan3=new SilverPlan();
    	HealthInsurancePlan insurancePlan4=new BronzePlan();
    	if(insurancePlan instanceof PlatinumPlan ) {
    	patient.setInsurancePlan(insurancePlan);
    	((PlatinumPlan)insurancePlan).setCoverage(insurancePlan);
    	double[]payments=Billing.computePaymentAmount(patient, 1000.0);
    		System.out.println ("$"+payments[0]+" $"+(payments[1]-((PlatinumPlan)insurancePlan).getDiscount()));
    	}
    	if(insurancePlan2 instanceof GoldPlan ) {
        	patient.setInsurancePlan(insurancePlan2);
        	((GoldPlan)insurancePlan2).setCoverage(insurancePlan2);
        	double[]payments=Billing.computePaymentAmount(patient, 1000.0);
        		System.out.println("$"+payments[0]+" $"+(payments[1]-((GoldPlan)insurancePlan2).getDiscount()));
        	}
    	if(insurancePlan3 instanceof SilverPlan ) {
        	patient.setInsurancePlan(insurancePlan3);
        	((SilverPlan)insurancePlan3).setCoverage(insurancePlan3);
        	double[]payments=Billing.computePaymentAmount(patient, 1000.0);
        		System.out.println("$"+payments[0]+" $"+(payments[1]-((SilverPlan)insurancePlan3).getDiscount()));
        	}
    	if(insurancePlan4 instanceof BronzePlan ) {
        	patient.setInsurancePlan(insurancePlan4);
        	((BronzePlan)insurancePlan4).setCoverage(insurancePlan4);
        	double[]payments=Billing.computePaymentAmount(patient, 1000.0);
        		System.out.println("$"+payments[0]+" $"+(payments[1]-((BronzePlan)insurancePlan4).getDiscount()));
        	}
    	if(insurancePlan1==null) {
    		patient.setInsurancePlan(insurancePlan1);
    	double[]payments=Billing.computePaymentAmount(patient, 1000.0);
    	System.out.println("$"+payments[0]);
		
    	}
    }
}


