package com.wbl.oops;

public class LoanDemo {

	public static void main(String[] args) {
		Loan loan1 = new Loan();
		loan1.setCustId(6789);
		loan1.setLoanType("Mortgage");
		
		loan1.displayLoanDetails();
		System.out.println("Interest is ::"+loan1.getInterestDetails(5000, 24));
		
		Loan loan2 = new Loan();
		loan2.setCustId(-3268732);
		loan2.setLoanType("Car");
		
		loan2.displayLoanDetails();
		System.out.println("Interest is ::"+loan2.getInterestDetails(5000, 24));
		
		MortgageLoan loan3 = new MortgageLoan();
		loan3.setCustId(3268732);	
		loan3.displayLoanDetails();
		System.out.println("Interest is ::"+loan3.getInterestDetails(5000, 24));
		
		
		CarLoan loan4 = new CarLoan();
		loan4.setCustId(7886);		
		loan4.displayLoanDetails();
		System.out.println("Interest is ::"+loan4.getInterestDetails(5000, 24));
	}

}
