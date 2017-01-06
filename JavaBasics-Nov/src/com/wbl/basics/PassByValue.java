package com.wbl.basics;

public class PassByValue {
	
	
	String greet;
	
	public void increment(int input){		
		input = input+5;		
	}
	
	public void greet(PassByValue obj){
		obj.greet = "hello world";
	}

	public static void main(String[] args) {
		PassByValue pb = new PassByValue();
		pb.greet="hello";
		
		//primtives - copy of actualmvalue is sent to called method
		int i =10;
		System.out.println("Before method call::"+i);
		pb.increment(i);//passes the copy of value to called method
		System.out.println("After method call::"+i);
		
		//Objects - copy of reference value is sent to called method
		
		System.out.println("Before method call::"+pb.greet);
		pb.greet(pb);//passes the copy of reference value to called method
		System.out.println("After method call::"+pb.greet);

	}

}
