package com.wbl.testng.test;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.wbl.main.BasicString;

public class BasicTest {
	
	/*@Test(invocationCount=20,threadPoolSize=5, invocationTimeOut=200)
	public void test() throws InterruptedException{
		Thread.sleep(300);
		System.out.println("Hello world");
	}
	*/
	/*@Test(enabled=true)
	public void test1() throws InterruptedException{
		Thread.sleep(300);
		System.out.println("time out...");
	}
	
	@Test(expectedExceptions={NullPointerException.class})
	public void test2(){
		BasicString bs = new BasicString();
		bs.stringBasics("hello");
	}
*/
	
	
	@Parameters({"greet","greet1"})
	@Test(priority=0)
	public void test2(String greetString,String greet1){
		BasicString bs = new BasicString();
		bs.stringBasics("hello ");
		System.out.println(greetString);
		System.out.println(greet1);
		Assert.assertEquals(greetString, "helloworld");
		Assert.assertEquals(greet1, "helloworld- today is monday");
		SoftAssert sa = new SoftAssert();//will work like verify
		sa.assertTrue(5>10,"this true statment is  matching");
		//Assert.assertTrue(5>10);
		/*System.out.println("lines after assert failure.........");
		Assert.assertNotNull(null);//hard assertion
		System.out.println("part2 -----lines after assert failure.........");
		Assert.assertEquals("hello", "hello");*/
	}
	

	@Test(priority=1)
	public void test1() throws InterruptedException{
		System.out.println("Second test case!!!!!!!!!");
		Thread.sleep(300);
		System.out.println("time out...");
	}

}
