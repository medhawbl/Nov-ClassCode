package com.wbl.oops;

public class Dog extends Animal{
	
	public Dog(){
		super("hello");
		System.out.println("It is child constructor");
	}
	
	@Override
	public void makeNoise(){		
		System.out.println("Child - Dog says Bow Bow");
	}
	

	//bcz of inheritance - we are able to access parent class methods and variables
	public void features(){
		System.out.println(color);
		eat();//calling through inheritance- parent class method
		super.makeNoise();
		
	}
	
	

}
