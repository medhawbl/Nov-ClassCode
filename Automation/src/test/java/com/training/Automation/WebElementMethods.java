package com.training.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementMethods {

WebDriver driver;
	
	@BeforeClass
	public void before(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testElements(){
		
		driver.get("http://whiteboxqa.com/index.php");
		List<WebElement> elements = driver.findElements (By.cssSelector(".fa.fa-twitter"));
		for(WebElement elm:elements){    
			Point point =   elm.getLocation();
			System.out.println("x:;"+point.x);
			System.out.println("x:;"+point.y);
			
			Dimension dim = elm.getSize();
			System.out.println(dim.height);
			System.out.println(dim.width);
		}        
		     
		 
	}
}
