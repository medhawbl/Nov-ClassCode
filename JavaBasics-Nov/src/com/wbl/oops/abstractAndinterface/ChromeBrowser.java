package com.wbl.oops.abstractAndinterface;

public class ChromeBrowser extends Browser{

	public ChromeBrowser(){
		System.out.println("Chrome child class constructor");
	}
	
	@Override
	public void locateElementsByInspectors() {
		System.out.println("Chrome inspection of elements can be done by XPathHelper");
	}

	@Override
	public String javaScriptEngine() {
		System.out.println("Chrome JS engine");
		return "chromeV8";
	}

	@Override
	public void handleCookies() {
		System.out.println("Chrome has its browser cache to handle cookies");
	}
	
	

}
