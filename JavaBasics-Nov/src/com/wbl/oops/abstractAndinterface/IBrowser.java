package com.wbl.oops.abstractAndinterface;

public interface IBrowser {
	
	//interface variables are by default public, static and final ie.e, they are constants
	public static final String BROWSER_DEFAULT_PAGE = "http://google.com";
	
	//By dedault - all methods in interface are abstract
	 abstract void browseInfo();
	
	public void openWebApplications();
	
	public void displayBrowserDetails(String browserName,float version);
	
	public void locateElementsByInspectors();
	
	public String javaScriptEngine();
	
	public void handleCookies();
	

}
