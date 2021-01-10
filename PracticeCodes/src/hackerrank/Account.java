
package hackerrank;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Account {
	private long accountNumber;
	private double balanceAmount;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public void setaccountNumber( long accountNumber) {
		this.accountNumber=accountNumber;
		
	}
	public void setBalance(double balanceAmt) {
		this.balanceAmount=balanceAmt;
	}
	
	public long getaccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balanceAmount;
	}
	
	
	public void deposit(double depositAmt) {
	double balanceAmt=getBalance()+depositAmt;
	setBalance(balanceAmt);
	System.out.println("Available balance is:"+ df2.format(getBalance()));	
	}
	
	public boolean withdraw(double withdrawAmt) {
		if(withdrawAmt>balanceAmount) {
			System.out.println("Insufficient balance");
			System.out.println("Available balance is:"+ getBalance());
			return false;
		}
		double balanceAmt=getBalance()-withdrawAmt;
		setBalance(balanceAmt);
		System.out.println("Available balance is:"+ df2.format(getBalance()));
		
		return true;
	}

}
class Mainn{
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	Account newAccount=new Account();
	System.out.println("Enter the account number:");
	newAccount.setaccountNumber(sc.nextLong());
	System.out.println("Enter the available amount in the account:");
	newAccount.setBalance(sc.nextDouble());
	System.out.println("Enter the amount to be deposited:");
	newAccount.deposit(sc.nextDouble());
	System.out.println("Enter the amount to be withdrawn:");
	newAccount.withdraw(sc.nextDouble());
	
}
}