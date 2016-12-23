package com.wbl.oops;

import com.wbl.oops.abstractAndinterface.ChromeIBrowser;
import com.wbl.oops.abstractAndinterface.IBrowser;

public class Mobile {
	
	protected int version;
	
	public Mobile(){
		
	}
	
	//method is returning primitivetype
	public int getVersion(){
		System.out.println("parent class version method::"+version);
		return version;		
	}
	
	//method is returning an object
	public IBrowser getMobileObject(){
		IBrowser m = new ChromeIBrowser();
		return m;
	}
	
	// this method is also object
	public Version getVersionObj(){
		return new Version();
	}

}
