package EmployeeLoan;


public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount;
		if(employeeObj instanceof PermanentEmployee) {
		return	loanAmount=0.15*employeeObj.getSalary();
		}
		if(employeeObj instanceof TemporaryEmployee) {
			return	loanAmount=0.1*employeeObj.getSalary();
			}
		
		return 0;
	}

}

