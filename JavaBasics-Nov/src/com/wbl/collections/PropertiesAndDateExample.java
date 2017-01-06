package com.wbl.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class PropertiesAndDateExample{
	
	public void propertiesExample(){
		
		Properties prop = new Properties();	
		try {
			FileInputStream inputStream = new FileInputStream("C:/Users/WBL/Desktop/prop.properties");
			prop.load(inputStream);
			System.out.println("city:"+prop.getProperty("city"));
			System.out.println("zip:"+prop.getProperty("zip"));
			System.out.println("state:"+prop.getProperty("state"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PropertiesAndDateExample prop = new PropertiesAndDateExample();
		prop.propertiesExample();
		
		Date date = new Date();
		System.out.println("todays date::"+date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		System.out.println(sdf.format(date));

	}

}
