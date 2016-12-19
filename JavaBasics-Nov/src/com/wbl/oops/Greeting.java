package com.wbl.oops;

public class Greeting {
	
	public String userName;
	/*
	public Greeting(String userName){
		this.userName = userName;
	}
	*/
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void hello(){
		System.out.println("hello "+ userName);
	}

}
