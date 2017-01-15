package com.training.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Waits {
	
WebDriver driver;
	
@BeforeClass
public void before(){
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
}

	@Test
	public void testExplicitWait(){
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("Laptop");
		WebDriverWait wait = new WebDriverWait(driver,20);
		List<WebElement> elements =wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector(".header-Typeahead-row"))));
		//List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
		System.out.println(elements.size());
		
		for(WebElement elm : elements){
			System.out.println(elm.getText());
			if(elm.getText().equalsIgnoreCase("bundle")){
				elm.click();
				break;
			} 
		}
		   
		driver.close();
	}
	
	/*@Test
	public void walmartHome() throws InterruptedException{
		
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		
		//implicit wait once given is avialble for enitire time browser is open and on any element in page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("Laptop");
		
		driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		
		driver.findElement(By.cssSelector(".chooser-option-current.js-chooser-option-current")).click();
		
		List<WebElement> sortElements = driver.findElements(By.cssSelector(".chooser-option.js-chooser-option"));
		
		System.out.println(sortElements.get(2).getText());
		
		sortElements.get(2).click();
		Thread.sleep(1000);;
		
		System.out.println(driver.getTitle());
		
		driver.close();
		 
	}
	*/
	
	

}
