package com.wbl.oops;

import com.wbl.util.Calculator;

public class TestGreetingStaticExample {

	public static void main(String[] args) {
		GreetingStaticExample greet1 = new GreetingStaticExample();
		greet1.setUserName("Ahad");
		System.out.println(greet1.userName);
		System.out.println(GreetingStaticExample.greet);
		greet1.hello();
		
		GreetingStaticExample greet2 = new GreetingStaticExample();
		greet2.setUserName("Sanita");
		System.out.println(greet2.userName);
		System.out.println(GreetingStaticExample.greet);
		greet2.hello();
		
		GreetingStaticExample greet3 = new GreetingStaticExample();
		GreetingStaticExample greet4 = new GreetingStaticExample();
		
		Calculator.getResult(45, 45, '+');
		
		
		/*
		greet = new HelloGreetingStaticExample();
		greet.setUserName("Ahad");
		greet.hello();
		

		GreetingStaticExample greet1 = new HelloGreetingStaticExample();
		HelloGreetingStaticExample greet2 = (HelloGreetingStaticExample)greet1;
		greet2.setUserName("Ahad");
		greet2.hello();

		GreetingStaticExample greet3 = new GreetingStaticExample();
		HelloGreetingStaticExample greet4 = (HelloGreetingStaticExample)greet3;
		greet4.setUserName("Ahad");
		greet4.hello();
		
		*/
		
		

	}

}
