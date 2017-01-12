package com.training.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstWebDriver {

	@Test
	public void homeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaNovWorkspace\\Automation\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open the browser with given url		
		driver.get("https://www.walmart.com/");
		System.out.println("MainPage::"+driver.getTitle());
		//find the element
		//	By by = By.id("global-search-input");
		WebElement element = driver.findElement(By.id("global-search-input"));
		//perform action
		element.sendKeys("Laptop");
		//assert for the result
		element = driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn"));
		element.click();
		System.out.println("Result::"+driver.getTitle());
		driver.close();
	}

}
