package com.wbl.opertorsLoops;

import com.wbl.oops.Loan;
import com.wbl.oops.MortgageLoan;

public class Operators {

	public static void main(String[] args) {
		
		int a = 40;
		int b= 5;
		//arithmetic
		int result = a+b;
		System.out.println("a+b:"+result);

		result = a-b;
		System.out.println("a-b:"+result);
		
		System.out.println("a*b:"+(a*b));
		System.out.println("a/b:"+(a/b));
		System.out.println("a%b:"+(a%b));
		
		result = (4+6)*5;
		System.out.println("result:"+result);
		
		//unary opeartors
		int i = 10;
		System.out.println("post increment::"+(i++));
		System.out.println("post increment after statement::"+(i));
		
		System.out.println("prefix increment::"+(++i));
		System.out.println("prefix increment after statement::"+(i));
		
		int b1 = 6;//0110
		b1= ~b1;
		System.out.println("negation::"+(b1));
		boolean b2 = true;
		System.out.println("not on boolean:"+ !b2);
		
		//equality or relational- always evaluate to boolean-true or false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		a=50;
		b=250;
		int c= 17;
		//logical or short circuit and and or
		if( a>b && a>c){
			System.out.println("a is greater");
		}
		
		if( a>b || a>c){
			System.out.println("a is greater");
		}
		
		//ternary operator
		/*if(a>b){
			result=a;
		}else{
			result =b;
		}*/
		result = a>b ? a : b; 
		System.out.println(result);
		
		//instanceof operator - to check object is instance of specfic class or not
		Loan l = new Loan();
		if(l instanceof MortgageLoan){
			System.out.println("l is instance of loan");
		}else{
			System.out.println("it is not instance");
		}
		
		//bitwise operators
		int i1 = 6;
		i1= i1>>1;//signed right shift
		System.out.println(i1);
		
		i1=6;
		i1= i1<<2;//signed left shift
		System.out.println(i1);
		
		i1 = 6;
		i1= i1>>>1;//unsigned right shift which is only for positive
		System.out.println(i1);
		int res = 6&5;
		System.out.println(res);
		
		int k=5;
		k = k+5;
		k = 5;
		
	}

}
