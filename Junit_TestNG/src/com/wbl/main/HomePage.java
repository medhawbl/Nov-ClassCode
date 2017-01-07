package com.wbl.main;

public class HomePage {
	
	
	public String doLogin(){
		//to-do write automation code using webdriver to click login and enter credentials
		System.out.println("Click login and enter credentials");
		return "success";
	}
	
	public String recordings(){
		System.out.println("Click on recordings and it should play properly");
		return "playing";
	}
	
	public int presentations(){
		System.out.println("count no of presentations");
		return 20;
	}

}
