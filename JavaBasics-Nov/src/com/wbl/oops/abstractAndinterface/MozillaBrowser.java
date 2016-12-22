package com.wbl.oops.abstractAndinterface;

public class MozillaBrowser extends Browser {
	
	public MozillaBrowser(){
		System.out.println("mozilla child class constructor");
	}

	@Override
	public void locateElementsByInspectors() {
		System.out.println("MozillaFirefox inspection of elements can be done by Firepath plugin");
	}

	@Override
	public String javaScriptEngine() {
		System.out.println("MozillaFirefox JS engine");
		return "rhinoEngine";
	}

	@Override
	public void handleCookies() {
		System.out.println("Mozilla has its browser cache to handle cookies");
	}
	
	public void mozillaDefaultYahooSearch(){
		System.out.println("yahoo search engine");
	}

}
