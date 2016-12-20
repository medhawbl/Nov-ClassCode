package com.wbl.oops;

public class Loan {
	
	private static int idGenerator;
	private int loanId;	
	private int custId;
	private String loanType;
	
	int RATE_OF_INTEREST=8;
	
	public Loan(){
		loanId = ++idGenerator;
	}
	/*
	//setter-sets the data by taking i/p parameter
	public void setLoanId(int loanId){
		if(loanId>0){
		this.loanId = loanId;
		}else{
			System.out.println("LoanID cannot be negative");
		}
	}*/
	
	//getter-returns the data
	public int getLoanId(){
		return loanId;
	}	
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		if(custId>0){
		this.custId = custId;
		}else{
			System.out.println("CustID cannot be negative");
		}
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public void displayLoanDetails(){
		System.out.println("loan id:"+loanId+ "::custId::"+custId+"::loanType::"+loanType);
	}
	
	public int getPrincipal(){
		return 74839;
	}
	
	public float getInterestDetails(float principal, int tenure){
		float interestAmount = (principal*tenure*RATE_OF_INTEREST)/100;
		return interestAmount;
	}	
	
	public Loan getLoanObject(){
		Loan loanObj = new Loan();
		getInterestDetails(getPrincipal(), 7);
		return loanObj;
		
		
	}
	
	

}
