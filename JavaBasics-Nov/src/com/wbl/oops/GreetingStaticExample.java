package com.wbl.oops;

public class GreetingStaticExample {
	
	public String userName;
	public static int count=0;// class level variable but not object level
	public static String greet = "hello world";
	
	public GreetingStaticExample(){
		count++;
		System.out.println("count of objects is::"+ count);
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void hello(){
		System.out.println("hello "+ userName);
	}

}
