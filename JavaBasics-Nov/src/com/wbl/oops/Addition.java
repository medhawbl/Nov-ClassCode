package com.wbl.oops;


public class Addition {
	
	 int add(int a , int b){
		System.out.println("2 int input params");
		int c = a+b;
		
		return c;
	}	
	
	 float add(float a , float b){
		System.out.println("2 float input params");
		float c = a+b;
		return c;
	 }
	
	public float add(int a , float b){
		System.out.println("1 int  and 1 float input params");
		float c = a+b;
		return c;
	}
	
	public int add(int a , int b, int c){
		System.out.println("3 int input params");
		int d = a+b+c;
		return d;
	}
	
	

}
