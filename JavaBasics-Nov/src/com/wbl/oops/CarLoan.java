package com.wbl.oops;

public class CarLoan extends Loan {
	

	private String LOANTYPE ="Car";
	
	@Override
	public void displayLoanDetails(){
		System.out.println("Overriding parent/super class method as per child/sub class requirement");
		System.out.println("loan id:"+getLoanId()+ "::custId::"+getCustId()+"::loanType::"+LOANTYPE);
	}	
	
}
