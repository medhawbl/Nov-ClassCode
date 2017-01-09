package com.wbl.testng.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.main.Calculator;

public class CalculatorTest  extends BaseTest {
	

	@BeforeClass
	public void beforeClass(){
		System.out.println("It executes before every class");
	}
	
	@DataProvider(name="testData")
	public Object[][] getData(){
		//to-do- write file reading code and set data from excel to object[][]
		Object[][] data = {{2.0,3.0,'+',5.0},{3.0,0.0,'*',0.0},{5.0,2.0,'-',3.0}};
		return data;
	}
	/*@BeforeMethod
	public void beforeMethod(){
		System.out.println("It executes before every method");
	}
	*/
	
	@Test(dataProvider="testData")
	public void testDoCalc1(double a,double b,char c,double expected){
		Calculator calc = new Calculator();
		double result = calc.doCalc(a,b,c);
		assertEquals(expected,result);
	}
	
	/*@Test
	public void testDoCalc2(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(40, 20, '-');
		assertEquals(20.0,result);
	}
	
	@Test
	public void testDoCalc3(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(0, 0, '%');
		assertEquals(0.0,result);
	}
	
	@Test
	public void testDoCalc4(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(-40, 20, '*');
		assertEquals(-800.0,result);
	}
	
	@Test
	public void testDoCalc5(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(40.56, 0, '*');
		assertEquals(0.0,result);
	}*/
	
	/*@AfterMethod
	public void afterMethod(){
		System.out.println("It executes after every method");
	}
*/
	
	@AfterClass
	public void afterClass(){
		System.out.println("It executes after every class");
	}
	

}
