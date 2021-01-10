package withdrawBalance;

public class SavingsAccount extends Account {
private double minimumBalance;


    //Uncomment the getters and setters after writing the attributes
     public SavingsAccount(int accountNumber, Customer customerObj, double balance,double minimumBalance){
     super(accountNumber, customerObj, balance);
     this.minimumBalance=minimumBalance;
 }
 
  public boolean withdraw(double amount){
	  if(balance>minimumBalance && amount<balance){
          balance-=amount;
          setBalance(balance);
          if(minimumBalance<=getBalance()) {
          return true;
          }
          
      }
      
      return false;
  }
    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    

    
}
