package system.hospital;


public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here
   static private double coverage;
   static private double premium;
   static private InsuranceBrand insuranceBrand;
   
   public InsuranceBrand getOfferedBy() {
	   return insuranceBrand;
   }
   
   public void setOfferedBy(InsuranceBrand insuranceBrand) {
	   this.insuranceBrand=insuranceBrand;
   }
   
    public double getCoverage(){
        return coverage;
    }
    public  void setCoverage(double coverage){
        this.coverage=coverage;
    }   
    
    public abstract double computeMonthlyPremium(double salary,int age,boolean smoking);
    
    
    public static void main(String args[]) {
    	
    	User staff=new User();
    	InsuranceBrand insurancebrand=new BlueCrossBlueSheild();
    	
    	HealthInsurancePlan insurancePlan =new PlatinumPlan();
    	insurancePlan.setOfferedBy(insurancebrand);
    	staff.setInsurancePlan(insurancePlan);
    	System.out.println(insurancePlan.computeMonthlyPremium(8000, 56, false));
    }
    
    
    
    
   
	
	}
