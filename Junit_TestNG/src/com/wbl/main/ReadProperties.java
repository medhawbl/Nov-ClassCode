package com.wbl.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public String propertiesExample(String fileName) throws IOException, FileNotFoundException{
		
		Properties prop = new Properties();	
		FileInputStream inputStream = new FileInputStream("C:/Users/WBL/Desktop/"+fileName);
		prop.load(inputStream);
		System.out.println("city:"+prop.getProperty("city"));
		
		return prop.getProperty("city");
	}

}
