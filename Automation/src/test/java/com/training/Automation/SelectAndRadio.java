package com.training.Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectAndRadio {

WebDriver driver;
	
	@BeforeClass
	public void before(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shilpi\\git\\Nov-ClassCode\\Automation\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void facbookHome() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Innovapath");
		WebElement element = driver.findElement(By.id("month"));
		
		//Select- to deal with single select drop downs
		Select select = new Select(element);
		select.selectByIndex(0);//index for options starts from 1 not 0
		System.out.println("is multiselect or single select::"+select.isMultiple());
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("23");
		

		select = new Select(driver.findElement(By.id("year")));
		select.selectByValue("2000");
		
		//get all the options in dropdown and display the text
		List<WebElement> options = select.getOptions();
		for(WebElement element1 : options){
			System.out.println(element1.getText());
			//isSelected can be used with select/checkbox or radio button
			System.out.println("is selected::"+element1.isSelected());
		}
		
		WebElement spanElement = driver.findElement(By.id("u_0_c"));
		System.out.println(spanElement.getAttribute("aria-invalid"));
		//radio buttion - find element and click like a simple button
		element = driver.findElement(By.id("u_0_h"));
		element.click();
		System.out.println("is selected::"+element.isSelected());
		
		//isDisplayed is applicable for any element to see if element is displayed in page or not
		System.out.println("is displayed::"+ element.isDisplayed());
		
		//isEnabled - to see if any element is enabled or disabled
		System.out.println("is enabled::"+element.isEnabled());
		
		//multi select dropdowns
		driver.navigate().to("http://wenzhixin.net.cn/p/multiple-select/docs/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		select = new Select(driver.findElement(By.xpath("//*[@id='e1_f']/select")));
		System.out.println("2nd---is multiselect or single select::"+select.isMultiple());
		select.selectByVisibleText("October");
		Thread.sleep(500);
		select.selectByVisibleText("November");
		
		//deselct methods are ap[plicable only for multi select dropdowns where u can select more than one option at a time
		//we cannot use this for single select drop downs
		select.deselectByVisibleText("October");
		
		select.deselectAll();
		
		driver.close();
		
		
		
	}
}
