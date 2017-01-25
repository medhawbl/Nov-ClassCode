package com.training.Automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver driver;
	
	@BeforeClass
	public void before(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testWalmartHomePage() throws InterruptedException{
		
		driver.get("https://www.walmart.com/");
		/*WebElement element = driver.findElement(By.cssSelector(".elc-icon.elc-icon-cart"));
		element.click();*/   
		//List<WebElement> elements = driver.findElements(By.cssSelector("[class*='m-margin-left']"));
		 WebElement element =  driver.findElement(By.id("globaxyl-search-input"));
	          
		  
	}
		/*Assert.assertEquals(elements.s ize(), 4);
		System.out.println("Current url before:"+driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".elc-icon.elc-icon-cart")).click();
		System.out.prin   tln("Current url after:"+driver.getCurrentUrl());
	//	System.out. ("Html code of application::"+driver.getPageSource());
		driver.navigate ().back();//takes back to home page from cart page
		System.out.println("home page title:"+driver.getTitle());
		driver.navigate().forward();//takes forward to cart page from home page
		System.out.println("cart page title:"+driver.getTitle());
		driver.navigate().refresh();//page refresh
		driver.navigate().to("https://www.walmart.com/account/signup");//similar to get method- it loads given page url
		
		
		WebElement element = driver.findElement(By.name("firstName"));
		element.sendKeys("Medha");
		Thread.sleep(500);
		element.clear();//clears the textbox content
		
		List<WebElement> elements1 = driver.findElements(By.className(".validation-group"));
		element = elements1.get(1);
		driver.findElement(By.name("lastName")).sendKeys("K");
		
		System.out.println("elemnt's attribute value::"+element.getAttribute("placeholder"));//First name
		System.out.println("Tag name::"+element.getTagName());//input
		System.out.println("css value::"+element.getCssValue("line-height"));
		
	}
	
	//windowhandles and quit example
	@Test
	public void testWblHomePage(){
		
		driver.get("http://whiteboxqa.com/");
		driver.findElement(By.id("headerfblogin")).click();
		
		String currWindowName = driver.getWindowHandle();//current window name
		
		Set<String> windows = driver.getWindowHandles();//set of all windows that are open 
		for(String win : windows){
			//trying to switch control to child window
			System.out.println("window name::"+win);
			if(win!=currWindowName){
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.id("email")).sendKeys("a@a.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		
		//driver.close();//it just closes current window
		//driver.quit();//it closes all windows/instances of current browser		
	}
	
	*/
	
	
	@AfterClass
	public void after(){
		driver.quit();
	}
	

}
