package com.wbl.test;

// static imports - u r importing all static methods at once
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wbl.main.PrimeNumber;

public class PrimeNumberTest2{
	static PrimeNumber pm ;
	
	@BeforeClass
	public static void beforeClass(){
		 pm = new PrimeNumber();
		System.out.println("it runs once  before all methods");
	}
	
	@AfterClass
	public  static void afterClass(){
		System.out.println("it runs once  after all methods");
	}
	
	@Before
	public void beforeMethod(){
		System.out.println("it runs before evry method");
	}
	
	@After
	public void afterMethod(){
		System.out.println("it runs after evry method");
	}
	
	@Test
	public void isPrime1Test(){		
		boolean result = pm.isPrime(5);
		assertEquals(true, result);
	}
	
	@Test
	public void testIsPrime2(){		
		boolean result = pm.isPrime(10);
		assertEquals(false, result);
	}
	
	@Ignore
	@Test
	public void testIsPrime3(){
		
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	@Test(timeout=200)// the method should execute in given time
	public void testIsPrime4(){		
		boolean result = pm.isPrime(0);
		assertEquals(true, result);
	}

}
