package com.wbl.oops;

import com.wbl.oops.abstractAndinterface.ChromeIBrowser;

public class AndroidMobile extends Mobile {
	
	//super is also used to call parent class constructor from child constructor
	public AndroidMobile(){
		super();
		System.out.println("constructor is called when object is created- we can make use of it +"
				+ "to intialise any variables data required by class");
	}
	
	public AndroidMobile(int version){
		super();
		this.version = version;
		System.out.println("constructor is called when object is created- we can make use of it +"
				+ "to intialise any variables data required by class");
	}
	
	//overrriding- writing same method which is in parent class again in child
	//class to provide any child class specific behaviour if required
	//scope can be widen - private->default->protected->public
	//return type should be same but u can make a covariant retutn type
	//super is used in child class to refer parent class methods or variables
	public int getVersion(){
		System.out.println("android/child class specific logic::"+version);
		super.getMobileObject();
		return version;
		
	}
	
	//covariant return type- returning child class return type(ChromeIBrowser) instead of 
	//parent class return type(IBrowser) as per Mobile(super class)
	public ChromeIBrowser getMobileObject(){
		ChromeIBrowser m = new ChromeIBrowser();
		return m;
	}
	
	public VersionChild getVersionObj(){
		return new VersionChild();
	}

}
