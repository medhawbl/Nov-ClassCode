package com.wbl.oops.abstractAndinterface;

public class ChromeIBrowser implements IBrowser, BrowserEngine {

	//concrete methods - which have method body/implementation
	public void browseInfo(){
		System.out.println("Browse for any data in google");
	}
	
	public void openWebApplications(){
		System.out.println("Open the given web app by http or https url");
	}
	
	public void displayBrowserDetails(String browserName,float version){
		System.out.println("Browser:"+browserName+":version:"+version);
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

	@Override
	public String javaScriptExecutor() {
		// TODO Auto-generated method stub
		return null;
	}

}
