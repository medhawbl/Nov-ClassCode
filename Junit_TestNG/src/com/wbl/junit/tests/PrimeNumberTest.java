package com.wbl.junit.tests;

import com.wbl.main.PrimeNumber;

import junit.framework.TestCase;

public class PrimeNumberTest extends TestCase {
	
	public void setUp(){
		System.out.println("it runs before evry method");
	}
	
	public void tearDown(){
		System.out.println("it runs after evry method");
	}
	
	public void testIsPrime1(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(5);
		assertEquals("there is an error",true, result);
		/*assertNotNull(result);
		assertNull(result);
		assertTrue(result);
		assertFalse(result);*/
	}
	
	public void testIsPrime2(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(10);
		assertEquals(false, result);
	}
	
	public void testIsPrime3(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	public void testIsPrime4(){
		PrimeNumber pm = new PrimeNumber();
		boolean result = pm.isPrime(0);
		assertEquals(true, result);
	}

}
