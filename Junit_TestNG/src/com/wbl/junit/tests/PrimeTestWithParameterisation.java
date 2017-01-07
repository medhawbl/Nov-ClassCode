package com.wbl.junit.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wbl.main.PrimeNumber;

@RunWith(Parameterized.class)
public class PrimeTestWithParameterisation {
	
	static PrimeNumber pm;
	
	int input;
	boolean expectedOutput;
	
	//step 2 - executed 6 times
	public PrimeTestWithParameterisation(int input,boolean expectedOutput){
		this.input=input;
		this.expectedOutput=expectedOutput;
	}
	
	//step 1 - - executed once
	@Parameters
	public static Collection dataForTest(){			
		Object[][] testData = {{5,true},{10,false},{1,false},{0,true},{-5,true},{2,true}};
		return Arrays.asList(testData);
	}
	
	@BeforeClass
	public static void beforeClass(){
		pm =  new PrimeNumber();
	}
	
	//step 3-  executed 6 times
	@Test
	public void testIsPrime(){
		
		assertEquals(expectedOutput, pm.isPrime(input));
		
	}

}
