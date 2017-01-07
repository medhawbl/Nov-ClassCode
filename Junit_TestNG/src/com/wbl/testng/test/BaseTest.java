package com.wbl.testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("It executes before every Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("It executes after every Test");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("It executes before suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("It executes after suite");
	}

}
