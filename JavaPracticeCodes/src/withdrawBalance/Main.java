package withdrawBalance;

public class Main {

	public static void main(String[] args) {
		  Customer customer=new Customer(1001,"faiz","fasiddiqh");
	        SavingsAccount account=new SavingsAccount(101010101,customer,5000,1000);
	        System.out.println(account.getBalance());
	        System.out.println(account.getMinimumBalance());
	      System.out.println(account.withdraw(4500));      
	   

	}

}
