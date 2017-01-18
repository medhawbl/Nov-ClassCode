package com.training.Automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsExample {
	
	
	WebDriver driver;

	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testActions(){
		
		try{
		
		driver.get("http://www.ebay.com/");		
		
		System.out.println("before title::"+driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a")));
					
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();// the particular mouse action is executed
		
		element = 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@title='Fashion - Watches']")));
		
		action.moveToElement(element).click().build().perform();//build is to combine the actions together and then execute using perform
		
		
		System.out.println("after title::"+driver.getTitle());
		
		}catch(Exception e){
			  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    
			    try {
					FileUtils.copyFile(file, new File("C:/Users/WBL/Desktop/screenshotFile.png"));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
	}

}
