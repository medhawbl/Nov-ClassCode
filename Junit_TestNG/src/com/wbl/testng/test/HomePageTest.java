package com.wbl.testng.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class HomePageTest {
	HomePage hm;
	
	@BeforeClass(groups={"smokeTest","functionalityTest"})
	public void beforeClass(){
		hm= new HomePage();
	}
	
	@Test(groups={"smokeTest","functionaltyTest"})
	public void testLogin(){
		assertEquals("success",hm.doLogin());
	}
	
	@Test(groups={"smokeTest"})
	public void testRecordings(){
		assertEquals("playing",hm.recordings());
	}
	
	@Test(groups={"functionalityTest"})
	public void testPresentations(){
		assertEquals(20,hm.presentations());
	}

}
