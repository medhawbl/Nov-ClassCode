package com.wbl.oops;

public class MortgageLoan extends Loan{
	
	private String LOANTYPE ="Mortgage";
	
	@Override
	public void displayLoanDetails(){
		System.out.println("Overriding parent/super class method as per child/sub class requirement");
		System.out.println("loan id:"+getLoanId()+ "::custId::"+getCustId()+"::loanType::"+LOANTYPE);
	}
	
	@Override
	public MortgageLoan getLoanObject(){
		MortgageLoan loanObj = new MortgageLoan();
		return loanObj;
	}
	

}
