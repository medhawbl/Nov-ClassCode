package com.wbl.junit.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.wbl.main.ReadProperties;

public class PropertiesTest {
	
	
	
	@Test(expected=FileNotFoundException.class)
	public void getCityTest() throws FileNotFoundException, IOException{
		ReadProperties rp = new ReadProperties();
		rp.propertiesExample("prop1.properties");
		
	//	Assert.assertEquals("fremont",rp.propertiesExample("prop1.properties"));
	}

}
