package com.wbl.oops;

import com.wbl.oops.abstractAndinterface.ProjectConstants;

public class HelloGreeting extends GreetingStaticExample{

	public void hello(){
		System.out.println(ProjectConstants.COMPANY);
		System.out.println("sub class- hello "+ userName);
	}

}
