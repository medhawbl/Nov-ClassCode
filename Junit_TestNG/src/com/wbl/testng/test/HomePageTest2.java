package com.wbl.testng.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class HomePageTest2 {
	HomePage hm;
	
	@BeforeClass
	public void beforeClass(){
		hm= new HomePage();
	}
	
	@Test
	public void testLogin(){
		
		assertEquals("success",hm.doLogin());
	}
	
	@Test(dependsOnMethods={"testLogin"})
	public void testRecordings(){
		assertEquals("plang",hm.recordings());
	}
	
	@Test(dependsOnMethods={"testRecordings"},alwaysRun=true)
	public void testPresentations(){
		assertEquals(20,hm.presentations());
	}
	
	@Test(dependsOnMethods={"testPresentations"})
	public void testLogout(){
		System.out.println("succesfully logged out");
	}
	
	

}
