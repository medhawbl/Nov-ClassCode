package com.wbl.main;

public class Calculator {
	
	public double doCalc(double a, double b, char ch){
		System.out.println("In calculator........");
		double result=0.0;
		switch(ch){
		case '+' : result = a+b;
		break;
		case '-' : result = a-b;
		break;
		case '*' : result = a*b;
		break;
		case '/' : result = a/b;
		break;
		case '%' : 
			if(b!=0)
			result = a%b;
		break;
		
		}
		
		return result;
		
	}
	

}
