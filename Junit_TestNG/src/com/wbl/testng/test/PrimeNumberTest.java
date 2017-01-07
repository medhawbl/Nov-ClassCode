package com.wbl.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.wbl.main.PrimeNumber;

public class PrimeNumberTest extends BaseTest{
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("It executes before every class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("It executes after every class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("It executes before every method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("It executes after every method");
	}
	
	@Test
	public void testIsPrime1(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(5);
		assertEquals(true, result,"there is an error");
	}
	
	@Test
	public void testIsPrime2(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(10);
		assertFalse(result);
	}
	
	@Test
	public void testIsPrime3(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsPrime4(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(0);
		assertTrue(result);
	}

}
