package com.wbl.oops.abstractAndinterface;

public abstract class Browser{
	
	public String browserName;
	protected float version;
	
	public Browser(){
		System.out.println("parent or abstract class constructor");
	}
	
	//concrete methods - which have method body/implementation
	public void browseInfo(){
		System.out.println("Browse for any data in google");
	}
	
	public void openWebApplications(){
		System.out.println("Open the given web app by http or https url");
	}
	
	public void displayBrowserDetails(){
		System.out.println("Browser:"+browserName+":version:"+version);
	}
	
	//abstract methods - which do not have method body
	public abstract void locateElementsByInspectors();
	
	public abstract String javaScriptEngine();
	
	public abstract void handleCookies();
	

}
