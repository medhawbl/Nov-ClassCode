package com.wbl.base;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {
	
	@BeforeSuite
	public void beforeSuite(){
		RestAssured.baseURI="https://api.twitter.com/1.1/";
		RestAssured.basePath="account/";
	}

}
