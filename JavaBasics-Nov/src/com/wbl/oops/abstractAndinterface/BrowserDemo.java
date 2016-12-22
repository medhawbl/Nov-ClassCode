package com.wbl.oops.abstractAndinterface;

public class BrowserDemo {

	public static void main(String[] args) {
		ChromeBrowser browser1 = new ChromeBrowser();
		//Browser browser1 = new ChromeBrowser();
		browser1.browserName="Firefox";
		browser1.version=48;
		browser1.browseInfo();
		browser1.openWebApplications();
		browser1.locateElementsByInspectors();
		browser1.javaScriptEngine();
		browser1.handleCookies();
		browser1.displayBrowserDetails();
		
		MozillaBrowser browser2 = new MozillaBrowser();
		//Browser browser2 = new MozillaBrowser();
		browser2.browserName="Chrome";
		browser2.version=55.2f;
		browser2.browseInfo();
		browser2.openWebApplications();
		browser2.locateElementsByInspectors();
		browser2.javaScriptEngine();
		browser2.handleCookies();
		browser2.displayBrowserDetails();
		
		IBrowser ci = new ChromeIBrowser();
		ci.browseInfo();
	}

}
