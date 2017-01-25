package com.training.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class App 
{
    @Test
	public void testApp() throws MalformedURLException{
    	String apkFilePath= System.getProperty("user.dir")+"/resources/xoom.apk";
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.VERSION, "5.1.1");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "22");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "3300f3ccaa2d3371");
		dc.setCapability(MobileCapabilityType.APP, apkFilePath);
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.xoom.android.app");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.xoom.android.app.HomeActivity_");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		driver.unlockDevice();
		
		
		
	}
}
