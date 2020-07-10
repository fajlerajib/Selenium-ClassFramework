package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getconfig(String key) throws Throwable {
		
		Properties prop = new Properties(); // Read config file / Note pad file / 
		
		// config file location
		String path = "./Config.properties";
		FileInputStream file = new FileInputStream(path);
		
		// Connection Both
		prop.load(file);
		
		//System.out.println(prop.get(key));
		return prop.get(key).toString();
		
	}

	public static void main (String[]args) throws Throwable {
		
		System.out.println(BaseConfig.getconfig("URL"));
		//BaseConfig.getconfig("Email");
		//BaseConfig.getconfig("Passwordl");
	}
	
	
}
